import java.util.Scanner;
public class Q21
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 'a' for Fibonacci series ");
        System.out.println("Enter 'b' for sum of the digit series ");
        System.out.println("Enter the choice: ");
        char choice=sc.next().charAt(0);
        switch(choice)
        {
          case 'a':
        {
           int i,n1=0,n2=1,n3=0;
           System.out.print(n1+" "+n2);
           for(i=3;i<=10;i++)
            {
             n3=n1+n2;
             System.out.print(" "+n3);
             n1=n2;
             n2=n3;
            }
        }
            break;
          case 'b':
        {
           System.out.println("Enter a number");
           int n=sc.nextInt();
           int sum=0,d;
           while(n!=0)
           {
               d=n%10;
               sum+=d;
               n=n/10;
           }
           System.out.println("The sum of the digits :"+sum);
        }
           break;
          default: System.out.println("Wrong choice");
        }
    }
}
