package ee.taltech.b_practise.assignment6;

import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.stream.Collectors;

public class EvenMax {

    //todo A modify function to pass tests
    //todo B make your solution pretty
    //todo C use streams

    /**
     * returns maximum even number from the list
     * even numbers are numbers evenly divisible by 2
     * for example 2, -6, 128, 2n
     */
    public static Integer maximum(List<Integer> params) {
        if ((params == null) || (params.isEmpty())) {
            return null;
        } else {
            params = params.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
            if (params.isEmpty()) {
                return null;
            } else {
                return params.stream().mapToInt(v -> v).max().orElseThrow(NoSuchElementException::new);
            }
        }
    }

    //todo D programmer has designed to return null on null/empty input
    // You can observe it on tests as: _null_is_maximum_of_no_numbers, _null_is_maximum_of_odd_numbers
    // Can you name 2 different ways developer could have solved these differently?
    // (There should be more than 2 options, but naming 2 is enough)
    // 1 Return a 0
    // 2 Throw an exception
    //todo E
    // Which option would you prefer and why?
    // Answer: Out of the 2 options I provided, expections would make a more clearer explanation to the error, but I like nulls due to their simplicity
}
