import java.util.*;
class loops2{
    public static void main(String[] args) {
        int a,b,n,block;
        double term,seg;
        Scanner sr=new Scanner(System.in);
        int querry=sr.nextInt();
        for(int i=1;i<=querry;i++){
            a=sr.nextInt();
            term=a;
            b=sr.nextInt();
            n=sr.nextInt();
            for(int j=0;j<n;j++){
                seg=Math.pow(2, j)*b;
                term=term+seg;
                block=(int)term;
                System.out.print(block+" ");
            }
            System.out.println();
        }
        sr.close();
    }
}