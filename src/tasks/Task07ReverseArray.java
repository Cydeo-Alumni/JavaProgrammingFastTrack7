package tasks;

import java.util.Arrays;

public class Task07ReverseArray {
    public static void main(String[] args) {
        int[] nums = {10, 30, 40, 60, 4 , 3};
        System.out.println(Arrays.toString(nums));
        nums = reverseArray(nums);
        System.out.println(Arrays.toString(nums));

    }
    //time complexity is O(n)
    public static int[] reverseArray(int[] nums) {
        for (int start = 0; start < nums.length/2; start++) {
            int temp = nums[start];
            int end = nums.length - 1 - start;
            nums[start] = nums[end];
            nums[end] = temp;
        }
        return nums;
    }
}
