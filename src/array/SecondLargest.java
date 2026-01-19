package array;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SecondLargest {

    public static void main(String[] args) {

        int[] input = {12, 35, 1, 10, 95, 1};
        System.out.println(getSecondLargest(input));
        System.out.println(getSecondLargestUsingStreams(input));

    }


    public static int getSecondLargest(int[] arr) {

        if (arr == null || arr.length < 2 ){
            throw new IllegalArgumentException();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest =  Integer.MIN_VALUE;
        for (int j : arr) {
            if (j > largest) {
                secondLargest = largest;
                largest = j;
            } else if (j < largest && j > secondLargest) {
                secondLargest = j;
            }
        }
        return secondLargest;
    }

    public static int getSecondLargestUsingStreams(int[] arr){
        IntStream stream = Arrays.stream(arr);
        return stream.distinct().boxed().sorted((a,b)->b-a)
                .skip(1).findFirst().orElse(-1);
    }



}



