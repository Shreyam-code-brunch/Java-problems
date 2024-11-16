import java.util.*;
public class Q23
{
    public static void main(String args[])
    {
        int i;
        System.out.print("The four-digit Armstrong numbers are: ");
        for(i=1000;i<=9999;i++)
        {
          int t=i,sum=0,d;  
        while(t!=0)
        {
            d=t%10;
            sum+=Math.pow(d,4);
            t=t/10;
        }
        if(sum==i)
        System.out.print(i+" ");
        }
    }
} 
