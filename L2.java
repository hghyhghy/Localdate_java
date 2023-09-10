import java.time.LocalDate;

import java.time.format.DateTimeFormatter;


public class L2 

{
       public static void main(String[] args) 
       
       {
              
             // converting local date to String 

             LocalDate d1= LocalDate.now();

             String d1Str= d1.format(DateTimeFormatter.ISO_DATE);

             System.out.println("Date1 is String" + d1Str);


            LocalDate d2= LocalDate.of(2016,5,01);

           String d2Str= d2.format(DateTimeFormatter.ISO_DATE);

                        System.out.println("Date2 is String" + d2Str);


        LocalDate d3= LocalDate.of(2002,5,01);


        String d3Str= d3.format(DateTimeFormatter.ISO_DATE);


              System.out.println("Date3 is String" + d3Str);



           
       }
}
