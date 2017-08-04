package exercises;

import java.util.ArrayList;

// Write a static method to print out each word in a list that has exactly 5 letters

public class Fast5 {

    public static void main(String[] args){

        String words[] = {"rest","in","peace","paul","walker","sorry", "you", "are", "dead"};
        for (String word:words){
            if(word.length()>=5)
                System.out.println(word);
        }
    }
}
