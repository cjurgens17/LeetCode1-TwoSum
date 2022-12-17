import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {
         int[] nums = new int[] {2,7,11,15};
         int target = 9;

         int[] nums2 = new int[] {3,2,4};
         int target2 = 6;

         int[] nums3 = new int[] {3,3};
         int target3 = 6;

        System.out.println(Arrays.toString(twoSum(nums, target)));
        System.out.println(Arrays.toString(twoSum(nums2, target2)));
        System.out.println(Arrays.toString(twoSum(nums3, target3)));

    }

    public static int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0;i<nums.length;i++){
            int num1 = nums[i];
            int num2 = target - num1;
            if(map.containsKey(num2)){
                return new int[] {map.get(num2), i};
            }
            map.put(nums[i], i);
        }
        return new int[] {-1,-1};
    }
}
