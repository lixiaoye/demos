package design_pattern.structural_pattern.proxy.demo3;

import java.lang.reflect.Proxy;

import design_pattern.structural_pattern.proxy.demo2.ILawsuit;
import design_pattern.structural_pattern.proxy.demo2.XiaoMin;

/**
 * Created by LIXIAOYE on 2019/1/11.
 */

public class Test {
    public static void main(String[] args) {
        ILawsuit xiaomin=new XiaoMin();
        //构造一个动态代理
        DynamicProxy proxy=new DynamicProxy(xiaomin);
        //获取被代理类小民的ClassLoader
        ClassLoader loader=xiaomin.getClass().getClassLoader();
        //动态构造一个代理者律师
        ILawsuit lawyer= (ILawsuit) Proxy.newProxyInstance(loader,new Class[]{ILawsuit.class},proxy);
        //律师提交诉讼申请
        lawyer.submit();
        //律师进行举证
        lawyer.burden();
        //律师代替小民进行辩护
        lawyer.defend();
        //完成诉讼
        lawyer.finish();
    }
}
