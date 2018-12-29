package design_pattern.behavioral.visitor.demo4;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */

public class Client {
    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        Employee fte1, fte2, fte3, pte1, pte2;

        fte1 = new FulltimeEmployee("斯嘉丽", 3200.00, 45);
        fte2 = new FulltimeEmployee("巴特勒", 2000.00, 40);
        fte3 = new FulltimeEmployee("Russell wong", 2400.00, 38);
        pte1 = new ParttimeEmployee("wongleehom", 80.00, 20);
        pte2 = new ParttimeEmployee("mingna_wen", 60.00, 18);

        list.addEmployee(fte1);
        list.addEmployee(fte2);
        list.addEmployee(fte3);
        list.addEmployee(pte1);
        list.addEmployee(pte2);

        Department dep;
        dep = (Department) XMLUtil.getBean();
        list.accept(dep);
    }
    /**
     * 打印结果：
     正式员工:斯嘉丽实际工资为：3700.0元。
     正式员工:巴特勒实际工资为：2000.0元。
     正式员工:Russell wong实际工资为：2240.0元。
     临时工:wongleehom实际工资为：1600.0元。
     临时工:mingna_wen实际工资为：1080.0元。
     */
}
