package Algorithms;

import java.util.Arrays;

public class BinarySearch2 {
    public static void main(String[] args) {
        int[] array = {1,16,35,5,9,10,13,17};
        System.out.println(Arrays.toString(BubbleSort.bubbleSort(array)));
        System.out.println(binarySearch(array, 100));
        System.out.println(binarySearchRecurs(array, 35, 0, array.length - 1));

    }

    public static int binarySearchRecurs(int[] array, int numberToFind, int startIndex, int endIndex) {
        if (startIndex <= endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == numberToFind) {
                return middleIndex;
            }
            if (numberToFind < array[middleIndex]) {
                return binarySearchRecurs(array, numberToFind, startIndex, middleIndex - 1);
            } else {
                return binarySearchRecurs(array, numberToFind, middleIndex + 1, endIndex);
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int numberToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            if (array[middleIndex] == numberToFind) {
                return middleIndex;
            }
            if (numberToFind < array[middleIndex]) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
