import java.util.Scanner;
public class Q13
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the limit: ");
        int n=sc.nextInt();
        int i,j,sum=0;
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=i;j++)
            {
                sum+=j;
            }
        }
        System.out.println("S: "+sum);
    }
} 
