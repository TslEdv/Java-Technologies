package ee.taltech.b_practise.assignment8;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class FilterTest {
    PositivesAndNegatives positivesAndNegatives = new PositivesAndNegatives();
    @Test
    void filter_throws_exception_on_null() {
        assertThrows(IllegalArgumentException.class, () -> Filter.filterToPositivesAndNegatives(null));
    }

    @Test
    void filter_puts_only_negatives_in_negatives() {
        assertEquals(List.of(-2, -41, -37), Filter.filterToPositivesAndNegatives(List.of(1, -2, 13, -41, -37)).getNegatives());
    }

    @Test
    void filter_puts_only_positives_in_positives() {
        assertEquals(List.of(0, 13), Filter.filterToPositivesAndNegatives(List.of(0, -2, 13, -41, -37)).getPositives());
    }
}
