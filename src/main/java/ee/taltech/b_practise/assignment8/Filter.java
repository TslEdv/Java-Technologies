package ee.taltech.b_practise.assignment8;

import java.util.ArrayList;
import java.util.List;

public class Filter {

    //todo A write tests in FilterTest
    //todo B make tests pass
    //todo C make your solution pretty
    // it's up to you how you want to handle null inputs
    // you don't need to modify PositivesAndNegatives object
    // P.S streams don't add much value here

    /**
     * divides integer input into positives and negatives
     * zero 0, can be treated as positive
     */
    public static PositivesAndNegatives filterToPositivesAndNegatives(List<Integer> numbers){
        if (numbers == null){
            throw new IllegalArgumentException("Invalid input");
        }
        PositivesAndNegatives positivesAndNegatives = new PositivesAndNegatives();
        List<Integer> positives = new ArrayList<>();
        List<Integer> negatives = new ArrayList<>();
        for (Integer number : numbers) {
            if (number >= 0){
                positives.add(number);
            }
            else {
                negatives.add(number);
            }
        }
        positivesAndNegatives.setNegatives(negatives);
        positivesAndNegatives.setPositives(positives);
        return positivesAndNegatives;
    }
}
