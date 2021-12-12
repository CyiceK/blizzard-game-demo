package com.game.demo.common.security.context;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * <p>上下文处理</p>
 *
 * @author: tzy
 * @date: 2021/12/9 16:21
 */
public class BaseContextHandler {
    public static ThreadLocal<Map<String, Object>> threadLocal = new ThreadLocal<Map<String, Object>>();

    public static void set(String key, Object value) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        map.put(key, value);
    }

    public static void set(Map<String, Object> map) {
        Map<String, Object> threadLocalMap = threadLocal.get();
        if (threadLocalMap == null) {
            threadLocalMap = new HashMap<>();
            threadLocal.set(threadLocalMap);
        }
        threadLocalMap.putAll(map);
    }

    public static Object get(String key) {
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        return map.get(key);
    }

    public static Map<String, Object> get() {
        Map<String, Object> threadLocalMap = threadLocal.get();
        if (threadLocalMap == null) {
            threadLocalMap = new HashMap<String, Object>();
            threadLocal.set(threadLocalMap);
        }
        return threadLocalMap;
    }

    public static String getUserId(){
        Map<String, Object> map = threadLocal.get();
        if (map == null) {
            map = new HashMap<String, Object>();
            threadLocal.set(map);
        }
        return (String)map.get("userId");
    }

    public static void remove() {
        threadLocal.remove();
    }
}
