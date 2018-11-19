package data_structure.lod.demo1;

/**
 * Created by LIXIAOYE on 2018/11/2.
 */

public class Teacher {
    //老师对班长发布命令，清一下女生人数
    public void commond(GroupLeader groupLeader) {
        //告诉班长开始执行清查任务
        groupLeader.countGirls();
    }
}
