package sink.manager;

import sink.LogSubject;
import sink.impl.ConsoleLogger;
import sink.impl.FileLogger;

public class SinkManager {
    public static LogSubject buildSubject(){
        LogSubject logSubject = new LogSubject();
        ConsoleLogger consoleLogger = new ConsoleLogger();
        FileLogger fileLogger = new FileLogger();
        logSubject.addObserver(1,consoleLogger);
        logSubject.addObserver(2,fileLogger);
        logSubject.addObserver(3,consoleLogger);
        logSubject.addObserver(3,fileLogger);
        return logSubject;
    }
}
