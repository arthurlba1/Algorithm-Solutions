class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] output = new int[2];
        for (int i = 0; i < nums.length; i++){
            for(int x = 0; x < nums.length; x++) {
               if(nums[i] + nums[x] == target){
                output[0] = i;
                output[1] = x;
                break;
               }
            }
        }
        return output;
    }
}