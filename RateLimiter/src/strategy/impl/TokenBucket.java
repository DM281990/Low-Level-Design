package strategy.impl;

import strategy.RateLimiter;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public class TokenBucket implements RateLimiter {
    int refreshRate;
    int bucketCapacity;
    private final AtomicInteger currentCapacity=new AtomicInteger();
    private final AtomicLong lastUpdatedTime=new AtomicLong();

    public TokenBucket(int bucketCapacity, int refreshRate) {
        this.bucketCapacity = bucketCapacity;
        this.refreshRate = refreshRate;
        currentCapacity.getAndSet(bucketCapacity);
        lastUpdatedTime.getAndSet(System.currentTimeMillis());
    }

    @Override
    public boolean grantAccess() {
        refreshBucket();
       if(currentCapacity.get()>0){
           currentCapacity.decrementAndGet();
           return true;
       }
       return false;
    }

    private void refreshBucket() {
        long currentTime = System.currentTimeMillis();
        int additionalToken = (int)(currentTime - lastUpdatedTime.get())/1000*refreshRate;
        int currCapacity = Math.min(currentCapacity.get()+additionalToken,bucketCapacity);
        currentCapacity.getAndSet(currCapacity);
        lastUpdatedTime.getAndSet(currentTime);
    }
}
