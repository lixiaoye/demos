package design_pattern.behavioral.chainResponsibility.demo4;

/**
 * Created by LIXIAOYE on 2018/11/17.
 */

public class ZeroProcessor implements Chain {
    private Chain nextInChain;

    @Override
    public void setNext(Chain nextInChain) {
        this.nextInChain = nextInChain;
    }

    @Override
    public void process(Number request) {
        if (request.getNumber() == 0) {
            System.out.println("ZeroProcessor:" + request.getNumber());
        } else {
            nextInChain.process(request);
        }

    }
}
