import java.util.*;
class strPalin{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int count=0,temp=0,result=0;
        String word=sr.nextLine();
        char wordarr[]=word.toCharArray();
        count=word.length()/2;
        temp=word.length()-1;
        for(int i=0;i<count;i++){
            if(wordarr[i]!=wordarr[temp]){
                result++;
                break;
            }
            else{
                temp=temp-1;
            }
        }
        if(result==0){System.out.println("String is Palindrome");}
        else{System.out.println("String is not a Palindrome string");}
    }
}