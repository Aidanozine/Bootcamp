/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

import java.text.NumberFormat;
import java.text.NumberFormat.Style;
//import static java.text.NumberFormat.Style.SHORT; //commented out for Line 91 - 105
import java.text.ParseException;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import static java.time.format.FormatStyle.SHORT;
import java.util.Locale;
import java.util.Locale.Category;
import java.util.stream.Stream;

/**
 *
 * @author desmo
 */
public class FormatNumbersTest {

    public static void main(String[] args) {
        //        int attendeesPerYear = 3_200_000;
        //        int attendeesPerMonth = attendeesPerYear / 12;
        //        
        //        var us = NumberFormat.getInstance(Locale.US);
        //        System.out.println(us.format(attendeesPerMonth)); // 266,666
        //        
        //        var gr = NumberFormat.getInstance(Locale.GERMANY);
        //        System.out.println(gr.format(attendeesPerMonth)); // 266.666
        //        
        //        var ca = NumberFormat.getInstance(Locale.CANADA_FRENCH);
        //        System.out.println(ca.format(attendeesPerMonth)); // 266 666
        //-------------------------------------------------------
        //        double price = 48;
        //        var myLocale = NumberFormat.getCurrencyInstance();
        //        System.out.println(myLocale.format(price));
        //
        //        double priceGer = 48;
        //        var localeGer = NumberFormat.getCurrencyInstance(Locale.GERMANY);
        //        System.out.println(localeGer.format(price));
        //
        //        double priceItaly = 48;
        //        var localeItaly = NumberFormat.getCurrencyInstance(Locale.ITALY);
        //        System.out.println(localeItaly.format(price));
        //
        //        double priceUK = 48;
        //        var localeUK = NumberFormat.getCurrencyInstance(Locale.UK);
        //        System.out.println(localeUK.format(price));
        //-------------------------------------------------------
        //        double successRate = 0.802;
        //        
        //        var us = NumberFormat.getPercentInstance(Locale.US);
        //        System.out.println(us.format(successRate)); // 80%
        //        
        //        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
        //        System.out.println(gr.format(successRate)); // 80 %
        //--------------------------------------------------------
        //        try {
        //            String s = "40.45";
        //            
        //            var en = NumberFormat.getInstance(Locale.US);
        //            System.out.println(en.parse(s)); // 40.45
        //            
        //            var fr = NumberFormat.getInstance(Locale.FRANCE);
        //            System.out.println(fr.parse(s)); // 40
        //        } catch (ParseException e) {
        //            System.out.println(e);
        //        }
        //---------------------------------------------------------
        //        try {
        //            String income = "$92,807.99";
        //            var cf = NumberFormat.getCurrencyInstance(Locale.US);
        //            double value = (Double) cf.parse(income);
        //            System.out.println(value); // 92807.99
        //        } catch (ParseException e) {
        //            System.out.println(e);
        //        }
        //----------------------------------------------------------
        //        var formatters = Stream.of(
        //                NumberFormat.getCompactNumberInstance(), //default is short --> Line 78 + 79 are the same
        //                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.SHORT),
        //                NumberFormat.getCompactNumberInstance(Locale.getDefault(), Style.LONG),
        //                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.SHORT),
        //                NumberFormat.getCompactNumberInstance(Locale.GERMAN, Style.LONG),
        //                NumberFormat.getNumberInstance());
        //        formatters.map(s -> s.format(7_123_456)).forEach(System.out::println);
        //-----------------------------------------------------------
        //        Locale.setDefault(new Locale("en", "US"));
        //        var italy = new Locale("it", "IT");
        //        var dt = LocalDateTime.of(2022, Month.OCTOBER, 20, 15, 12, 34);
        //
        //        print(DateTimeFormatter.ofLocalizedDate(SHORT), dt, italy);
        //
        //        print(DateTimeFormatter.ofLocalizedTime(SHORT), dt, italy);
        //
        //        print(DateTimeFormatter.ofLocalizedDateTime(SHORT, SHORT), dt, italy);
        //-------------------------------------------------------------
        var spain = new Locale("es", "ES");
        var money = 1.23;

        Locale.setDefault(new Locale("en", "US"));
        printCurrency(spain, money); // $1.23, Spanish

        Locale.setDefault(Category.DISPLAY, spain);
        printCurrency(spain, money); // $1.23, español

        Locale.setDefault(Category.FORMAT, spain);
        printCurrency(spain, money); // 1,23 €, español
    }

    public static void print(DateTimeFormatter dtf,
            LocalDateTime dateTime, Locale locale) {
        System.out.println(dtf.format(dateTime) + " --- "
                + dtf.withLocale(locale).format(dateTime));
    }

    public static void printCurrency(Locale locale, double money) {
        System.out.println(
                NumberFormat.getCurrencyInstance().format(money)
                + ", " + locale.getDisplayLanguage());
    }
}