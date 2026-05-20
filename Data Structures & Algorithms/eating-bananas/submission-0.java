class Solution {
    static boolean caneat(int piles[],int hr,int speed){
        int hrs=0;
        for(int i=0;i<piles.length;i++){
            hrs+=(piles[i]+speed-1)/speed;
        }
        return hrs<=hr;
    }
    public int minEatingSpeed(int[] piles, int hr) {
        int l=1;
        int h=0;

        for(int pile:piles){
            h=Math.max(h,pile);
        }
        
        int ans=0;
        while(l<=h){
            int m=l+(h-l)/2;
            if(caneat(piles,hr,m)){
               ans=m;
               h=m-1;
            }
            else{
                l=m+1;
            }
        }
        return ans;
    }
}
