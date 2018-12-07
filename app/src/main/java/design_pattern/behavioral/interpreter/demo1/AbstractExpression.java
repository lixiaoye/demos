package design_pattern.behavioral.interpreter.demo1;

/**
 * 抽象表达式
 */

public abstract class AbstractExpression {
    /**
     * 抽象的解析方法
     * @param context 上下文环境对象
     */
    public abstract void interpret(Context context);
}
