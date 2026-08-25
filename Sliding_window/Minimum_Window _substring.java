import java.util.Arrays;
class Solution 

{
    public boolean checkInclusion(String s1, String s2) 
    
    {

        if(s1.length() > s2.length()) {
            return false;
        }
        int [] need=new int [26];
        int [] other=new int [26];
        for(int i=0;i<s1.length();i++)
        {
            need[s1.charAt(i)-'a']++;
        }
        int left=0;
    for(int right=0;right<s2.length();right++)
    {
        other[s2.charAt(right)-'a']++;
        if(right-left+1==s1.length())
        {
            if(Arrays.equals(need,other))
            {
                return true;
            }
             other[s2.charAt(left)-'a']--;
             left++;

        }
        
       
    }
    return false;
    }
}
