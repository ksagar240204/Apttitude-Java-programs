// You are using Java
import java.util.Scanner;
public class Get_Array{
    public static void main(String args[])
    {
        Scanner s1=new Scanner(System.in);
        int n;
        
        
        System.out.println("Enter the size :");
        n=s1.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s1.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.print(a[i]+" ");
            
        }
    }
}