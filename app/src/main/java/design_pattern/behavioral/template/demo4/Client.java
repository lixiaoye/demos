package design_pattern.behavioral.template.demo4;


/**
 * Created by LIXIAOYE on 2018/12/25.
 */

public class Client {
    public static void main(String[] args) {
        CrossCompiler iphone = new IPhoneCompiler();
        iphone.crossCompile();
        CrossCompiler android = new AndroidCompiler();
        android.crossCompile();
    }
}
