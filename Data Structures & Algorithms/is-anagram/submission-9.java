class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] arr=t.toCharArray();
        char[] arr1=s.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr);
      
        for(int i=0;i<s.length();i++)
        {
            if(arr1[i]!=arr[i])
            return false;
        }
        return true;

    }
}