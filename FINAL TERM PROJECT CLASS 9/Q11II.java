import java.util.Scanner;
public class Q11II
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);    
        System.out.println("Enter the number of terms: ");
        int n = sc.nextInt();       
        int n1 = 1, n2 = 1;
        int sum = n1+n2; 
        for (int i = 3; i <= n; i++)
        {
            int n3 = n1 + n2;
            sum +=n3;
            n1 = n2;
            n2 = n3;
        }
        System.out.print("S= "+sum);
    }
}
