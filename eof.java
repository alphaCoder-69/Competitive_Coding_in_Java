import java.util.*;
class eof{
    public static void main(String argv[]){
        int i=0;
        Scanner sr=new Scanner(System.in);
        while(sr.hasNextLine()){
            i++;
            String line=sr.next();
            System.out.println(i+" "+line);
        }
    }
}