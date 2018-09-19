package cn.vpclub.coupon.api.utils;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.util.Map;

/**
 * @author:yangqiao
 * @description:
 * @Date:2017/12/27
 */
public class JSONUtils {

    private static Gson gson = new Gson();

    public static String toJson(Object o) {
        return o == null ? null : gson.toJson(o);
    }

    public static <T> T toObject(String s, Class clazz) {
        return (s != null && clazz != null) ? (T) gson.fromJson(s, clazz) : null;
    }

    public static Map<String, Object> toMap(String s) {
        return gson.fromJson(s, new TypeToken<Map<String, String>>() {
        }.getType());
    }
}