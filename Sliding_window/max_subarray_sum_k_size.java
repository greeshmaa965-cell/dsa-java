import java.util.Scanner;
public class max_subarray
{
   public static void main(String [] args)
   {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int arr[]=new int[n];
    for(int i=0;i<n;i++)
    {
        int x=sc.nextInt();
        arr[i]=x;
    }
    int k=sc.nextInt();
    int left=0;
    int ans=0;
    int sum=0;
    for(int right=0;right<n;right++)
    {
        sum+=arr[right];
        if(right-left+1==k)
        {
           ans=Math.max(ans,sum);
           sum-=arr[left];
           left++;
        }
    }
    System.out.println(ans);
   }
}
