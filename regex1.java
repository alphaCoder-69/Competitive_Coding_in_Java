import java.util.*;
class regex1{
    public static void main(String argv[]){
        int value=0;int sum=0;
        Scanner sr=new Scanner(System.in);
        String input=sr.nextLine();
        String ip[]=input.split("\\.");
        if(ip.length==4){
            for(int i=0;i<ip.length;i++){
                char block[]=ip[i].toCharArray();
                    for(int j=0;j<block.length;j++){
                        value=block[j];
                        if(value>9){
                            System.out.println("false");
                            break;
                        }
                        sum=sum+value;
                    }
            }
            if(sum<=27*4){
                System.out.println("true");
            }
        }
        else{
            System.out.println("false");
        }
    }
}