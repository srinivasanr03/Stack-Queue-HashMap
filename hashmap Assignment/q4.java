public class q4 {
    public int majorityElement(int[] nums) {
        int candidate = nums[0];
        int count = 1;

        // Find the majority candidate
        for (int i = 1; i < nums.length; i++) {
            if (count == 0) {
                candidate = nums[i];
                count = 1;
            } else if (nums[i] == candidate) {
                count++;
            } else {
                count--;
            }
        }

        // Verify if the candidate is the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        if (count > nums.length / 2) {
            return candidate;
        } else {
            throw new IllegalArgumentException("Majority element does not exist");
        }
    }

    public static void main(String[] args) {
        q4 solution = new q4();
        int[] nums1 = {3, 2, 3};
        System.out.println("Majority element: " + solution.majorityElement(nums1)); // Output: 3

        int[] nums2 = {2, 2, 1, 1, 1, 2, 2};
        System.out.println("Majority element: " + solution.majorityElement(nums2)); // Output: 2
    }
}
