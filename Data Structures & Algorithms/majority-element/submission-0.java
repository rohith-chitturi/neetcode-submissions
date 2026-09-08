class Solution {
    public int majorityElement(int[] nums) {
        Map<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        int max=Integer.MIN_VALUE;
        int ans=0;
        for(int i:map.keySet()){
            if(map.get(i)>max){
                max=map.get(i);
                ans=i;
            }
        }
        return ans;
    }
}