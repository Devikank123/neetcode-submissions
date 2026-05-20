class Solution {
    public boolean isPalindrome(String s) {
        String res=s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder rev=new StringBuilder(res);
        rev.reverse();


        return res.equals(rev.toString());
    }
}
