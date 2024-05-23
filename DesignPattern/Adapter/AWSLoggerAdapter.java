package DesignPattern.Adapter;

public class AWSLoggerAdapter implements ILogger {

    AWSLoggerAPI awsLogger = new AWSLoggerAPI();

    @Override
    public void log(String message) {
        awsLogger.printLogs(message);
    }
}
