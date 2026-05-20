class Solution {
    public int maxArea(int[] heights) {
        int l=0;
        int r=heights.length-1;
        int minlevel=0;
        int waterlevel=0;

        while(l<r){
            minlevel=Math.min(heights[l],heights[r])*(r-l);
            waterlevel=Math.max(waterlevel,minlevel);

            if(heights[l]<heights[r]){
                l++;
            }
            else{
                r--;
            }
        }
        return waterlevel;
    }
}
