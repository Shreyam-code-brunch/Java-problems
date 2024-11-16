import java.util.*;
public class even_digit_add1_product
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i,p=1,t=n,j=0,r=0;
        for(i=1;i<=n;i*=10)
        {
            n=n%10;
            p=p*n;
            if(j%2==0)
            p=r;
        }
        
        System.out.println(r);
    }
}