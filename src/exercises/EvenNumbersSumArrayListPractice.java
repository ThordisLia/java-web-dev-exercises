package exercises;

import java.util.ArrayList;

public class EvenNumbersSumArrayListPractice {
    public static void main (String[] args){
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(10);

        int sum = 0;
        for (int i=0; i < nums.size(); i++){
            if(nums.get(i) % 2 == 0){
                sum += nums.get(i);
            }
        }

        System.out.println(sum);
    }
}
