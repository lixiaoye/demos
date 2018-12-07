package design_pattern.behavioral.memento.demo2;

/**
 * 备忘录类:存储CallOfDuty对象的字段
 * 这是一个无状态、无操作的实体类，只负责用来存储Originator角色的一些数据，
 * 防止外部直接访问Originator.
 *
 */

public class Memento {
    public int mCheckpoint;
    public int mLifeValue;
    public String mWeapon;

    @Override
    public String toString() {
        return "Memento [mCheckpoint=" + mCheckpoint + ",mLifeValue=" + mLifeValue +
                ",mWeapon=" + mWeapon + "]";
    }
}
