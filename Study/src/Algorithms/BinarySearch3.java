package Algorithms;

public class BinarySearch3 {

    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7};
        System.out.println(binarySearch(array,6));
    }

    public static int binarySearch (int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        for(int i = 1; i < array.length; i++) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;
            System.out.println("startIndex = " + startIndex + " " + "middleIndex = " + " " + middleIndex + " " + "endIndex = " + " " + endIndex);
            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            }
            if (array[middleIndex] > elementToFind) {
                startIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }
        return -1;
    }
}
