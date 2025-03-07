class Solution {
    public int findMin(int[] nums) {
        int l = 0 , h = nums.length-1 , mid , min = Integer.MAX_VALUE;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[l]<=nums[mid]){
                min = Math.min(min,nums[l]);
                l = mid+1;
            }
            else{
                min = Math.min(min,nums[mid]);
                h = mid-1;
            }
        }
        return min;
    }
}
