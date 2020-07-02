import java.util.*;
import java.text.*;
class rupee{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        double payment=sr.nextDouble();
        //NumberFormat ind=NumberFormat.getInstance(Locale.INDIA);
        NumberFormat us=NumberFormat.getInstance(Locale.US);
        NumberFormat chinaMadarchod=NumberFormat.getInstance(Locale.CHINA);
        NumberFormat france=NumberFormat.getInstance(Locale.FRANCE);
        System.out.println("US: $"+us.format(payment));
        //System.out.println("India: Rs."+ind.format(payment));
        System.out.println("China: 􀀀"+chinaMadarchod.format(payment));
        System.out.println("France: "+france.format(payment)+"€");
    }
}