package design_pattern.behavioral.memento.demo3;

/**
 * Created by LIXIAOYE on 2018/11/29.
 */

public class Client2 {
    private static int index = -1;//定义一个索引来记录当前状态所在位置
    private static MementoCaretaker2 mementoCaretaker2 = new MementoCaretaker2();

    public static void main(String[] args) {
        Chessman chessman = new Chessman("车", 1, 1);
        play(chessman);
        chessman.setY(4);
        play(chessman);
        chessman.setX(5);
        play(chessman);
        undo(chessman, index);
        undo(chessman, index);
        redo(chessman, index);
        redo(chessman, index);
    }

    //下棋
    public static void play(Chessman chessman) {
        mementoCaretaker2.setMemento(chessman.save());//保存备忘录
        index++;
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行 第" + chessman.getY() + "列。");
    }

    //悔棋
    public static void undo(Chessman chessman, int i) {
        System.out.println("***********悔棋***********");
        index--;
        chessman.restore(mementoCaretaker2.getMemento(i - 1));//撤销到上一个备忘录
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行 第" + chessman.getY() + "列。");
    }

    //撤销悔棋
    public static void redo(Chessman chessman, int i) {
        System.out.println("*********撤销悔棋*********");
        index++;
        chessman.restore(mementoCaretaker2.getMemento(i + 1));//恢复到下一个备忘录
        System.out.println("棋子" + chessman.getLabel() + "当前位置为：" + "第" + chessman.getX() + "行 第" + chessman.getY() + "列。");
    }
}


















