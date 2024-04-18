package Algorithms;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {2, 6, 4, 9, 7, 1};
        System.out.println(Arrays.toString(bubbleSort(array)));
    }


        public static int [] bubbleSort ( int[] array){
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int i = 1; i < array.length; i++) {
                    if (array[i] < array[i - 1]) {
                        int temp = array[i];
                        array[i] = array[i - 1];
                        array[i - 1] = temp;
                        isSorted = false;
                    }

                }
            }
            return array;
        }
    }

