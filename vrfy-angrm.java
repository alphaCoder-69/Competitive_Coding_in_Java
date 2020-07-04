import java.util.*;
import java.lang.*;
import java.io.*;
class angrms 
{
    public static void main(String [] args)
    {
        int i,j,str_l,str2_l,v=0;
        char c ;
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        String str2 = sc.nextLine();
        str_l=str.length();
        str2_l=str2.length();
        int dne[]=new int[str2_l];
        if(str_l==str2_l)
        {
        for(i=0;i<str_l;i++)
        {
            c=str.charAt(i);
            v=0;
            for(j=0;j<str2_l;j++)
            {
                if(str2.charAt(j)==c && dne[j]==0)
                {
                    dne[j]=1;
                    v=1;
                    break;
                }

            }
            if(v==0){
                break;
            }
        }
        }
        if(v==1)
        System.out.println("anagram");
        else
        System.out.println("not anagram");
    }
}