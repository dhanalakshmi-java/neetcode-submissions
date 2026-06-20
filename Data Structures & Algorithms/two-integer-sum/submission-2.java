
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] arr=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<nums.length;i++)
        {
            int cmp=target-nums[i];
            if(map.containsKey(cmp))
            {
                int j=map.get(cmp);
                if(j>i)
                {
                    arr[0]=i;
                    arr[1]=j;
                }
                if(i>j)
                {
                    arr[1]=i;
                    arr[0]=j;

                }
            }  
            map.put(nums[i],i);
        }
        
        return arr;      
    }
}
