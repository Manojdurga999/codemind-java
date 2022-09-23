import java.util.Scanner;
class sample
{
    public static int add(int n)
    {
        int r,sum=0;
        while(n>0)
        {
        r=n%10;
        sum=sum+r;
        n=n/10;
        }
        return sum;
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(n>9)
        {
            n=add(n);
        }
        System.out.println(n);
    }
}