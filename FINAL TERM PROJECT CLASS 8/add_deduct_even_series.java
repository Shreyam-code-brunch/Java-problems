import java.util.*;
public class add_deduct_even_series
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        int sum = 0,i;
        for(i=1;i<=n;i++)
        {
            if(i%2==0)
            sum-=i*2;
            else
            sum+=i*2;
        }
        System.out.println(sum);
    }
}