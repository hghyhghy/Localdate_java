import java.time.LocalDate;
import java.time.LocalDateTime;


public class L1 
{
     public static void main(String[] args) 
     
     {
        LocalDate date1= LocalDate.of(2023,9,11);

        LocalDateTime datetime= date1.atTime(1,57,9);

        System.out.println(datetime);

     }  
}
