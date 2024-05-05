import java.util.Scanner;
public class Main {
    public static void main(String args[])
    {
        System.out.println("Hello");
        int a[][]={{1,2,3,4},{12,13,14,5},{11,16,15,6},{10,9,8,7}};
        for(int i=0;i<a.length;i++){
            for (int j=0;j<a.length;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        int top=0,bottom=a.length-1;
        int left=0,right=a[0].length-1;
        
        while(top<=bottom & left<=right){
            for(int i=left;i<right;i++){
                System.out.print(a[top][i]+" ");
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(a[i][right]+" ");
            }
            right--;
            for(int i=right;i>=left;i--){
                System.out.print(a[bottom][i]+" ");
            }
            bottom--;
            for(int i=bottom;i>=top;i--){
                System.out.print(a[i][left]+" ");
            }
            left++;
                    
                
        }
    }
}
