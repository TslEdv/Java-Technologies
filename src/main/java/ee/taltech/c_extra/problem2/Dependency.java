package ee.taltech.c_extra.problem2;

import org.apache.commons.lang3.StringUtils;

public class Dependency {

    //todo A
    // Add Apache StringUtils to gradle
    // if added successfully you can uncomment line 3 and 12

    //todo B
    // In the context of A, can you explain in your words what is a dependency?
    // Answer: it is a set of code that can be used by other programs, i.e this program depends on StringUtils because it uses code from it
    //
    //
    //todo C
    // Can this project "ics0014-2020-test1" become a dependency?
    // Answer: Yes

    public static void main(String[] args) {
        boolean notBlank = StringUtils.isNotBlank("       ");
    }
}
