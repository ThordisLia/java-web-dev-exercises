package exercises;

import java.util.ArrayList;

public class SumArrays {
    public static ArrayList<Integer> sumArrayLists(ArrayList<Integer> first, ArrayList<Integer> second) {
        //make an array list to hold results
        ArrayList<Integer> result = new ArrayList<>();
        //check the lengths of the array lists, figure out which one is bigger
        if (first.size() > second.size()) {
            //for each element in the longer arrayList
            for (int i = 0; i < first.size(); i++) {

                //if I haven't run out of ints from the shorter list
                //add the two ints together
                if (i < second.size()) {
                    Integer sum = first.get(i) + second.get(i);
                    result.add(sum);

                    //else
                } else {
                    //just keep the value from the longer list
                    result.add(first.get(i));
                }
            }
        } else {
            for (int i = 0; i < second.size(); i++) {

                //if I haven't run out of ints from the shorter list
                //add the two ints together
                if (i < first.size()) {
                    Integer sum = first.get(i) + second.get(i);
                    result.add(sum);
                    //else
                } else {
                    //just keep the value from the longer list
                    result.add(first.get(i));
                }
            }
        }
            //return the result
            return result;
        }
            public static void main (String[] args) {
                ArrayList<Integer> first = new ArrayList<>();
                first.add(3);
                first.add(4);
                first.add(5);
                first.add(1);

                ArrayList<Integer> second = new ArrayList<>();
                second.add(1);
                second.add(6);

                ArrayList<Integer> result = sumArrayLists(first, second);
                System.out.println(result);
            }
        }
