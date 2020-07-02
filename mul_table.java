import java.util.*;
class table{
    public static void main(String[] args) {
        int i,N,pro;
        Scanner sr=new Scanner(System.in);
        N=sr.nextInt();
        for(i=1;i<=10;i++){
            pro=i*N;
            System.out.print(N+" x "+i+" = "+pro);
            System.out.println();
        }
        sr.close();
    }

}