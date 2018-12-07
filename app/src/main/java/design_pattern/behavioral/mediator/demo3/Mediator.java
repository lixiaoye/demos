package design_pattern.behavioral.mediator.demo3;

/**
 * Mediator interface.
 */

public interface Mediator {
    public void send(String message, Colleague colleague);
}
