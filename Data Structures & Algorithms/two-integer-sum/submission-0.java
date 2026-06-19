class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        boolean ch=false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j){
                
                if(nums[i]+nums[j]==target)
                {
                arr[0]=i;
                arr[1]=j;
                ch=true;
                break;
                }
                }
            }
            if(ch==true)
            break;

        }
        return arr;   
        
    }
}
