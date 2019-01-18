package design_pattern.structural_pattern.proxy.demo2;

/**
 * 诉讼接口类
 */
public interface ILawsuit {
    //提交申请
    void submit();

    //进行举证
    void burden();

    //开始辩护
    void defend();

    //诉讼完成
    void finish();
}
