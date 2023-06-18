package com.epam.mjc.collections.combined;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class LessonsGetter {
    public Set<String> getLessons(Map<String, List<String>> timetable) {
        Set<String> answ = new HashSet<>();
        timetable.forEach((key,value)->{
            answ.addAll(value);
        });
        return answ;
    }
}
