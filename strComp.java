import java.util.*;
class strComp{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String word=sr.nextLine();
        int len=sr.nextInt();
        int small=0,large=0,smallCounter=0,largeCounter=0;
        String sub[] = new String[word.length()-len+1];
        int count=len;
        for(int i=0;i<(word.length()-len+1);i++){
            sub[i]=word.substring(i,count);
            count=count+1;  
        }
        for(int j=0;j<(word.length()-len+1);j++){
            smallCounter=0;
            largeCounter=0;
            for(int k=0;k<(word.length()-len+1);k++){
                int a=sub[j].compareTo(sub[k]);
                if(a>0){
                    largeCounter++;
                }
                else if(a<0){
                    smallCounter++;
                }
                else{
                    continue;
                }
            }
            if(largeCounter==(word.length()-len)){
                large=j;
                }
            if(smallCounter==(word.length()-len)){
                small=j;
                }
        }
        System.out.println(sub[small]);
        System.out.println(sub[large]);
    }
}