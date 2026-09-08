class Solution {
    public int[] sortArray(int[] nums) {
        PriorityQueue<Integer> res=new PriorityQueue<>();
        for(int i:nums){
            res.add(i);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=res.poll();
        }
        return nums;
    }
}