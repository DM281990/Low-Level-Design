package sink.impl;

import sink.LogObserver;

public class ConsoleLogger extends LogObserver {
    @Override
    public void log(String message){
        System.out.println("CONSOLE :"+message);
    }
}
