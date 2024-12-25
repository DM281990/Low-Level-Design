package sink.impl;

import sink.LogObserver;

public class FileLogger extends LogObserver {
    @Override
    public void log(String message){
        System.out.println("FILE :"+message);
    }
}
