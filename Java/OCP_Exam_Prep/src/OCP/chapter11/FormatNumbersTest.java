/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter11;

import java.text.NumberFormat;
import java.util.Locale;

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
        double successRate = 0.802;
        var us = NumberFormat.getPercentInstance(Locale.US);
        System.out.println(us.format(successRate)); // 80%
        var gr = NumberFormat.getPercentInstance(Locale.GERMANY);
        System.out.println(gr.format(successRate)); // 80 %
    }
}
