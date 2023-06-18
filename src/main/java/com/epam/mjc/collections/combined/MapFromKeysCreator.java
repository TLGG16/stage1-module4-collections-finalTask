package com.epam.mjc.collections.combined;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapFromKeysCreator {
    public Map<Integer, Set<String>> createMap(Map<String, Integer> sourceMap) {
        Map<Integer,Set<String>> answ = new HashMap<>();
        sourceMap.forEach((key,value)->{
            if (answ.containsKey(key.length())){
                Set<String> set = new HashSet<>(  answ.get(key.length()));
                set.add(key);
                answ.put(key.length(), set);
            }else {
                Set<String> set = new HashSet<>();
                set.add(key);
                answ.put(key.length(), set);
            }
        });

        return answ;
    }
}
