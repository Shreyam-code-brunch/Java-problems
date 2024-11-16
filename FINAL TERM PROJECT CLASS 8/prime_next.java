import java.util.*;
public class prime_next
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i,c=0,t=n,l=1;
        for(i=1;i<=n;i++)
        {
            if(n%i==0)
            c++;
        }
        if(c==2)
        System.out.println("It is a prime number");
        else
        System.out.println("Not a prime number");
        t++;
        if(t%i==0)
        l++;
        if(l==2)
        System.out.println(t+" is the next prime number");
    } 
} 