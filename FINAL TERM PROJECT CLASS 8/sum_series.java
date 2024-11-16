import java.util.*;
public class sum_series 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last term of the series");
        int n = sc.nextInt();
        int i,sum=0;
        {
            for(i=1;i<=n;i++)
            sum=sum+i;
        }
        System.out.print(sum);
    }
}