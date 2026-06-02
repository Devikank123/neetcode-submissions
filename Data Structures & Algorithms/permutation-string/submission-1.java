class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq1[]=new int[256];
        int freq2[]=new int[256];
        int n1=s1.length();
        int n2=s2.length();
        if(n1>n2) return false;
        
        for(char c:s1.toCharArray()){
            freq1[c-'a']++;
        }
        for(int i=0;i<n1;i++){
            freq2[s2.charAt(i)-'a']++;
        }
        if(Arrays.equals(freq1,freq2)) return true;
        int l=0;
        for(int i=n1;i<n2;i++){
           freq2[s2.charAt(i)-'a']++;
           freq2[s2.charAt(l)-'a']--;
           l++;
         if(Arrays.equals(freq1,freq2)) return true;
        }
        return false;
    }
}
