class x
{
    public static void main(String[] args){
        int[][] array={{1,2,3},{4},{8,9,5}};
        array[2][1]=56;
        int x = array[2][1];
        System.out.println(x);
        // TESTING  
        int a=0;
        for(int i=a;i<5;i=a){
            System.out.println(i);
            a=a+2;
    }
}


// STAR PATTERN //
public static void star(){
    int i,j;
    for(i=0;i<5;i++){
        for(j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}

 }