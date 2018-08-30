package codility.Lesson4.MaxCounters;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given:
         *     A = (3, 4, 4, 6, 1, 4, 4}
         * the function should return [3, 2, 2, 4, 2]
         */
        Assert.assertArrayEquals(new int[]{3, 2, 2, 4, 2}, classUnderTest.solution(5, new int[]{3, 4, 4, 6, 1, 4, 4}));
    }

    @Test
    public void onlyOneCounter() {
        Solution classUnderTest = new Solution();

        Assert.assertArrayEquals(new int[]{1}, classUnderTest.solution(1, new int[]{1}));
        Assert.assertArrayEquals(new int[]{3}, classUnderTest.solution(1, new int[]{1, 1, 1}));
    }
}
