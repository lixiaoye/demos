package design_pattern.behavioral.visitor.demo1;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Client {
    public static void main(String[] args) {
        //构建报表
        BusinessReport report = new BusinessReport();
        System.out.println("---给CEO看的报表----");
        //设置访问者，这里是CEO
        report.showReport(new CEOVisitor());
        System.out.println("\n======给CTO看的报表=====");
        //注入另一个访问者，CTO
        report.showReport(new CTOVisitor());
    }
    /**
     * 打印结果：
     ---给CEO看的报表----
     经理：王经理,KPI:6,新产品数量：2
     工程师：工程师-russell wong,KPI:5
     工程师：工程师-Jane,KPI:6
     工程师：工程师-Kael,KPI:1
     工程师：工程师-Tiiime,KPI:6
     工程师：工程师-Amy Tan,KPI:9

     ======给CTO看的报表=====
     经理：王经理产品数量：2
     工程师：工程师-russell wong,代码函数：13562
     工程师：工程师-Jane,代码函数：55386
     工程师：工程师-Kael,代码函数：23037
     工程师：工程师-Tiiime,代码函数：60411
     工程师：工程师-Amy Tan,代码函数：58186

     */
}
