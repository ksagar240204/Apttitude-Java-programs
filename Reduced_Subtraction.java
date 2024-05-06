import java.util.Scanner;
public class Reduced_Subtraction
{
    public static int reduce(int n)
    {
        while(n>9)
        {
            String s1=n+"";
            int redu=0;
            for(int i=0;i<s1.length()-1;i++)
            {
                int digit1=s1.charAt(i)+'0';
                int digit2=s1.charAt(i+1)+'0';
                redu=redu*10+Math.abs(digit1+digit2);
            }
            n=redu;
            
        }
        return n;
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        int a=6259;
        int b=reduce(a);
        System.out.println(b);
        
    }
}
    