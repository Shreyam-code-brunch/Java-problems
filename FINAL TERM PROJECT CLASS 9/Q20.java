import java.util.Scanner;
public class Q20
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int d,sum=0,t=n,prod=1;
        while(t!=0)
        {
            d=t%10;
            sum+=d;
            prod*=d;
            t=t/10;
        }
        if(sum==prod)
        System.out.println("It is a Spy number");
        else 
        System.out.println("It is not a Spy number");
    }
} 
