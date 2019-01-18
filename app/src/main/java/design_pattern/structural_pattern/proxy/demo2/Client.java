package design_pattern.structural_pattern.proxy.demo2;

/**
 * 客户类
 */
public class Client {
    public static void main(String[] args) {
        //构造一个具体诉讼人
        ILawsuit xiaomin = new XiaoMin();
        //构造一个代理律师并将小民作为构造参数传入
        ILawsuit lawyer = new Lawyer(xiaomin);
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
