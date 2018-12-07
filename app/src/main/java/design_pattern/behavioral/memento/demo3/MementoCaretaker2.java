package design_pattern.behavioral.memento.demo3;

import java.util.ArrayList;

/**
 * 负责人类：
 */

public class MementoCaretaker2 {
    //定义一个集合来存储多个备忘录
    private ArrayList mementoList = new ArrayList();

    public ChessmanMemento getMemento(int i) {
        return (ChessmanMemento) mementoList.get(i);
    }
    public void setMemento(ChessmanMemento memento){
        mementoList.add(memento);
    }
}
