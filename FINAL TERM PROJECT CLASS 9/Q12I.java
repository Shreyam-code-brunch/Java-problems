import java.util.Scanner;
public class Q12I
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the value of 'n': ");
        int n = sc.nextInt();       
        int i;
        for(i=2;i<=n;i+=2)
        {
            System.out.print(i+" ");
        }
    }
} 