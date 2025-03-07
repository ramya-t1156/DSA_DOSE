class Solution {
    public int search(int[] nums, int target) {
        int l = 0 , h = nums.length-1 , mid;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==target){
                return mid;
            }
            // for left sorted array
            if(nums[l]<=nums[mid]){
                if(nums[l]<= target && target<=nums[mid]){
                    h = mid-1;
                }
                else{
                    l = mid+1;
                }
            }
            // for right sorted array
            else{
                if(nums[mid]<= target && target<=nums[h]){
                    l = mid+1;
                }
                else{
                    h = mid-1;
                }
            }
        }
        return -1;
    }
}
