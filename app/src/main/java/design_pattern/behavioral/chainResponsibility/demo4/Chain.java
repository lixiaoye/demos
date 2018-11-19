package design_pattern.behavioral.chainResponsibility.demo4;

/**
 * Created by LIXIAOYE on 2018/11/17.
 */

public interface Chain {
    public abstract void setNext(Chain nextInChain);

    public abstract void process(Number request);
}
