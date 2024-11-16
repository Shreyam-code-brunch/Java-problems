import java.util.Scanner;
public class Q15
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int t=n,evenS=1,d;
        while(t!=0)
        {
            d=t%10;
            if(d%2==0)
            {
             int s=d+1;
             evenS*=s;
           }
            t=t/10; 
        }
        System.out.println("The product of successor of even digits are :"+evenS);
    }
} 
