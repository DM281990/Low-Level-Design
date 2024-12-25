package strategy;

public interface RateLimiter {
    boolean grantAccess();
}
