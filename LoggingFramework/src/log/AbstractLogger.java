package log;

import sink.LogSubject;

public abstract class AbstractLogger {
    public int level;
    AbstractLogger nextLogger;

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public AbstractLogger getNextLogger() {
        return nextLogger;
    }

    public void setNextLogger(AbstractLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message,LogSubject logSubject){
        if(this.level ==level){
            display(message,logSubject);
        }
        if(nextLogger !=null){
            nextLogger.logMessage(level,message,logSubject);
        }
    }
    protected abstract void display(String message, LogSubject logSubject);
}
