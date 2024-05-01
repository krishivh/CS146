public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int low = 0;
        int high = n;
        int answer = -1;
        while(low<=high){
            int mid = low + (high-low)/2;
            if(isBadVersion(mid)){
                answer = mid; 
                high = mid-1;
            }else if(!isBadVersion(mid)){
                low = mid+1;
            }
        }
        return answer;
    }
}