/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package OCP.chapter4;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.temporal.ChronoUnit;

/**
 *
 * @author desmo
 */
public class WorkingWithPeriods {

//    public static void main(String[] args) {
//        var start = LocalDate.of(2022, Month.JANUARY, 1);
//        var end = LocalDate.of(2022, Month.MARCH, 30);
//        performAnimalEnrichment(start, end);
//    }
//
//    private static void performAnimalEnrichment(LocalDate start, LocalDate end) {
//        var upTo = start;
//        while (upTo.isBefore(end)) { // check if still before end
//            System.out.println("give new toy: " + upTo);
//            upTo = upTo.plusMonths(1); // add a month
//        }
//    }
//    public static void main(String[] args) {
//        var start = LocalDate.of(2022, Month.JANUARY, 1);
//        var end = LocalDate.of(2022, Month.MARCH, 30);
//        var period = Period.ofMonths(1); // create a period
//        performAnimalEnrichment(start, end, period);
//    }
//
//    private static void performAnimalEnrichment(LocalDate start, LocalDate end,
//            Period period) { // uses the generic period
//        var upTo = start;
//        while (upTo.isBefore(end)) {
//            System.out.println("give new toy: " + upTo);
//            upTo = upTo.plus(period); // adds the period
//        }
//    }
    public static void main(String[] args) {
        var date = LocalDate.of(2022, 1, 20);
        var time = LocalTime.of(6, 15);
        var dateTime = LocalDateTime.of(date, time);
        var period = Period.ofMonths(1);

        System.out.println(date.plus(period)); // 2022–02–20
        System.out.println(dateTime.plus(period)); // 2022–02–20T06:15
//        System.out.println(time.plus(period)); // Exception

        var dateA = LocalDate.of(2022, 1, 20);
        var timeA = LocalTime.of(6, 15);
        var dateTimeA = LocalDateTime.of(date, time);
        var periodA = Period.ofMonths(1);

        System.out.println(dateA.plus(periodA)); // 2022–02–20
        System.out.println(dateTimeA.plus(periodA)); // 2022–02–20T06:15
//        System.out.println(timeA.plus(periodA)); // Exception

        var daily = Duration.of(1, ChronoUnit.DAYS);
        var hourly = Duration.of(1, ChronoUnit.HOURS);
        var everyMinute = Duration.of(1, ChronoUnit.MINUTES);
        var everyTenSeconds = Duration.of(10, ChronoUnit.SECONDS);
        var everyMilli = Duration.of(1, ChronoUnit.MILLIS);
        var everyNano = Duration.of(1, ChronoUnit.NANOS);

        var one = LocalTime.of(5, 15);
        var two = LocalTime.of(6, 30);
        var dateB = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two)); // 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
//        System.out.println(ChronoUnit.MINUTES.between(one, dateB)); // DateTimeException

        LocalTime timeB = LocalTime.of(3, 12, 45);
        System.out.println(timeB); // 03:12:45
        LocalTime truncated = time.truncatedTo(ChronoUnit.MINUTES);
        System.out.println(truncated); // 03:12

        var dateC = LocalDate.of(2022, 1, 20);
        var timeC = LocalTime.of(6, 15);
        var dateTimeC = LocalDateTime.of(date, time);
        var durationC = Duration.ofHours(6);
        var duration2C = Duration.ofHours(24);
        var duration3C = Duration.ofDays(1);
        System.out.println(dateTime.plus(durationC)); // 2022–01–20T12:15
        System.out.println(time.plus(durationC)); // 12:15
//        System.out.println(date.plus(durationC)); // UnsupportedTemporalTypeException
//        System.out.println(dateC.plus(duration2C)); // UnsupportedTemporalTypeException

//        var date = LocalDate.of(2022, Month.MARCH, 13);
//        var time = LocalTime.of(1, 30);
//        var zone = ZoneId.of("US/Eastern");
//        var dateTime = ZonedDateTime.of(date, time, zone);
//        System.out.println(dateTime); // 2022–03-13T01:30 - 05:00[US / Eastern]
//        System.out.println(dateTime.getHour()); // 1
//        System.out.println(dateTime.getOffset()); // -05:00
//        dateTime = dateTime.plusHours(1);
//        System.out.println(dateTime); // 2022–03-13T03:30 - 04:00[US / Eastern]
//        System.out.println(dateTime.getHour()); // 3
//        System.out.println(dateTime.getOffset()); // -04:00
    }
}
