package ee.taltech.b_practise.assignment7;

import org.apache.commons.lang3.ArrayUtils;

import java.util.Objects;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Fullname {

    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams (extra)

    public static String fullname(String firstName, String lastName) {
        String name = new String();
        return name = Stream.of(firstName, lastName).filter(Objects::nonNull).filter(e -> e.length() != 0).collect(Collectors.joining(" "));
    }


}
