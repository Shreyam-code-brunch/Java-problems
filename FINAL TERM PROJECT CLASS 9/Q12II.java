import java.util.Scanner;
public class Q12II
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the value of 'n': ");
        int n = sc.nextInt();       
        int i,sn=0,sp=0,sum=0;
        for(i=2;i<=n;i+=2)
        {
            if(i%4==0)
            sn+=i;
            else
            sp+=i;
        }
        sum=sp-sn;
        System.out.println("S= "+sum);
    }
}
