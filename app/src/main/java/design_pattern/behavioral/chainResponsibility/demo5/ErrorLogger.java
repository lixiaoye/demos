package design_pattern.behavioral.chainResponsibility.demo5;

/**
 * Create concrete classes extending the logger:ErrorLogger
 */

public class ErrorLogger extends AbstractLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger:" + message);
    }
}
