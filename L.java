

//  local date and time using java 

import java.time.LocalDate;

public class L
{
       public static void main(String[] args) {
              
              LocalDate date= LocalDate.now();

              LocalDate yesterday= date.minusDays(1);

              LocalDate tomorrow= yesterday.plusDays(2);

              System.out.println("Today Date:"+ date);
                            System.out.println("yesterday Date:"+ yesterday);
              System.out.println("tomorrow Date:" + tomorrow);

       }
}

