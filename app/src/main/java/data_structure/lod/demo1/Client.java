package data_structure.lod.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by LIXIAOYE on 2018/11/2.
 */

public class Client {
    public static void main(String[] args) {
        List<Girl> listGirls = new ArrayList<Girl>();
        for (int i = 0; i < 20; i++) {
            listGirls.add(new Girl());
        }
        Teacher teacher = new Teacher();
        //GroupLeader中增加对Girl的注入，避开Teacher类对陌生类Girl的访问，降低系统间的耦合，提高系统的健壮性。
        teacher.commond(new GroupLeader(listGirls));
    }
}
