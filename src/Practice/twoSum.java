package Practice;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {1, 5, 6, 3, 4, 9};
        int target = 7;

        int[] result = twoSum(nums, target);
        System.out.println("Indices: [" + result[0] + "," + result[1] + "]");

    }

    public static int[] twoSum(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};

                }
            }
        }
        return new int[] {-1, -1};
    }
}