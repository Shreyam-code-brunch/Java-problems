import java.util.Scanner;
public class twelve 
{
    public void series () {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter n");
        int n= sc.nextInt();
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) 
                sum -= i * 2;
            else
                sum += i * 2;
        } 
        System.out.println("Sum = " + sum);
    }
}
