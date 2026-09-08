class Solution {
    public boolean hasDuplicate(int[] nums) {
        // int slow=0;
        // int fast=0;
        Set<Integer> hashset=new HashSet<>();
        for(int i:nums){
            if(hashset.contains(i)){
                return true;
            }
            else{
                hashset.add(i);
            }
        }
        return false;
    }
}