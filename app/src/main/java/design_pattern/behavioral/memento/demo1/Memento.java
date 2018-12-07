package design_pattern.behavioral.memento.demo1;

/**
 * 备忘录类，默认可见性，包内可见
 * 在设计备忘录类时需要考虑其封装性，除了Originator类，不允许其他类来调用备忘录类Memento的构造函数与相关方法，
 *
 */

public class Memento {
    private String state;

    public Memento(Originator o) {
        this.state = o.getState();
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }
}
