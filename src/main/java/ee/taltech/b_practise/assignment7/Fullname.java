package ee.taltech.b_practise.assignment7;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fullname {

    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams (extra)

    public static String fullname(String firstName, String lastName) {
        if ((firstName.isEmpty() && lastName.isEmpty())|| (firstName.equals(null)&&lastName.equals(null))) {
            return "";
        } else if (lastName.equals("")||lastName.equals(null)) {
            return firstName;
        } else if (firstName.equals("")||firstName.equals(null)) {
            return lastName;
        } else {
            return firstName + " " + lastName;
        }
    }


}
