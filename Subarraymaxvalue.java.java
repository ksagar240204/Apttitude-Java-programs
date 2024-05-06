// You are using Java

import java.util.*;
public class Subarraymaxvalue{
    public static void main(String args[]){
        int a[]={1,2,3,4,5,6,7};
        int sum=0,maxsum=0;
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++)
                {
                    System.out.print(a[k]+" ");
                }
                System.out.println();
            }
                
        }
        System.out.println("END");
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length;j++){
                for(int k=i;k<=j;k++)
                {
                    sum+=a[k];
                    System.out.println(sum);
                }
                System.out.println();
            }
                
        }
    }
}