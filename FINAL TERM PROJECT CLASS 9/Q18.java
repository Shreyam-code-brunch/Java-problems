import java.util.Scanner;
public class Q18
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int d,flag=0;
        while(n!=0)
        {
            d=n%10;
            if(d==0)
            {
                flag++;
                break;
            }
            n=n/10;
        }
        if(flag==1)
        System.out.println("It is a Duck number");
        else 
        System.out.println("It is not a Duck number");
    }
} 

