package com.epam.rd.autocode.decorator;

import java.util.*;
import java.util.List;

public class Decorators {
    public static List<String> evenIndexElementsSubList(List<String> sourceList) {
        if (sourceList == null || sourceList.size() < 2) {
            throw new UnsupportedOperationException();
        }
        List<String> result = new ArrayList<>();
        Iterator<String> iter = sourceList.iterator();
        while (iter.hasNext()) {
            String current = iter.next();
            if (sourceList.indexOf(current) % 2 == 0) {
                result.add(current);
            }
        }
        return result;
    }

}
