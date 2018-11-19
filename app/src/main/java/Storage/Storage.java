package Storage;

public class Storage {
    //数据存储数组
    private int[] cells = new int[10];
    //inPos表示存入时数组下标，outPos表示取出时数组下标
    private int inPos, outPos;
    private int count;//存入或者取出数据的数量

    //定义一个put()方法向数组中存入数据
    public synchronized void put(int num) {
        try {
            while (count == cells.length) {
                //如果放入数据等于cells的长度，此线程等待
                this.wait();

            }
            cells[inPos] = num;
            System.out.println("在cells[" + inPos + "]中存入数据---" + cells[inPos]);
            inPos++;
            if (inPos == cells.length) {
                inPos = 0;
            }
            count++;
            this.notify();//每操作一次数据，便调用一次notify()方法唤醒对应同步锁上等待的线程;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //定义一个get()方法从数组中取出数据
    public synchronized void get() {
        try {
            while (count == 0) {
                this.wait();
            }
            int data = cells[outPos];
            System.out.println("从cells[" + outPos + "]中取出数据" + data);
            cells[outPos] = 0;//取出后，当前位置的数据置为0
            outPos++;
            if (outPos == cells.length) {
                outPos = 0;
            }
            count--;
            this.notify();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
