import Algorithms.QuickSort;

import java.util.Arrays;

public class FirstSkipNumber {
    public static void main(String[] args) {
        int[] nums = {5,3,4,1,2,6,7,8};

        System.out.println(FirstSkipNumber.missNumber(nums));

    }

    private static int missNumber(int[] nums) {
//        QuickSort.fastSort(nums);
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 1; i++) {

            int start = nums[i];
            int next = nums[i + 1];

            if (next - start == 2) {
                return start + 1;
            }
        }
          return -1;

    }
}
