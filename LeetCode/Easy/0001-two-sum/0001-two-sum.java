class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> input = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            input.put(nums[i], i);
        }

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (input.containsKey(complement) && input.get(complement) != i) {
                return new int[]{i, input.get(complement)};
            }
        }

        return new int[]{};
    }
}