package tasks;

import java.util.*;
import java.util.stream.Collectors;

public class Task08RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] nums = {1,1,4,3,1,4,5,6,5,2};
        //1,4,3,5,6,2

        nums = removeDuplicates1(nums);
        System.out.println(Arrays.toString(nums));

        int[] nums2 = {1,1,4,3,1,4,5,6,5,2};
        nums2 = removeDuplicates2(nums2);
        System.out.println(Arrays.toString(nums2));

        int[] nums3 = {1,1,4,3,1,4,5,6,5,2};
        nums3 = removeDuplicates3(nums3);
        System.out.println(Arrays.toString(nums3));

        //Arrays.stream(nums3).filter(n -> n >= 4).collect();
    }

    private static int[] removeDuplicates1(int[] nums) {
        Set<Integer> unique = new LinkedHashSet<>();
        for(int each : nums) {
            unique.add(each);
        }

        return unique.stream().mapToInt(Integer::intValue).toArray();
    }

    public static int[] removeDuplicates2(int[] nums) {
        List<Integer> unique = new ArrayList<>();
        for (int each : nums) {
            if (!unique.contains(each)) {
                unique.add(each);
            }
        }

        int[] uniqueArr = new int[unique.size()];
        for (int i = 0; i < unique.size(); i++) {
            uniqueArr[i] = unique.get(i);
        }

        return uniqueArr;
    }

    public static int[] removeDuplicates3(int[] nums) {
        return Arrays.stream(nums).distinct().toArray();
    }

}
