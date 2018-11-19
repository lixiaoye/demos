package design_pattern.creational.singleton.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2018/11/5.
 */
//公司类
public class Company {
    private List<Staff> allStaffs = new ArrayList<Staff>();

    public void addStaff(Staff per) {
        allStaffs.add(per);
    }

    public void showAllStaffs() {
        for (Staff per : allStaffs) {
            System.out.println("Obj:" + per.toString());
        }
    }
}


