package design_pattern.behavioral.state.demo1;

/**
 * 环境类：
 * 环境类维持一个对抽象状态类的引用，通过setState()方法可以向环境类注入不同的状态对象，
 * 再在环境类的业务方法中调用状态对象的方法
 * 此时，环境类还充当了状态管理器（State Manager）角色，在环境类的业务方法中通过对某些属性值的判断实现状态转换，
 * 还可以提供一个专门的方法用于实现属性判断和状态转换，
 */

public class Context {
    private State state;//维持一个对抽象状态对象的引用
    private int value;//其他属性值，该属性值的变化可能会导致对象状态发生变化

    //设置状态对象
    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public void request() {
        //其他代码
        state.handle();//调用状态对象的业务方法
        //其他代码
    }

    /**
     * 法一：
     * 统一由环境类来负责状态之间的转换
     */
    public void changeState() {
        //判断属性值，根据属性值进行状态转换
        if (value == 0) {
            this.setState(new ConcreteStateA());
        } else if (value == 1) {
            this.setState(new ConcreteStateB());
        }
        //.....
    }

    /**
     * 法二：
     * 由具体状态类来负责状态之间的转换
     */
    public void changeState(Context context) {
        //根据环境对象中的属性值进行状态转换
        if (context.getValue() == 1) {
            context.setState(new ConcreteStateB());
        } else if (context.getValue() == 2) {
            context.setState(new ConcreteStateC());
        }
        //......
    }
}
