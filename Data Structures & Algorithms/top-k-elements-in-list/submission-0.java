class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        ArrayList<Integer> li=new ArrayList<>(map.keySet());
        li.sort((a,b)->map.get(b)-map.get(a));
       
        int[] add=new int[k];
        for(int i=0;i<k;i++){
            add[i]=li.get(i);
        }
        return add;
    }
}
