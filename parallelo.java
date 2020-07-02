//   PRACTISING STATIC INITIALIZING BLOCKS

import java.util.*;
class parallelo{
    static int length,breadth;
    static{
        Scanner sr=new Scanner(System.in);
        length=sr.nextInt();
         breadth=sr.nextInt();
        if(length<0 || breadth<0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String argv[]){
        int area;
        parallelo obj=new parallelo();        
        area=length*breadth;
        System.out.println(area);
    }
}