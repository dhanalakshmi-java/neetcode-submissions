class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        boolean ch=false;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<nums.length;j++)
            {
                if(i!=j)
                {
                int diff=target-nums[i];
                if(nums[j]==diff)
                {
                    arr[1]=i;
                    arr[0]=j;
                    break;
                }
                }
            }


        }
        return arr;   
        
    }
}
