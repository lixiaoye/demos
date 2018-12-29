package design_pattern.behavioral.visitor.demo1;

/**
 * Created by LIXIAOYE on 2018/12/26.
 */
//CEO访问者，只关注业绩
public class CEOVisitor implements Visitor {
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.name + ",KPI:" + engineer.kpi);
    }

    @Override
    public void visit(Manager leader) {
        System.out.println("经理：" + leader.name + ",KPI:" + leader.kpi + ",新产品数量：" + leader.getProducts());
    }
}
