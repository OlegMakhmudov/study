import java.util.Arrays;

public class Solution75 {
  public static void main(String[] args) {
    Solution75 solution75 = new Solution75();
    int[] nums = {1,0,2,2,0,1};
    System.out.println("Строка " + Arrays.toString(nums));
    solution75.sortColors(nums);
    System.out.println("Отсортированная строка " + Arrays.toString(nums));
  }
  public void validate(int[] nums) {
    for (int i: nums) {
      if (i < 0 || i > 2) {
        throw new IllegalArgumentException("Неверное число");
      }
    }
  }
  public void sortColors(int[] nums) {
    validate(nums);
    if (nums.length == 0 || nums.length == 1) {
      return;
    }

    int start = 0; // начало
    int end = nums.length - 1; //конец
    int index = 0; //текущий элемент

    while (index <= end && start < end) { //проверяем, что мы не находимся на последнем индексе
      if (nums[index] == 0) { //если число индексов равно 0, то мы переставляем вперед
        nums[index] = nums[start]; //поэтому число индексов равно числу начальных чисел
        nums[start] = 0;
        start++;
        index++;
      } else if (nums[index] == 2) { //если число индексов равно 2
        nums[index] = nums[end]; // то число индексов равно концу массива
        nums[end] = 2;
        end--;
      } else {
        index++;
      }
    }
    return;
  }
}
// [0,1,1,0,2,1,1,2] начало всегда будет сдвигаться, сначала это 0, потом, 1 и т.д.
// когда видим единицу, то переходим дальше, когда встречаем ноль, то мы меняем его местами со стартом, т.е. с 1-ой единицей
// когда мы встречаем 2, то отправляем ее в конец массива
