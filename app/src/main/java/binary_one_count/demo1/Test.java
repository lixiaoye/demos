package binary_one_count.demo1;

/**
 * Created by LIXIAOYE on 2019/2/12.
 */

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        int num = 5;
        System.out.println("count=" + test.method1(num));
        System.out.println("count=" + test.method2(num));
        System.out.println("count=" + test.method3(num));
    }

    /**
     * 思路：把一个整数与1做&运算，若最低位是1则结果为1，否则是0；
     * 问题：如果n是负数，则为造成死循环
     *
     * @param n
     * @return
     */
    public int method1(int n) {
        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }
            n = n >> 1;//右移等价于/2,但是位移效率高
        }
        return count;
    }

    /**
     * 思路：左移。n不动，将1左移一位，继续与n比较
     * 缺陷：此解法的循环次数等于整数二进制的位数，32位的整数需要循环32次.
     *
     * @param n
     * @return
     */
    public int method2(int n) {
        int count = 0;
        int flag = 1;
        while (flag <= n) {
            if ((n & flag) !=0) {
                count++;
            }
            flag = flag << 1;//左移1位
        }
        return count;
    }

    /**
     * 思路：
     * 1.把一个整数减去1，都是把最右边的1变成0.如果它的右边还有0的话，
     * 则所有0都变成1，而它的左边所有位都保持不变。
     * 2.把一个整数和它减去1的结果做位&运算，都相当于把它最右边的1变成0。
     * 例如：1100减去1结果为1011，将1100&1011=1000，即将1100的最右边的1变成0.
     * 即：把一个整数减去1，再和原整数做&运算，会把该整数最右边的一个1变成0.
     * 也就是说一个整数的二进制表示中有多少个1，就可以进行多少次这样的操作。
     *
     * @param n
     * @return
     */
    public int method3(int n) {
        int count = 0;
        while (n != 0) {
            ++count;
            n = (n - 1) & n;
        }
        return count;
    }
}
