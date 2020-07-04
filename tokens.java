import java.util.*;
class tokens{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int j=0;
        String sentence=sr.nextLine();
        String newSentence="";
        char senArr[]=sentence.toCharArray();
        for(int i=0;i<sentence.length();i++){
            if(senArr[i]==' ' || senArr[i]=='!' || senArr[i]==',' || senArr[i]=='?' || senArr[i]=='.' || senArr[i]=='_' || senArr[i]=='\'' || senArr[i]=='@'){
                if(i-j!=1 && i!=0){
                    senArr[i]='%';
                    j=i;
                }
                else if(i==0){
                    j=i;
                    continue;
                }
                else{
                    j=i;
                    continue;
                }
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