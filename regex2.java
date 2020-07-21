import java.util.*;
import java.util.regex.*;

class regex2{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int len=sr.nextInt();
        sr.nextLine();
        for(int i=0;i<len;i++){
            String sentence=sr.nextLine();
            String words[]=sentence.split(" ");
            for(int j=0;j<words.length;j++){
                int count=0;
                if(words[j]==""){
                    continue;
                }
                else{
                    for(int k=0;k<words.length;k++){
                        if(words[j].equalsIgnoreCase(words[k])){
                            count++;
                        }
                        if(count>1){
                            words[k]="";
                        }
                    }
                }
            }
            System.out.println(Arrays.toString(words));
        }
    }
}