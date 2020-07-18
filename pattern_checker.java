import java.util.*;
import java.util.regex.*;
class pattern_checker{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int test=sr.nextInt();
        sr.nextLine();
        for(int i=0;i<test;i++){
            try{
                String regex=sr.nextLine();
                Pattern pattern= Pattern.compile(regex);
                System.out.println("Valid");
            }
            catch(Exception e){
                System.out.println("Invalid");
            }
            
        }
    }
}