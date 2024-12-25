package logger;

import log.AbstractLogger;
import sink.LogSubject;
import sink.manager.SinkManager;

import java.io.Serializable;

import static logger.LogManager.buildChainOfLogger;
import static sink.manager.SinkManager.buildSubject;

public class Logger implements Cloneable , Serializable {
    private volatile static Logger loggerObject;
    private volatile static AbstractLogger chainOfLogger;
    private volatile static LogSubject logSubject;

    private Logger(){
        if(loggerObject!=null){
            throw new IllegalStateException("Object already created");
        }
    }

    public static Logger getInstance(){
        if(loggerObject ==null){
            synchronized (Logger.class){
                if(loggerObject==null){
                    loggerObject = new Logger();
                    chainOfLogger = buildChainOfLogger();
                    logSubject = buildSubject();
                }
            }
        }
        return  loggerObject;
    }

    public Object readResolve(){
        return loggerObject;
    }

    private void createLog(int level, String message){
        chainOfLogger.logMessage(level,message,logSubject);
    }

    public void info(String message){
        createLog(1,message);
    }
    public void error(String message){
        createLog(2,message);
    }
    public void debug(String message){
        createLog(3,message);
    }
}
