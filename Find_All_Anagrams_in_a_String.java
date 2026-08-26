class Solution {
    public List<Integer> findAnagrams(String s, String p) 
    {
        int [] need=new int [26];
        int [] other=new int [26];
        for(int i=0;i<p.length();i++)
        {
             need[p.charAt(i)-'a']++;
        }
        int left=0;
        List<Integer>list=new ArrayList<>();
        for(int right=0;right<s.length();right++)
        {
            other[s.charAt(right)-'a']++;
         if(right-left+1 == p.length())
{
    if(Arrays.equals(need,other))
    {
        list.add(left);
    
    }
        other[s.charAt(left)-'a']--;
    left++;
    
}
        }
        return list;
    }
}
