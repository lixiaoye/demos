package design_pattern.behavioral.memento.demo2;

/**
 * 客户端测试代码
 */

public class Client {
    public static void main(String[] args) {
        //构件游戏对象
        CallOfDuty game = new CallOfDuty();
        //1.打游戏
        game.play();

        Caretaker caretaker = new Caretaker();
        //2.游戏存档
        caretaker.archive(game.createMemento());
        //3.退出游戏
        game.quit();
        //4.恢复游戏
        CallOfDuty newGame = new CallOfDuty();
        newGame.restore(caretaker.getMemento());
    }
}
