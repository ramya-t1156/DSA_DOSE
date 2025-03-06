class Solution {
    public int findFirstPosition(int[] nums , int k){
        int l = 0 , h = nums.length-1 , mid , idx = -1;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==k){
                idx = mid;
                h = mid-1;
            }
            else if(nums[mid]>k){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return idx;
    }
    public int findLastPosition(int[] nums , int k){
        int l = 0 , h = nums.length-1 , mid , idx = -1;
        while(l<=h){
            mid = l+(h-l)/2;
            if(nums[mid]==k){
                idx = mid;
                l = mid+1;
            }
            else if(nums[mid]>k){
                h = mid-1;
            }
            else{
                l = mid+1;
            }
        }
        return idx;
    }
    public int[] searchRange(int[] nums, int target) {
        int first = findFirstPosition(nums,target);
        if(first==-1) return new int[]{-1,-1};
        int last = findLastPosition(nums,target);
        return new int[]{first,last};
    }
}
