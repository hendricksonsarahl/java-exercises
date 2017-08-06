package org.launchcode.java.demos.studios;

import java.util.HashMap;
import java.util.Map;

public class CountCharcula {
    public static void main(String[] args) {

        String exampleString = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nunc accumsan sem ut ligula" +
                " scelerisque sollicitudin. Ut at sagittis augue. Praesent quis rhoncus justo. Aliquam erat volutpat. " +
                "Donec sit amet suscipit metus, non lobortis massa. Vestibulum augue ex, dapibus ac suscipit vel, " +
                "volutpat eget massa. Donec nec velit non ligula efficitur luctus.";

        HashMap<Character, Integer> letterHash = new HashMap<>();

        for (Character letter : exampleString.toCharArray()){
            Integer count;
            if (letterHash.containsKey(letter)) {
                count = letterHash.get(letter);
            } else{
                count = 0;
            }
            letterHash.put(letter, ++count);
        }

        for (Map.Entry<Character,Integer> letter : letterHash.entrySet()) {
            System.out.println(letter.getKey() + ":" + letter.getValue());
        }
    }
}