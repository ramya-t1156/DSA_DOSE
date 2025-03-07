/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int l = 1 , h = n  , mid;
        int firstBad = n;
        while(l<=h){
            mid = l+(h-l)/2;
            if(isBadVersion(mid) && mid<=firstBad){
                h = mid-1;
                firstBad = mid;
            }
            else{
                l = mid+1;
            }
        }
        return firstBad;
    }
}
