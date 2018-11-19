package design_pattern.creational.singleton.demo3;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by LIXIAOYE on 2018/11/5.
 */

public class SingletonManager {
    private static Map<String, Object> objMap = new HashMap<String, Object>();

    private SingletonManager() {
    }

    public static void registerService(String key, Object instance) {
        if (!objMap.containsKey(key)) {
            objMap.put(key, instance);
        }
    }

    public static Object getService(String key) {
        return objMap.get(key);
    }
}
