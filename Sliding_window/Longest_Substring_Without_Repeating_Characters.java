class Solution {
    public int lengthOfLongestSubstring(String s)
    {
        int left=0;
        HashMap<Character,Integer>map=new HashMap<>();
        int Maxlen=0;
        for(int right=0;right<s.length();right++)
        {
            map.put(s.charAt(right),map.getOrDefault(s.charAt(right),0)+1);
            while(map.get(s.charAt(right))>1)
            {
               map.put(s.charAt(left),map.get(s.charAt(left))-1);
               if(map.get(s.charAt(left))==0)
               {
                map.remove(s.charAt(left));
               }
               left++;
            }
            Maxlen=Math.max(right-left+1,Maxlen);
        }
        return Maxlen;
    }
}
