package com.db.stream.utils;


import java.util.HashMap;
import java.util.Map;

public class RequestResponse {
    public static Map<String, Object> result(Integer code, Object mess){
        Map<String, Object> resultMap = new HashMap<>();
        resultMap.put("code", code);
        resultMap.put("message", mess);
        return resultMap;
    }
}
