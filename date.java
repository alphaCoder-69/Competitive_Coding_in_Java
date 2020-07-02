import java.util.*;
import java.text.SimpleDateFormat;
class date{
    public static void main(String argv[]){
        Scanner sr = new Scanner(System.in);
        Calendar calen=Calendar.getInstance();
        Date date=new Date();
        String dt=sr.nextLine();
        SimpleDateFormat dateformat=new SimpleDateFormat(dt);
        String sdate=dateformat.format(date); // Converting from string format to date format
        System.out.println(sdate);  
        calen.setTime(date);
        int no=calen.get(Calendar.DAY_OF_WEEK);
        switch(no){
            case 1:
            System.out.println("SUNDAY");
            break;
            case 2:
            System.out.println("MONDAY");
            break;
            case 3:
            System.out.println("TUESDAY");
            break;
            case 4:
            System.out.println("WEDNESDAY");
            break;
            case 5:
            System.out.println("THURSDAY");
            break;
            case 6:
            System.out.println("FRIDAY");
            break;
            case 7:
            System.out.println("SATURDAY");
            break;
        }
    }
}