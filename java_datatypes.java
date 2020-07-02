import java.util.*;
class java_datatypes{
    public static void main(String[] args) {
        long num;int count;
        Scanner sr=new Scanner(System.in);
        int test=sr.nextInt();
        for(int i=1;i<=test;i++){
            long input=sr.nextLong();
            num=input;
            count=0;
            while(num!=0){
                count++;
                num=num/10;
            }
            if(count<=3){System.out.println("* short");}
            if(count<=10){System.out.println("* int");}
            if(count<=19){System.out.println("* long");}
            if(count>19){System.out.println("This number cannot be contained");}
        }
    }
}