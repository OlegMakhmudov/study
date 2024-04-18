import java.util.Arrays;

public class Solution {

    public static int[] plusOne(int[] digits) {
        int index = digits.length - 1;                                    // определяем индекс крайнего элемента

        while (digits[index] == 9) {                                     // Если текущий элемент 9
            digits [index] = 0;                                          // то меняем текущий элемент на 0
            index--;                                                     // индекс смещаем налево
                                                                         // снова проходим по циклу
            if(index <0) {      // если индекс меньше 0, т.е. первый элемент массива 9 и в массиве все становятся 0, а впереди становится 1
                digits = new int [digits.length + 1];                    // создаем новый массив
                digits[0] = 1;                                           // первый элемент становится равен 1
                break;                                                   // выходим из цикла
            }
        }

        if(index >= 0) {                                                 // Если индекс не дошел до минуса
            digits[index]++;
        }
        return digits;
    }
    public static void main(String[] args) {
        int []nums = {9,9,9};
        Solution solution = new Solution();
        System.out.println(Arrays.toString(plusOne(nums)));
    }
}


