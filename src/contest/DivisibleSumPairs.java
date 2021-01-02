package contest;

public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairs=0;
        for(int i=0;i<ar.length;i++){
            for(int j=0;j<ar.length;j++){
                if(i<j && (ar[i]+ar[j])%k==0){
                    pairs++;
                }
            }
        }

        return pairs;
    }
}
