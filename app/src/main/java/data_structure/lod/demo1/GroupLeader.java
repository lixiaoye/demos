package data_structure.lod.demo1;

import java.util.List;

/**
 * Created by LIXIAOYE on 2018/11/2.
 */

public class GroupLeader {
    private List<Girl> listGirls;

    /**
     *GroupLeader类中定义一个构造函数，通过构造函数传递依赖关系
     传递全班的女生进来
     */
    public GroupLeader(List<Girl> _listGirls) {
        this.listGirls = _listGirls;
    }

    //清查女生数量
    public void countGirls() {
        System.out.println("女生数量：" + this.listGirls.size());
    }
}
