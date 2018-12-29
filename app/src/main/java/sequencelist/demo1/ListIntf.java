package sequencelist.demo1;

/**
 * Created by LIXIAOYE on 2018/12/28.
 */

public interface ListIntf {
    public int size();//返回表的长度

    public void clear();//重置为空表

    public boolean isEmpty();//若为空表,则返回true，否则返回false

    public Object get(int i);//返回第i个数据元素的值（返回类型可以不同);

    public int indexOf(Object obj);//第1个与obj满足关系equals()的数据元素的位序，若不存在则返回值为-1

    public Object getPre(Object obj);//若obj是表中的元素，返回的是它的前驱

    public Object getNext(Object obj);//若obj是表中的元素，返回的是它的后继

    public void insertElementAt(Object obj, int i);//在第i个位置之前插入新的数据元素obj，表长度加1

    public Object remove(int i);//删除第i个数据元素，并返回其值，表长度减1

    public Object remove(Object obj);//删除数据元素obj，并返回其值，表长度减1
}
