import java.util.*;
class pattern_checker{

    public static boolean identify(String pattern){
        String regex="^([a-zA-Z_$][a-zA-Z\\d_$]*)$";
        Pattern ptn= Pattern.compile(regex);
        if(pattern==null){return false;}
        Matcher m=ptn.Matcher(pattern);
        return m.matches();
    }

    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int test=sr.nextInt();
        for(int i=0;i<test;i++){
            String patrn=sr.nextLine();
            identify(patrn);
        }
    }
}