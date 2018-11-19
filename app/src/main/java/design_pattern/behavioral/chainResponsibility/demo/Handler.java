package design_pattern.behavioral.chainResponsibility.demo;

/**
 * 抽象处理者.
 */

public abstract class Handler {
    //维持对下家的引用
    protected Handler successor;//下一节点的处理者

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    /**
     * 请求处理
     *
     * @param condition 请求条件
     */
    public abstract void handleRequest(String condition);
}
