package Leetcode.Easy._278.FirstBadVersion;

public class Practice extends VersionControl{
    public int firstBadVersion(int n) {
        int start = 1;
        int end = n;
        int res = -1;

        while(start <= end) {
            int mid = start + (end - start) / 2;

            if(isBadVersion(mid)){
                res = mid;
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        return res;
    }
}
