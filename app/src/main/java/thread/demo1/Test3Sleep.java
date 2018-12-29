package thread.demo1;

/**
 * Created by LIXIAOYE on 2018/12/27.
 */

public class Test3Sleep {
    public static void main(String[] args) {
        Thread thread = new Thread();
        thread.start();
        try {
            Thread.sleep(50001);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(thread.getState());//TERMINATED
    }
}
