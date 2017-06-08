# pro2.javaimport java.io.*;
import java.util.*;
public class p
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        if(a>0)
        {
            System.out.println("Positive");
        }
        if(a<0)
        {
            System.out.println("Negetive");
        }
        if(a==0)
        {
            System.out.println("Zero");
        }
    }
}
