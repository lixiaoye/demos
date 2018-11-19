package design_pattern.behavioral.chainResponsibility.demo5;

/**
 * Create concrete classes extending the logger:FileLogger
 */

public class FileLogger extends AbstractLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File:Logger:" + message);
    }
}
