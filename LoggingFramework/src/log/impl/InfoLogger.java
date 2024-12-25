package log.impl;

import log.AbstractLogger;
import sink.LogSubject;

public class InfoLogger extends AbstractLogger {

    public InfoLogger(int level){
        this.level = level;
    }

    @Override
    protected void display(String message, LogSubject logSubject) {
        System.out.println("INFO : "+message);
        logSubject.notifyAllObservers(level,message);
    }
}
