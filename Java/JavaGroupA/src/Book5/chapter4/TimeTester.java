package Book5.chapter4;

import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.time.*;
import java.time.format.DateTimeParseException;

public class TimeTester {
    public static void main(String[] args) {
//        System.out.println("LocalTime: " + LocalTime.now().toString());
//        System.out.println("LocalDateTime: " + LocalDateTime.now().toString());
//        System.out.println("ZonedDateTime: " + ZonedDateTime.now().toString());
//        System.out.println("OffsetTime: " + OffsetTime.now().toString());
//        System.out.println("OffsetDateTime: " + OffsetDateTime.now().toString());
//        System.out.println("MonthDay: " + MonthDay.now().toString());
//        System.out.println("YearMonth: " + YearMonth.now().toString());
//        System.out.println("Instant: " + Instant.now().toString());

//        try {
//            LocalDate d = LocalDate.parse("2023-09-04");
//            System.out.println(d);
//        } catch(DateTimeException e) {
//            System.out.println(e.getLocalizedMessage());
//        }
//
//        try {
//            LocalDateTime dt = LocalDateTime.parse("2023-09-04T13:01");
//            System.out.println(dt);
//        } catch(DateTimeException e) {
//            System.out.println(e.getLocalizedMessage());
//        }

//        LocalDate date = LocalDate.of(2023,9,4);
//        System.out.println(date);
//        LocalDate date = LocalDate.of(2023,Month.SEPTEMBER,4);
//        System.out.println(date);

//        for (String zone: ZoneId.getAvailableZoneIds()){
//            System.out.println(zone);
//        }

//        ZoneId zone = ZoneId.of("America/Los_Angeles");
//        ZonedDateTime zdt;
//        zdt = ZonedDateTime.of(2023,9,4,0,0,0,0, zone);
//        System.out.println(zdt);

//        ZoneOffset z1 = ZoneOffset.ofHours(-8);
//        ZoneOffset z2 = ZoneOffset.of("-08:00");
//        OffsetTime ofs = OffsetTime.of(13, 41, 0, 0, z2);
//        System.out.println(".ofHours(-8): " + z1);
//        System.out.println(".of(-08:00): " + z2);
//        System.out.println("OffsetTime: " + ofs);

//        LocalDate date = LocalDate.now();
//        System.out.println("Year: " + date.getYear());
//        System.out.println("Month: " + date.getMonthValue());
//        System.out.println("Day of the week: " + date.getDayOfWeek());
//        System.out.println("Day in the year: " + date.getDayOfYear());
//        System.out.println("Day in the month: " + date.getDayOfMonth());

//        if (LocalDate.now() == LocalDate.now()){ //wrong
//            System.out.println("Everything is awesome!");
//        } else {
//            System.out.println("Hell is freezing over!");
//        }
//        if (LocalDate.now().equals(LocalDate.now())){ //right
//            System.out.println("Everything is awesome!");
//        } else {
//            System.out.println("Hell is freezing over!");
//        }

//        System.out.println("Last year was: " + LocalDate.now().minusYears(1));
//        System.out.println("Last month was: " + LocalDate.now().minusMonths(1));
//        System.out.println("Last week was: " + LocalDate.now().minusWeeks(1));
//        System.out.println("Yesterday was: " + LocalDate.now().minusDays(1));
//        System.out.println("Today is: " + LocalDate.now());
//        System.out.println("Tomorrow is: " + LocalDate.now().plusDays(1));
//        System.out.println("Next week is: " + LocalDate.now().plusWeeks(1));
//        System.out.println("Next month is: " + LocalDate.now().plusMonths(1));
//        System.out.println("Next year is: " + LocalDate.now().plusYears(1));

//        LocalDate date1 = LocalDate.now();
//        LocalDate date2 = LocalDate.parse("2023-10-01");
//        System.out.println("Days: " + date1.until(date2, ChronoUnit.DAYS));
//        System.out.println("Weeks: " + date1.until(date2, ChronoUnit.WEEKS));

//        LocalDate today = LocalDate.now();
//        LocalDate invDate = LocalDate.of(today.getYear(), today.getMonthValue(), 15);
//        if (today.getDayOfMonth() > 15){
//            invDate = invDate.plusMonths(1);
//        }
//        long daysToInvoice = today.until(invDate, ChronoUnit.DAYS);
//        System.out.println("Days to invoice day: " + daysToInvoice);

        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("dd MMM YYYY");
        LocalDate date = LocalDate.now();
        System.out.println(date.format(formatter));
    }
}
