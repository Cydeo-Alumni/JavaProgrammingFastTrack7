package day06;

public class Ex01ForEachLoop {
    public static void main(String[] args) {
        int[] nums = {3,2,13,66};

        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

        System.out.println();

        //enhanced for loop / for each loop
        for(int n : nums) {
            System.out.print(n + " ");
        }
    }
}
