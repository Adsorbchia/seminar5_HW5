package org.example.seminar5.hw1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class Task1 {
    private static boolean checkText;

    /**
     * Подсчитать количество вхождения каждого слова
     * Пример:
     * Россия идет вперед всей планеты. Планета — это не Россия.
     */
    public static void main(String[] args) {
        Map<String,Integer> mapStr = new HashMap<>();
        String text = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String[]words = Pattern.compile("\\P{L}+").split(text);

        System.out.println(Arrays.toString(words));
        for (String word:words) {
            mapStr.putIfAbsent(word,0);
            mapStr.put(word,(mapStr.get(word))+1);
        }for (var entry : mapStr.entrySet()){
            System.out.println(entry.getKey() +" "+ entry.getValue()+ "  раз");
        }
    }
}

