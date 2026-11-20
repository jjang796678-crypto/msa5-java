package org.example.e08date;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class DateMain {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now(); // 현재 시간 획득
        LocalDateTime targetDate = LocalDateTime.of(2026, 11, 1, 11, 30, 40);

        // ISO 표준 시계열 문자열 -> 날짜 객체
        LocalDateTime parsedDate1 = LocalDateTime.parse("2026-11-01T11:30:12");

        // ISO 표준 시계열 이외의 문자열 -> 날짜 객체 (포맷터를 이용)
        String date = "2026-11-01 11:30:12";
        java.time.format.DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"); // HH : 24시, hh : 12시
        LocalDateTime parsedDate2 = LocalDateTime.parse(date, dateTimeFormatter);

        System.out.println(now);
        System.out.println(parsedDate1);
        System.out.println(parsedDate2);

        LocalDate now2 = LocalDate.now();
        System.out.println(now2);

        // 날짜 계산
        LocalDateTime addOneDayFromNow = now.plusDays(1L); // LocalDateTime.now().plusDays(1L); 도 가능
        System.out.println(now);
        System.out.println(addOneDayFromNow);

        // 상대적인 날짜 계산 (TemporalAdjusters)
        LocalDateTime firstDaysOfMonth = now.with(TemporalAdjusters.firstDayOfMonth());
        LocalDateTime lastDaysOfMonth = now.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(firstDaysOfMonth);
        System.out.println(lastDaysOfMonth);
        System.out.println(firstDaysOfMonth.with(TemporalAdjusters.next(DayOfWeek.THURSDAY)));

        // 두 날짜 비교
        LocalDate d1 = LocalDate.now();
        LocalDate d2 = LocalDate.of(2025, 9, 10);
        System.out.println(d1.isBefore(d2)); //false
        System.out.println(d1.isAfter(d2)); // true
        System.out.println(d1.isEqual(d2)); // false

        //Period 객체 : 두 날짜의 연/월/일을 단위로 분해해서 각각의 차이를 구하는 객체
        Period p1 = Period.between(d1, d2);
        System.out.println(Math.abs(p1.getYears()));
        System.out.println(Math.abs(p1.getMonths()));
        System.out.println(Math.abs(p1.getDays()));
        System.out.println(p1); // p1 옆에 .toString() 이 숨어있음

        // ChronoUnit 객체
        long untilDays = d1.until(d2, ChronoUnit.DAYS); // until(a,b) a에는 비교할 날짜, b에는 비교할 기준
        System.out.println(Math.abs(untilDays));
        // now.until(p1);

        // LocalDateTime -> LocalDate 추출
        LocalDate extractLocalDateFromNow = now.toLocalDate();
        System.out.println(extractLocalDateFromNow);

    }
}
