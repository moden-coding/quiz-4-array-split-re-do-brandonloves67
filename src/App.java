import java.util.Arrays;

public class App {

    // Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.
   
    /**
     * Array task: Complete the method threeFromMiddle
     * 
     * Given an array of ints of odd length, return a new array length 3 
     * containing the elements from the middle of the array. 
     * The array length will be at least 3.
     * 
     * 
     * 
     * 
     * 
     * 
     * Split task: Complete the method longerWord
     * 
     * This method:
     * -takes in a sentence stored in a String and an integer n
     * -splits the sentence into individual words
     * -counts how many words have a length strictly greater than n
     * 
     * -returns that count
     */
    








    
    
    public static void main(String[] args)  {

        //threeFromMiddle Example
        System.out.println("With input [1, 2, 3, 4, 5], you should get: [2, 3, 4]. You got: "
        + Arrays.toString(threeFromMiddle(new int[]{1, 2, 3, 4, 5})));
        System.out.println("With input [8, 6, 7, 5, 3, 0, 9], you should get: [7, 5, 3]. You got: "
        + Arrays.toString(threeFromMiddle(new int[]{8, 6, 7, 5, 3, 0, 9})));
        System.out.println("With input [1, 2, 3], you should get: [1, 2, 3]. You got: "
        + Arrays.toString(threeFromMiddle(new int[]{1, 2, 3})));

        //Longer word example
        System.out.println("With input \"I love computer science\" and n = 4, you should get: 2. You got: "
                + longerWord("I love computer science", 4));
        System.out.println("With input \"This sentence has many words\" and n = 3, you should get: 4. You got: "
                + longerWord("This sentence has many words", 3));
        System.out.println("With input \"a bb ccc dddd\" and n = 2, you should get: 2. You got: "
                + longerWord("a bb ccc dddd", 2));
        System.out.println("With input \"one two three four\" and n = 10, you should get: 0. You got: "
                + longerWord("one two three four", 10));
        System.out.println("With input \"hello\" and n = 3, you should get: 1. You got: "
                + longerWord("hello", 3));
    }


    public static int[] threeFromMiddle(int[] a){
        return null;//placeholder
    }

    public static int longerWord(String sentence, int size){
        return -1; //placeholder
    }
}
