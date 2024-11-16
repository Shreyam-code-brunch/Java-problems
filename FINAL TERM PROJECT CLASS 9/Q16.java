import java.util.Scanner;
public class Q16
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        int i,flag=0;
        for(i=1;i<=n;i++)
        {
            if(i*(i+1)==n)
            flag+=1;
        }
        if(flag==1)
        System.out.println("The number is pronic ");
        else
        System.out.println("The number is not pronic ");
    }
}
