package data_structure.finalDemo.demo1;

/**
 * Created by LIXIAOYE on 2019/1/5.
 */

public class FinalTest {
    private final void finalFunc() {
        System.out.println("I am final method...");
    }
    private void method1(){
        final StringBuffer sb=new StringBuffer("java堆0x100");
//        sb= new StringBuffer("java堆0x001");//报错
        sb.append("hha ");
    }
}
