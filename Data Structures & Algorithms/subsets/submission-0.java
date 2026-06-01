class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();

        backtrack(nums,0,temp,res);

        return res;

    }
    static void backtrack(int[] nums,int start,List<Integer> temp,List<List<Integer>> res){
        res.add(new ArrayList<>(temp));
        for(int i=start;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,i+1,temp,res);
            temp.remove(temp.size()-1);
        }
    }
}
