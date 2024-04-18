import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

public class Solution128 {
    public int longestConsecutive(int[] nums) {

        // Создаем HashSet из элементов массива
        Set<Integer> numsSet = new HashSet<>();
        for (int num : nums) {
            numsSet.add(num);
        }

        int maxLength = 0;              // Длина самой длинной последовательности

        for (int num : numsSet) {
            if (!numsSet.contains(num-1)) {             // Находим число, которое не имеет предшественника в массиве
                AtomicInteger currentNum = new AtomicInteger(num);                   // Рассматриваем текущее значение HashSet
                int currentLength = 1;                  // Счетчик для определения длины текущей последовательности

                /*while (numsSet.contains(currentNum+1)) {        // Определяем, есть ли следующие последовательные элементы
                    currentNum += 1;
                    currentLength += 1;
                }*/
                currentLength = currentLength(currentNum, currentLength, numsSet);

                maxLength = Math.max(maxLength, currentLength);
            }
        }

        return maxLength;
    }
    public int currentLength (AtomicInteger num, int currentLength, Set<Integer> numsSet  ) {

        while (numsSet.contains(num.get()+1)) {        // Определяем, есть ли следующие последовательные элементы
            num.getAndIncrement();
            currentLength += 1;
        }
        return currentLength;
    }
}


class TestSolution128_2{
    public static void main(String[] args) {
        Solution128 s = new Solution128();
        System.out.println(s.longestConsecutive(new int [] {-1, 0,  1, 3, 4, 5, 6, 7, 8, 9}));
    }


}

