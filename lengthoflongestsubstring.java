import java.util.*;
public class lengthoflongestsubstring{
    public static int lengthoflongestsubstring(String s)
    {
        int maxcount=0;
        int i=0;
        int j=0;
        int strlen=s.length();
        Set<Character>st=new HashSet<>();
 while(i<strlen & j<strlen)
        {
            if(!st.contains(s.charAt(j)))
            {
                st.add(s.charAt(j));
                j++;
                maxcount=Math.max(maxcount,j-i+1);
            }
            else{
                st.remove(s.charAt(i));
                i++;
            }
        }
    return maxcount;
    }
public static void main(String[] args)
{
    String str="abcdabcdbb";
    int len=lengthoflongestsubstring(str);
    System.out.println("Length :"+len);
}
}
                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         
        
           