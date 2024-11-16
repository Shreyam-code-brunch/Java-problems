import java.util.*;
public class pronic 
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int i,f=0;
        for(i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            {
                f=1;
                break;
            }
        }
        if(f==1)
        System.out.println("It is a pronic number");
        else
        System.out.println("It is not a pronic number");   
    }
}