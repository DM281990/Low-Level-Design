import strategy.impl.LeakyBucket;
import strategy.impl.SlidingWindow;
import strategy.impl.TokenBucket;
import user.UserBucketCreator;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        testLeakyBucketAlgorithm();
        testSlidingWindowAlgorithm();
        testTokenBucketAlgorithm();
    }

    private static void testLeakyBucketAlgorithm() {
        UserBucketCreator userBucketCreator = new UserBucketCreator(1,new LeakyBucket(10));
        ExecutorService executors = Executors.newFixedThreadPool(12);
        for(int i=0;i<12;i++){
            executors.execute(()->userBucketCreator.accessApplication(1));
        }
        executors.shutdown();
        ;
    }
    private static void testSlidingWindowAlgorithm() {
        UserBucketCreator userBucketCreator = new UserBucketCreator(1,new SlidingWindow(10,10));
        ExecutorService executors = Executors.newFixedThreadPool(12);
        for(int i=0;i<12;i++){
            executors.execute(()->userBucketCreator.accessApplication(1));
        }
        executors.shutdown();
        ;
    }

    private static void testTokenBucketAlgorithm() {
        UserBucketCreator userBucketCreator = new UserBucketCreator(1,new TokenBucket(10,10));
        ExecutorService executors = Executors.newFixedThreadPool(12);
        for(int i=0;i<12;i++){
            executors.execute(()->userBucketCreator.accessApplication(1));
        }
        executors.shutdown();
        ;
    }
}