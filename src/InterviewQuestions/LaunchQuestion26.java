package InterviewQuestions;

import java.time.*;

// Interview Question -> Java 8 Date & Time API

public class LaunchQuestion26 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalTime lt = LocalTime.now();
        LocalDateTime ldt = LocalDateTime.now();

       ld =  LocalDate.of(2026,3,12);
       lt = LocalTime.of(18,25,50);
       ldt = LocalDateTime.of(2023,4,13,12,30,21);

       ld = ld.plusDays(3);
       lt = lt.plusMinutes(12);
       ldt = ldt.minusYears(3);

        System.out.println(LocalDate.now());
        System.out.println(LocalTime.now());
        System.out.println(LocalDateTime.now());

        System.out.println(ld);
        System.out.println(lt);
        System.out.println(ldt);

        System.out.println(ld.isAfter(LocalDate.now()));
        System.out.println(lt.isAfter(LocalTime.now()));
        System.out.println(ldt.isBefore(LocalDateTime.now()));


    }
}
