import java.util.*;
class sub{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String input=sr.nextLine();
        String next=sr.nextLine();
        String arr[]=next.split(" ");
        int start=Integer.valueOf(arr[0]);
        int end=Integer.valueOf(arr[1]);
        System.out.println(input.substring(start,end));
    }
}