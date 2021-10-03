import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class Solution38Test {

    @Test
    void filterEvenNumbersTest(){
        Solution38 sol = new Solution38();
        int[] numArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        ArrayList evens = sol.filterEvenNumbers(numArray);
        ArrayList<Integer> expected = new ArrayList();
        expected.add(2);
        expected.add(4);
        expected.add(6);
        expected.add(8);
        expected.add(10);
        assertEquals(expected, evens);
    }
}