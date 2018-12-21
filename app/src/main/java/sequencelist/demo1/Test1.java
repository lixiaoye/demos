package sequencelist.demo1;

/**
 * Created by LIXIAOYE on 2018/12/20.
 */

public class Test1 {
    static int[] arr;
    static int len;

    static {
        //顺序表
        arr = new int[]{18, 11, 17, 22, 7, 10, 50, 28};
        len = arr.length;
    }

    public static void main(String[] args) {
        int obj = (int) remove(6);
        System.out.println("被删除的元素为："+obj);
        System.out.println("删除元素后的数组为："+arr.toString());
    }

    private static Object remove(int i) {
        //第i个元素的下标为i-1
        Object obj;
        if (i < 1 || i > len) {
            System.out.println("删除位置不正确");
            return null;
        }
        obj = arr[i - 1];//先将第i个元素暂存起来
        for (int j = i; j < len; j++) {
            arr[j - 1] = arr[j];
        }
        len--;
        return obj;
    }
}
