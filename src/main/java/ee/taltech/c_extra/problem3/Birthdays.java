package ee.taltech.c_extra.problem3;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
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
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2001);
        cal.set(Calendar.MONTH, 6);
        cal.set(Calendar.DAY_OF_MONTH, 5);
        Date edvinBirthday = cal.getTime();
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.DAY_OF_MONTH, 22);
        Date kristiinaBirthday = cal.getTime();
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 8);
        cal.set(Calendar.YEAR, 2000);
        Date mihkelBirthday = cal.getTime();

    }

    /**
     * returns the oldest/earliest date
     */
    public static LocalDate oldest(List<LocalDate> birthDays){
        return null;
    }
}
