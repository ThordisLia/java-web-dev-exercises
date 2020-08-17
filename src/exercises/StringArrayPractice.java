package exercises;
import java.util.Arrays;
public class StringArrayPractice {
    public static void main(String[] args){

        String greenHamAndEggs = "I would not, could not, in a box. " +
                "I would not, could not with a fox. I will not eat them in a house. " +
                "I will not eat them with a mouse.";
        int maxChar = 100;
        String[] splitString = new String[maxChar];
        //separate into words
//        splitString = greenHamAndEggs.split(" ");
//        System.out.println(Arrays.toString(splitString));

        //separate into sentences
        splitString = greenHamAndEggs.split("\\.");
        System.out.println(Arrays.toString(splitString));
    }
}
