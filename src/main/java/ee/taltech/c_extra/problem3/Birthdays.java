package ee.taltech.c_extra.problem3;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class Birthdays {

    //todo A
    // Great date API was added with Java 8.
    // New classes were added like LocalDate, Period and others.
    // What does API mean in this context?
    // Answer: application programming interface. This API is used for getting date information from the operating system.
    //
    //
    //

    //todo B
    // In the main method initialize birthdays of all of your team mates (do not have to be real birthdays).
    // Call function "oldest" to find out who is the oldest. You will have to modify "oldest" to work properly.
    // Hint: when googling add java 8 to your search
    // Print out the result (oldest date).

    //todo C
    // Create a function to find out the age of person.
    // Hint: all the classes you require are mentioned on line 10
    // Print out the result (age in years).

    public static void main(String[] args) {
        LocalDate kristiinaBirthday = LocalDate.of(2001, Month.FEBRUARY, 22);
        LocalDate edvinBirthday = LocalDate.of(2001, Month.JUNE, 5);
        LocalDate mihkelBirthday = LocalDate.of(2000, Month.NOVEMBER, 8);
        List<LocalDate> birthdays = List.of(kristiinaBirthday, edvinBirthday, mihkelBirthday);
        LocalDate oldest = oldest(birthdays);
        System.out.println(oldest.format(DateTimeFormatter.ofPattern("YYYY-MM-dd")));
        printAge(kristiinaBirthday);
    }

    /**
     * returns the oldest/earliest date
     */
    public static LocalDate oldest(List<LocalDate> birthDays) {
        LocalDate oldest = LocalDate.now();
        for (LocalDate birthDay : birthDays) {
            if (birthDay.isBefore(oldest)) {
                oldest = birthDay;
            }
        }
        return oldest;
    }

    public static void printAge(LocalDate birthdate) {
        LocalDate now = LocalDate.now();
        Period age = Period.between(birthdate, now);
        System.out.println(age.getYears());
    }
}
