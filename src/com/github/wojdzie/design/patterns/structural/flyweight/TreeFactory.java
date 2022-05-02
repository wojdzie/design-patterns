package com.github.wojdzie.design.patterns.structural.flyweight;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class TreeFactory {

    public static Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, String data) {
        TreeType result = treeTypes.get(name);
        if (result == null) {
            result = new TreeType(name, color, data);
            treeTypes.put(name, result);
        }
        return result;
    }
}
