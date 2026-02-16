           /*  BY MAKING NEW ARRAY 
class Solution {
    public void rotate(int[] nums, int k)
    {
        int [] temp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
              temp[(i+k)%nums.length]=nums[i];
        }
        for(int i=0;i<nums.length;i++)
        {
            nums[i]=temp[i];
        }
    }
}/*

                  /* REVERSE METHOD*/
class Solution 
{
    public void rotate(int[] nums, int k)
    {
        k=k%nums.length;
        reverse(nums,0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k,nums.length-1);
    }
     private void reverse(int []arr,int start,int end)
        {
            int temp;
           while(end>start)
            {
            temp=arr[end];
            arr[end]=arr[start];
            arr[start]=temp;
            end--;
            start++;
            }
        }
}
    

