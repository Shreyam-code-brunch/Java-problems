import java.util.Scanner;
public class Q19
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int d,sum=0,t=n;
        while(t!=0)
        {
            d=t%10;
            sum+=d;
            t=t/10;
        }
        if(n%sum==0)
        System.out.println("It is a Niven number");
        else 
        System.out.println("It is not a Niven number");
    }
} 



