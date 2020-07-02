import java.util.*;
class strIntro{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String first=sr.nextLine();
        String second=sr.nextLine();
        int len1=first.length();
        int len2=second.length();
        char arr1[]=first.toCharArray();
        char arr2[]=second.toCharArray();
        int len=((len1-len2)>0)?len2:len1;
        for(int i=0;i<len;i++){
            if(arr1[i]==arr2[i]){
                continue;
            }
            else{
                int let1=arr1[i];
                int let2=arr2[i];
                if(let1>let2){
                    System.out.println("Yes");
                    break;
                }
                else{
                    System.out.println("No");
                    break;
                    }             
            }
        }


        // REPLACING CHARACTERS OF A STRING
        first=first.replace(arr1[0],Character.toUpperCase(arr1[0]));
        second=second.replace(arr2[0],Character.toUpperCase(arr2[0]));
        System.out.println(first+" "+second);
    }
}