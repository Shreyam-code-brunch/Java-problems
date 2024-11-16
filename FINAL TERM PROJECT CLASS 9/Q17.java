import java.util.Scanner;
public class Q17
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i,flag=0,j;
    for(i=1;i<=n;i++)
    { 
        if(n%i==0)
         flag++;
    } 
     if(flag==2)
        System.out.println("It is a Prime number");
        else
        { n=n+1;
        while(n!=0)
        { int flag2=0;
        for(j=1;j<=n;j++)
        {
         if(n%j==0)
         flag2++;
        } 
         if(flag2==2){
         System.out.println("Not a prime number and the next prime number:"+n); 
         break; 
        } 
        n++;
        }
     }
    }
}
