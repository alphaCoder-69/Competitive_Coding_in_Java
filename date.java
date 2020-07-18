import java.util.*;
class date{
    public static void main(String argv[]){
        Scanner sr=new Scanner(System.in);
        String input=sr.nextLine();
        String para[]=input.split(" ");
        int date=Integer.valueOf(para[0]);
        int month=Integer.valueOf(para[1]);
        int year=Integer.valueOf(para[2]);
        Calendar calendar=Calendar.getInstance();
        calendar.set(year,month+1,date);
        int day=calendar.get(Calendar.DAY_OF_WEEK);
        switch(day){
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