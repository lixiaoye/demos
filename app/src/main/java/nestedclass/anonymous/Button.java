package nestedclass.anonymous;

/**
 * Created by lixiaoye on 2019/3/13.
 */

public class Button {
    public void click(final int params) {
        //匿名内部类，实现的是ActionListener接口
        new ActionListener() {

            @Override
            public void onAction() {
                System.out.println("click action..." + params);
            }
        }.onAction();
    }

    //匿名内部类
    public interface ActionListener {
        void onAction();
    }

    public static void main(String[] args) {
        Button btn = new Button();
        btn.click(2);
    }
    /**
     * 打印结果：
     click action...2
     */
}
