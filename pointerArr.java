/* If the user inputs an array then the element present in that index will specify how many steps we can take.
    The goal is to reach the last index position.
    Eg.  Input :[1,1,1,0,5]
        Output : False because on reaching index 3 we are not allowed to move any further

        Input :[1,3,2,1]
        Output : True because on reaching index 1 we can easily reach the last index of the array
 */

import java.util.*;
class pointerArr{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String input=sr.nextLine();
        String arr[]=input.split(" ");
        int counter=0;
        for(int i=0;i<arr.length;i++){
            int move=Integer.valueOf(arr[i]);
            if(move==0){break;}
            else{
                i=(i+move)-1;
                if(i>=arr.length){
                    counter++;
                    break;
                }
            }
        }
        if(counter==1){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}