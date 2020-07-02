import java.util.*;
class scanner{
    public static void main(String argv[]){
        int value=0;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        char block[]=name.toCharArray();
        value= block[0];
        System.out.println(value);
    }
}