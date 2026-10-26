class Solution {
    public int longestConsecutive(int[] nums) {
        int n=nums.length;
        int max=0;
        Set<Integer> set=new HashSet<>();
        for(int i:nums){
            set.add(i);
        }
        for(int i:set){
            if(!set.contains(i-1)){
                int count=1;
                int current=i;
                while(set.contains(current+1)){
                    count++;
                    current++;
                }
                max=Math.max(max,count);
            }
        }
        return max;
    }
}
