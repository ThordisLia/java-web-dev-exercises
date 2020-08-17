package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class fiveLetterWordsArrayListPractice {
    public static void main(String[] args){
        ArrayList<String> words = new ArrayList<>();
        //print from the array
        words.add("Anna");
        words.add("Earth");
        words.add("Egg");
        words.add("Heart");
//        for (int i=0; i<words.size(); i++){
//            if(words.get(i).length() == 5){
//                System.out.println(words.get(i));
//            }
//        }

        //ask for the length
        Scanner input;
        input = new Scanner(System.in);
        System.out.println("Enter the word length: ");
        int length = input.nextInt();

                for (int i=0; i<words.size(); i++){
            if(words.get(i).length() == length){
                System.out.println(words.get(i));
            }
        }
    }
}
