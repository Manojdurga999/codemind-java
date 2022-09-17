import java.util.Scanner;
class sample
{
    public static boolean isPalindrome(int n)
    {
        int sum=0,r,t=n;
        while(n>0)
        {
            r=n%10;
            sum=sum*10+r;
            n=n/10;
        }
        if(sum==t)
        return true;
        else
        return false;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int count=0,i,x[],n;
        n=sc.nextInt();
        x=new int[n];
        for(i=0;i<n;i++)
        x[i]=sc.nextInt();
        for(i=0;i<n;i++)
        {
            if(isPalindrome(x[i]))
            count++;
        }
        System.out.println(count);
    }
}