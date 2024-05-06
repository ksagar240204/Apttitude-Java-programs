public class Transpose_matrix {
    public static void main(String args[])
    {
        int a[][]={{1,2,3},{4,5,6},{7,8,9}};
        int[][] trans=new int[a.length][a.length];
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a.length;j++)
            {
                trans[i][j]=a[j][i];
            }
            System.out.println();
        }
        for(int i=0;i<trans.length;i++)
        {
            for(int j=0;j<trans.length;j++)
            {
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
}