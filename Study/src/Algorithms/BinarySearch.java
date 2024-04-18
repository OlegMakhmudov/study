package Algorithms;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = {1,3,15,4,8,6,7,24,37,26,55,34,76};
        System.out.println("Массив ДО сортировки: " + Arrays.toString(array));
        BubbleSort.bubbleSort(array);
        System.out.println("Массив ПОСЛЕ сортировки: " + Arrays.toString(array));
        System.out.println("Линейный поиск: " + linealSearch(array, 7));
        System.out.println("Бинарный поиск: " + binarySearch(array,15));



    }

    public static int linealSearch(int[] array, int elementToFind) {

        for(int i = 0; i < array.length; i++) {
            if (array[i] == elementToFind)
                return i;
        }
        return -1;
    }

    public static int binarySearch(int[] array, int elementToFind){
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;
        while(startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex: " +  startIndex + " " + "endIndex: " + endIndex + " " + "middleIndex: " + middleIndex);

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }
            if(array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
