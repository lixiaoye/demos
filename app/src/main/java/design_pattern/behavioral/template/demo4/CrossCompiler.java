package design_pattern.behavioral.template.demo4;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public abstract class CrossCompiler {
    public final void crossCompile() {
        collectSource();
        compileToTarget();
    }

    protected abstract void collectSource();

    protected abstract void compileToTarget();
}
