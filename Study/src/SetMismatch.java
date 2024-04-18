import java.util.Arrays;

public class SetMismatch {
    public static void main(String[] args) {
        SetMismatch setMismatch = new SetMismatch();
        int[] nums = {2,1,3,3,5};
        System.out.println(Arrays.toString(setMismatch.findErrorNums(nums)));
    }
    public int[] findErrorNums(int[] nums) {
        Arrays.sort(nums);
        int dup = -1, missing = 1; //вводим переменную дубликат и пропущенное число
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1])
                dup = nums[i]; //находим дубликат
            else if (nums[i] > nums[i - 1] + 1) //дубликат меняем на пропущенное число
                missing = nums[i - 1] + 1;
        }
        return new int[] {
                dup, nums[nums.length - 1] != nums.length ? nums.length : missing}; //возвращаем дубликат и пропущенное число
    }
}
