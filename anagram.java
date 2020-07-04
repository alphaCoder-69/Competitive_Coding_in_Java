import java.util.*;
class anagram{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        int count=0;
        String str1=sr.nextLine();
        String str2=sr.nextLine();
        str1=str1.toLowerCase();
        str2=str2.toLowerCase();
        char arr1[]=str1.toCharArray();
        char arr2[]=str2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(arr1.length==arr2.length){
            for(int i=0;i<arr1.length;i++){
                if(arr1[i]==arr2[i]){
                    count++;
                }
            }
            if(count!=arr1.length){
                System.out.println("Not Anagrams");
            }
            else{
                System.out.println("Anagrams");
            }
        }
        else{
            System.out.println("Not Anagrams");
        }
    }
}