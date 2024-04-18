import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(containsduplicate(nums));
    }

    public static boolean containsduplicate(int[] nums) {
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.put(nums[i],i) != null) {
                return true;
            }
        }
        return false;
    }
}