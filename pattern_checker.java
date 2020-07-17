import java.util.*;
import java.util.regex.*;
class pattern_checker{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int test=sr.nextInt();
        sr.nextLine();
        for(int i=0;i<test;i++){
            String regex=sr.nextLine();
            Pattern pattern= Pattern.compile(regex);
            //if(pattern==null){System.out.println("false");}
            boolean m=pattern.matcher(regex).matches();
            System.out.println(m);
        }
    }
}