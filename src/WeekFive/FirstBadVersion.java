package WeekFive;

public class FirstBadVersion {
    public int firstBadVersion(int n) {
        return badVersion(0,  n,  n);
    }
    public int badVersion(int start, int end, int n){

        int mid = start + (end - start) / 2;
        if(start>=end){
            return n;
        }
        if(isBadVersion(mid)==false){
            start=mid+1;
        }
        else{
            end=mid;
            n=mid;
        }
        return badVersion(start,end,n);

    }
}
