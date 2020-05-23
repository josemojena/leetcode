
import com.leetcode.prob_1437_Check_If_all_1s_Are_at_Least_Length_k_Places_Away.*;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class prob_1437_Check_If_all_1s_Are_at_Least_Length_k_Places_Away_Test {


    private int[] case_1 = new int[]{1,0,0,1,0,1};
    private  int k = 2;
    private  Solution sol = new Solution();

    @Test
    public void Case_1() {

        assertEquals(false, sol.kLengthApart(case_1, k));
    }

}
