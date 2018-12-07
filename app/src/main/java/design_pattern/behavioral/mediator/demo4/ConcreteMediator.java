package design_pattern.behavioral.mediator.demo4;

/**
 * 具体中介者
 */

public class ConcreteMediator extends Mediator{
    //维持对各个同事对象的引用
    public Button addButton;
    public List list;
    public TextBox userNameTextBox;
    public ComboBox cb;
    //封装同事对象之间的交互
    @Override
    public void componentChanged(Component component) {
        //单击按钮
        if (component==addButton){
            System.out.println("----单击增加按钮----");
            list.update();
            cb.update();
            userNameTextBox.update();
        }else if (component==list) {
            //从列表框选择客户
            System.out.println("---从列表框选择客户");
            cb.select();
            userNameTextBox.setText();
        }
//        }else if(){}
    }
}
