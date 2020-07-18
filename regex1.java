import java.util.*;
import java.util.regex.*;

class regex1{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String ip=sr.nextLine();
        String regex="[0-2][0-5]+.[0-2][0-5]+.[0-2][0-5]+.[0-2][0-5]+";
        Pattern pattern=Pattern.compile(regex);
        boolean match=pattern.matcher(ip).matches();
        System.out.println(match);
    }
}