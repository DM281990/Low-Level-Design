package log.impl;

import log.AbstractLogger;
import sink.LogSubject;

public class DebugLogger extends AbstractLogger {

    public DebugLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String message, LogSubject logSubject) {
        System.out.println("DEBUG : "+message);
        logSubject.notifyAllObservers(level,message);
    }
}
