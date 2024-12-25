package user;

import strategy.RateLimiter;

import java.util.HashMap;
import java.util.Map;

public class UserBucketCreator {
    Map<Integer, RateLimiter> bucket;

    public UserBucketCreator(int id, RateLimiter rateLimiterStrategy) {
        this.bucket = new HashMap<>();
        bucket.put(id,rateLimiterStrategy);
    }

    public void accessApplication(int id){
        if(bucket.get(id).grantAccess()){
            System.out.println("Able to access application");
        }else{
            System.out.println("Too many request. Please try after sometime");
        }
    }

}
