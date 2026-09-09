class Solution {
    public int[] productExceptSelf(int[] nums) {
        //prefix sum pattern
        int n=nums.length;
        int[] leftproduct=new int[n];
        int left=1;
        for(int i=0;i<n;i++){
            leftproduct[i]=left;
            left*=nums[i];
        }
        int[] rightproduct=new int[n];
        int right=1;
        for(int i=n-1;i>=0;i--){
            rightproduct[i]=right;
            right*=nums[i];
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]=rightproduct[i]*leftproduct[i];
        }
        return res;
    }
}  
