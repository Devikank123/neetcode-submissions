class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int l=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<s.length();i++){
            while(set.contains(s.charAt(i))){
                set.remove(s.charAt(l));
                l++;
            }
          max=Math.max(max,i-l+1);
          set.add(s.charAt(i));
        }
        if(max==Integer.MIN_VALUE) return 0;
        return max;
    }
}
