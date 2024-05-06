
public class Negativeinarray{
    public static void main(String args[]){
        int a[]={1,-2,3,-4,7,4,-7,8};
        
        int sum=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<0){
                System.out.println(a[i]);
            }
        }
        
    }
}