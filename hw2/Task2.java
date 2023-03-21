package org.example.seminar5.hw2;

import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Task2 {
    /**
     * Подсчитать количество искомого слова, через map (наполнением значение, где искомое слово
     * будет являться ключом), вносить все слова не нужно
     */
    public static void main(String[] args) {
        String s = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String x = "Россия";
        Map<String,Integer> mapX= new HashMap<>();
        String[]str = Pattern.compile("\\P{L}+").split(s);
        for (String el:str) {
            if(el.equals(x)){
                mapX.putIfAbsent(el,0);
                mapX.put(el,mapX.get(el)+1);
            }
        }
        for (var entry:mapX.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
