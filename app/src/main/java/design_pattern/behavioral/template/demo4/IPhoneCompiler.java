package design_pattern.behavioral.template.demo4;

/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class IPhoneCompiler extends CrossCompiler {
    @Override
    protected void collectSource() {
        //anything specific to this class
    }

    @Override
    protected void compileToTarget() {
        //iphone specific compilation
    }
}
