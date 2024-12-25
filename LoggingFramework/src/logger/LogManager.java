package logger;

import log.AbstractLogger;
import log.impl.DebugLogger;
import log.impl.ErrorLogger;
import log.impl.InfoLogger;

public class LogManager {
    public static AbstractLogger buildChainOfLogger(){
        AbstractLogger infoLogger = new InfoLogger(1);
        AbstractLogger errorLogger = new ErrorLogger(2);
        AbstractLogger debugLogger = new DebugLogger(3);
        infoLogger.setNextLogger(errorLogger);
        errorLogger.setNextLogger(debugLogger);
        return infoLogger;
    }
}
