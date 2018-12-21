package thread.demo2;

import java.util.concurrent.Callable;

/**
 * Created by LIXIAOYE on 2018/12/21.
 */

public class MyCallable implements Callable {
    @Override
    public Object call() throws Exception {
        return "We wish you a merry christmas,and a happy new year!";
    }
}
