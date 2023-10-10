/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author desmo
 */
public class FormatTest {

    public static void main(String[] args) {
//        double d = 1234.567;
//        NumberFormat f1 = new DecimalFormat("###,###,###.0");
//        System.out.println(f1.format(d)); // 1,234.6
//
//        NumberFormat f2 = new DecimalFormat("000,000,000.00000");
//        System.out.println(f2.format(d)); // 000,001,234.56700
//
//        NumberFormat f3 = new DecimalFormat("Your Balance $#,###,###.##");
//        System.out.println(f3.format(d)); // Your Balance $1,234.57
//-------------------------------------------------------------
//        LocalDate date = LocalDate.of(2023, Month.OCTOBER, 9);
//        System.out.println(date.getDayOfWeek());
//        System.out.println(date.getMonth());
//        System.out.println(date.getYear());
//        System.out.println(date.getDayOfYear());
//
        LocalDate d = LocalDate.of(2023, Month.OCTOBER, 9);
        LocalTime t = LocalTime.of(16, 39, 34);
        LocalDateTime dt = LocalDateTime.of(d, t);
//
//        System.out.println(d.format(DateTimeFormatter.ISO_LOCAL_DATE));
//        System.out.println(t.format(DateTimeFormatter.ISO_LOCAL_TIME));
//        System.out.println(dt.format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

//        var f = DateTimeFormatter.ofPattern("MMMM dd, yyyy 'at' hh:mm");
//        System.out.println(dt.format(f));
//        
//        var formatter1 = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
//        System.out.println("formatter1: " + dt.format(formatter1));
//        
//        var formatter2 = DateTimeFormatter.ofPattern("MM_yyyy_-dd");
//        System.out.println("formatter2: " + dt.format(formatter2));
//        var formatter3 = DateTimeFormatter.ofPattern("h:mm z");
//        System.out.println(dt.format(formatter3)); //no zone in Local Date Time - generates exception
//--------------------------------------------------------------------
        var dateTime = LocalDateTime.of(2023, Month.OCTOBER, 10, 9, 3, 30);
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm:ss");
        System.out.println(dateTime.format(formatter)); // 10/20/2022 06:15:30
        System.out.println(formatter.format(dateTime)); // 10/20/2022 06:15:30
    }
}
