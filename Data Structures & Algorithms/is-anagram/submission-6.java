class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        return false;
        char[] arr=t.toCharArray();
      
        for(int i=0;i<s.length();i++)
        {
            boolean ch=true;
            for(int j=0;j<s.length();j++)
            {
                if(s.charAt(i)==arr[j]){
                ch=false;
                arr[j]='#';
                break;}
            }
            if(ch==true)
            return false;
            
        }
        return true;

    }
}
