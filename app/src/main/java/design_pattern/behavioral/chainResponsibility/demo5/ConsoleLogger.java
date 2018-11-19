package design_pattern.behavioral.chainResponsibility.demo5;

/**
 * Create concrete classes extending the logger:ConsoleLogger.java
 */

public class ConsoleLogger extends AbstractLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger:" + message);
    }
}
