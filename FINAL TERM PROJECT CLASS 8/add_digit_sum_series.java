import java.util.*;
public class add_digit_sum_series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the last term of the series");
        int n = sc.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            for (int j=1;j<=i;j++)
            sum = sum+j;
        }
        System.out.println(sum);
    }
}