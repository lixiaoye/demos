package design_pattern.behavioral.iterator.demo1;

/**
 * 迭代器接口
 */

public interface Iterator<T> {
    /**
     * 是否还有下一个元素
     * @return true：有，false:没有
     */
    boolean hasNext();

    /**
     * 返回当前位置的元素并将位置移至下一位
     * @return
     */
    T next();
}
