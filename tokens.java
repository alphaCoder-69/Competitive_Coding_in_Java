import java.util.*;
class tokens{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String sentence=sr.nextLine();
        String newSentence="";
        char senArr[]=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
           if(senArr[i]==' ' || senArr[i]=='!' || senArr[i]==',' || senArr[i]=='?' || senArr[i]=='.' || senArr[i]=='_' || senArr[i]=='\'' || senArr[i]=='@'){
               senArr[i]='%';
           }
           newSentence=newSentence+senArr[i];
        }
        String tokenArr[]=newSentence.split("%");
        int size=tokenArr.length;
        System.out.println(size);
        for(int i=0;i<size;i++){
            System.out.println(tokenArr[i]);
        }
    }
}