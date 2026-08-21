class Solution {
    public int maxVowels(String s, int k)
    
    {
        int left=0;
        int vowels=0;
        int max_vowels=0;
        for(int right=0;right<s.length();right++)
        {
            if(s.charAt(right)=='a'||s.charAt(right)=='e'||s.charAt(right)=='i'||s.charAt(right)=='o'||s.charAt(right)=='u')
            {
                vowels++;
            }A
            {
                vowels--;
            }
            left++;
               
            }
        }
        return max_vowels;
    }
}
