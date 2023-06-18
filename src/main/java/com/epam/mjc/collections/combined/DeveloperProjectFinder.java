package com.epam.mjc.collections.combined;

import java.util.*;

public class DeveloperProjectFinder {
    public List<String> findDeveloperProject(Map<String, Set<String>> projects, String developer) {
        List<String> answ = new ArrayList<>();
        projects.forEach((key,value)->{
            if (value.contains(developer)) answ.add(key);
        });

        answ.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length()>o2.length()) return -1;
                if (o1.length()<o2.length()) return 1;
                return 0;
            }
        });
        return answ;
    }
}
