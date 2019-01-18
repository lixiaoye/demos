package design_pattern.structural_pattern.decorator.demo;

/**
 * Created by LIXIAOYE on 2019/1/14.
 */

public abstract class Decorator extends Component {
    private Component component;//持有一个Component对象的引用

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operate() {
        component.operate();
    }
}
