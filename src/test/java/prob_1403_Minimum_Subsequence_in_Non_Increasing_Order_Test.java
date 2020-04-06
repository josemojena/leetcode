import com.leetcode.prob_1403_Minimum_Subsequence_in_Non_Increasing_Order.Solution;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class prob_1403_Minimum_Subsequence_in_Non_Increasing_Order_Test {


    private int[] case_1 = new int[]{4, 3, 10, 9, 8};
    private int[] case_2 = new int[]{4, 4, 7, 6, 7};
    private int[] case_3 = new int[]{6};

    private final Solution sol = new Solution();

    @Test
    public void Case_1() {
        List<Integer> expected = Arrays.asList(10, 9);
        assertEquals(expected, sol.minSubsequence(case_1));
    }

    @Test
    public void Case_2() {
        List<Integer> expected = Arrays.asList(7, 7, 6);
        assertEquals(expected, sol.minSubsequence(case_2));
    }

    @Test
    public void Case_3() {
        List<Integer> expected = Arrays.asList(6);
        assertEquals(expected, sol.minSubsequence(case_3));
    }

}
