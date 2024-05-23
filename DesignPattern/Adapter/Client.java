package DesignPattern.Adapter;

public class Client {
    public static void main(String[] args) {
        ILogger logger = new AWSLoggerAdapter();
        logger.log("Sending Logs : Hello World");
    }
}
