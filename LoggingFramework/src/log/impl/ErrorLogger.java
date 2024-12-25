package log.impl;

import log.AbstractLogger;
import sink.LogSubject;

public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level){
        this.level = level;
    }
    @Override
    protected void display(String message, LogSubject logSubject) {
        System.out.println("ERROR : "+message);
        logSubject.notifyAllObservers(level,message);
    }
}
