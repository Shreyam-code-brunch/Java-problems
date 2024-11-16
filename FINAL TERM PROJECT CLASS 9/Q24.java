import java.util.Scanner;
public class Q24
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i;
        if(n%10==7|| n%7==0)
        System.out.println("It is a Buzz number");
        else
        {
            n=n+1;
            while(n!=0)
            {
                if(n%10==7 || n%7==0)
                {
                    System.out.println("The next buzz number: "+n);
                    break;
                }
                n++;
            } 
        }
    }
}

