import java.io.*;
class insert{
    public static void main(String args[])throws IOException{
        int a;
        String name;
        InputStreamReader r=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(r);
        System.out.println("Enter your name");
        name=br.readLine();
        System.out.println("Enter a number");
        a=Integer.parseInt(br.readLine());
        System.out.println("Your name is "+name);
        System.out.println(a);        
    }
}