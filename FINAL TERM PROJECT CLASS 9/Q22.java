import java.util.Scanner;
public class Q22
{
    public static void main(String args[])
    {
  Scanner sc = new Scanner(System.in);  
  System.out.println("Enter the value of a and b such that a<b : ");
  int a=sc.nextInt();
  int b=sc.nextInt();
 int i;
        if(b>a)
        {
        for(i=a;i<b;i++)
        {
        int t=i,d,rev=0;
        while(t!=0) {
            d=t%10;
            rev=rev*10+d;
            t=t/10;
        }
        if(rev==i)
        {
            System.out.print(" "+rev); 
        }
        }
    }
  else
  System.out.println("Wrong input");
    }
}

