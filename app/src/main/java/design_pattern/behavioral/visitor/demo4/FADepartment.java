package design_pattern.behavioral.visitor.demo4;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//财务部类：具体访问者类
public class FADepartment extends Department {
    //财务部对全职员工的访问
    @Override
    public void visit(FulltimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double weekWage = employee.getWeeklyWage();
        if (workTime > 40) {
            weekWage += (workTime - 40) * 100;
        } else if (workTime < 40) {
            weekWage -= (40 - workTime) * 80;
            weekWage = weekWage > 0 ? weekWage : 0;
        }
        System.out.println("正式员工:" + employee.getName() + "实际工资为：" + weekWage + "元。");
    }

    //实现财务部对兼职员工的访问
    @Override
    public void visit(ParttimeEmployee employee) {
        int workTime = employee.getWorkTime();
        double hourWage = employee.getHourWage();
        System.out.println("临时工:" + employee.getName() + "实际工资为：" + workTime * hourWage + "元。");
    }
}
