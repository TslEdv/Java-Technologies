package ee.taltech.b_practise.assignment3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Multiplier {

    //todo A modify function to pass tests
    //todo B modify function to pass edge case tests
    //todo C make your solution pretty
    //todo D use streams

    /**
     * multiplies each param element with multiplier
     */
    public static List<Integer> multiplier(List<Integer> params, Integer multiplier) {
        if (params == null) {
            return List.of();
        }
        if (multiplier == null) {
            return params;
        }
        return params.stream().map(e -> e * multiplier).collect(Collectors.toList());
    }
}
