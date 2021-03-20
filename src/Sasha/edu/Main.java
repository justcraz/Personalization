package Sasha.edu;


import sun.util.resources.LocaleData;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999 , Month.APRIL , 12);
        System.out.println(date.getDayOfWeek());
        LocalDate today = LocalDate.now();
        System.out.println(today.plusDays(2077).getDayOfWeek());
        LocalDate jan = LocalDate.of(2021, Month.JANUARY,1);
        System.out.println(jan.plusDays(255));
        Person sasha = new Person();
     sasha.setFirstname("Sasha");
     sasha.setLastName("Rayman");
     sasha.setMidName("Miroslavovich");
     sasha.setCity("Chernovtsi");
     sasha.setStreet("st.Kobilianska");
     sasha.setAdress("st.Kobilianska 1");
     sasha.setHouseNumber("30");
     sasha.setPhoneNumber("+380995574315");
     sasha.setDateOfBirth(LocalDate.of(2003 , 10 , 18));
        System.out.println(sasha);
    }
}
