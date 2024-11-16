import java.util.Scanner;
public class Q14
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the value of 'a': ");
        int a=sc.nextInt();
        System.out.println("Enter the value of 'n': ");
        int n = sc.nextInt();       
        int i,sum=0;
        for(i=1;i<=n;i++)
        {
            sum+=Math.pow(a,i);
        }
        System.out.println("S= "+sum);
    }
}
