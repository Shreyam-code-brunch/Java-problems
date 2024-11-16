import java.util.*;
public class Q25
{
    public static void main(String args[])
    { 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 for 1st pattern");
        System.out.println("Enter 2 for 2nd pattern");
        System.out.println("Enter the choice");
        int choice=sc.nextInt();
        switch(choice)
      {
        case 1: 
       {
        int i,j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<=5;j++)
            {
                System.out.print(j+" ");
            }
            System.out.println();
        } 
       }
        break;
        case 2:
        {
        int i,j;
    for(i=1;i<=5;i++)
        {
            for(j=1;j<=i;j++)
            {
                if(j%2==0)
                System.out.print("&"+" ");
                else
                System.out.print("@"+" ");
            }
            System.out.println();
        }
       }
        break;
        default: System.out.println("Wrong choice");
       } 
    }	
} 
