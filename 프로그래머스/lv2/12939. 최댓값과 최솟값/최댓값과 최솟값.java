class Solution {
    public String solution(String s) {
        String[] input = s.split(" ");
        int[] nums = new int[input.length];
    
        for (int i = 0; i < nums.length; i++) {
            nums[i] = Integer.parseInt(input[i]);
        }
        
        int max, min;
        max = min = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
            }
            
            if (min > nums[i]) {
                min = nums[i];
            }
        }
        
        String answer = min + " " + max;
        return answer;
    }
}