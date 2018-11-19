package design_pattern.creational.singleton.demo1;

/**
 * Created by LIXIAOYE on 2018/11/5.
 */

public class Test {
    public static void main(String[] args) {
        Company company = new Company();
        //ceo对象只能通过getCeo函数获取
        Staff ceo1 = CEO.getCeo();
        Staff ceo2 = CEO.getCeo();
        company.addStaff(ceo1);
        company.addStaff(ceo2);
        //通过new创建VP对象
        Staff vp1 = new VP();
        Staff vp2 = new VP();
        //通过new创建Staff对象
        Staff staff1 = new Staff();
        Staff staff2 = new Staff();
        Staff staff3 = new Staff();

        company.addStaff(vp1);
        company.addStaff(vp2);
        company.addStaff(staff1);
        company.addStaff(staff2);
        company.addStaff(staff3);

        company.showAllStaffs();
        /**
         * 打印结果：
         Obj:design_pattern.creational.singleton.demo1.CEO@4554617c
         Obj:design_pattern.creational.singleton.demo1.CEO@4554617c
         Obj:design_pattern.creational.singleton.demo1.VP@74a14482
         Obj:design_pattern.creational.singleton.demo1.VP@1540e19d
         Obj:design_pattern.creational.singleton.demo1.Staff@677327b6
         Obj:design_pattern.creational.singleton.demo1.Staff@14ae5a5
         Obj:design_pattern.creational.singleton.demo1.Staff@7f31245a
         */
    }
}
