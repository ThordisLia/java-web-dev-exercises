package exercises;

public class FibonacciArrayPractice {
    public static void main(String[] args) {
    // max 6 int
       int maxInt = 6;
        int[] fibonacci = new int[maxInt];
        fibonacci[0] = 1;
        fibonacci[1] = 1;
        fibonacci[2] = 2;
        fibonacci[3] = 3;
        fibonacci[4] = 5;
        fibonacci[5] = 8;

        // print all values
        for (int i=0; i< fibonacci.length; i++){
            //print only odd numbers
            if (fibonacci[i]%2 != 0) {
                System.out.println(fibonacci[i]);
            }
        }

    }
}

