
import java.time.LocalDate;

// checking wheather a year is leap year or not


public class L0 
{
       
       public static void main(String[] args)
       
       {
              LocalDate date1=LocalDate.of(2017,8,13);

              System.out.println(date1.isLeapYear());

              LocalDate date2=LocalDate.of(2020,11,30);

              System.out.println(date2.isLeapYear());

       }
}
