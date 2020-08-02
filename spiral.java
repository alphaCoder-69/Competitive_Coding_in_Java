import java.io.*;
class spiral{
    public static void main(String argv[]){
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int j,a=0,count;
        for(int i=0;i<3;i++){
           a=(i%2==0)?0:2;
            count=0;
            j=a;
            while(j>=0){
                System.out.print(arr[i][j]+" ");
                count++;
                if(count==3){
                    break;
                }
                if(i%2==0){
                    j++;
                }else{
                    j--;
                }
            }
            System.out.println();
        }
    }
}