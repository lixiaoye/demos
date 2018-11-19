package design_pattern.behavioral.observer.demo3;

/**
 * 客户端测试代码
 */

public class Client {
    public static void main(String[] args) {
        //定义观察目标对象
        AllyControlCenter allyControlCenter = new ConcreteAllyControlCenter("金庸群侠");
        //定义四个观察者对象
        Observer player1, player2, player3, player4;
        player1 = new Player("杨过");
        allyControlCenter.join(player1);
        player2 = new Player("令狐冲");
        allyControlCenter.join(player2);
        player3 = new Player("张无忌");
        allyControlCenter.join(player3);
        player4 = new Player("段誉");
        allyControlCenter.join(player4);
        //某个成员遭受攻击
        player1.beAttacked(allyControlCenter);
    }
}
