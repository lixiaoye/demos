package design_pattern.behavioral.visitor.demo1;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//员工业务报表1类
public class BusinessReport {
    List<Staff> mStaffs = new LinkedList<Staff>();

    public BusinessReport() {
        mStaffs.add(new Manager("王经理"));
        mStaffs.add(new Engineer("工程师-russell wong"));
        mStaffs.add(new Engineer("工程师-Jane"));
        mStaffs.add(new Engineer("工程师-Kael"));
        mStaffs.add(new Engineer("工程师-Tiiime"));
        mStaffs.add(new Engineer("工程师-Amy Tan"));
    }

    /**
     * 为访问者展示报表
     *
     * @param visitor 公司高层，如CEO,CTO
     */
    public void showReport(Visitor visitor) {
        for (Staff staff : mStaffs) {
            staff.accept(visitor);
        }
    }

}
