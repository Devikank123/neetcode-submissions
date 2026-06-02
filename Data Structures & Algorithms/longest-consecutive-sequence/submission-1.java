class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> s=new HashSet<>();
        int max=Integer.MIN_VALUE;
        int cnt=0;
        if(nums.length==0) return 0;
        for(int i:nums) s.add(i);
        int x=0;
        for(int i:s){
            if(!s.contains(i-1)){
                x=i;
                cnt=1;
                while(s.contains(x+1)){
                    x+=1;
                    cnt+=1;
                }
            }
            max=Math.max(max,cnt);
        }
        return max;

    }
}
