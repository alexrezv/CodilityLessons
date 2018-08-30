package codility.Lesson4.PermCheck;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testExample1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given array A such that:
         *     A[0] = 4
         *     A[1] = 1
         *     A[2] = 3
         *     A[3] = 2
         * the function should return 1.
         */
        assertEquals(1, classUnderTest.solution(new int[]{4, 1, 3, 2}));
    }

    @Test
    public void testExample2() {
        Solution classUnderTest = new Solution();
        /*
         * Given array A such that:
         *     A[0] = 4
         *     A[1] = 1
         *     A[2] = 3
         * the function should return 0.
         */
        assertEquals(0, classUnderTest.solution(new int[]{4, 1, 3}));
    }

    @Test
    public void testExtremeMinMax() {
        Solution classUnderTest = new Solution();

        assertEquals(0, classUnderTest.solution(new int[]{Integer.MIN_VALUE}));
        assertEquals(0, classUnderTest.solution(new int[]{Integer.MAX_VALUE}));
    }

    @Test
    public void testSingle() {
        Solution classUnderTest = new Solution();

        assertEquals(0, classUnderTest.solution(new int[]{0}));
        assertEquals(1, classUnderTest.solution(new int[]{1}));
        assertEquals(0, classUnderTest.solution(new int[]{25}));

    }

    @Test
    public void testDouble() {
        Solution classUnderTest = new Solution();

        assertEquals(0, classUnderTest.solution(new int[]{0, 1}));
        assertEquals(1, classUnderTest.solution(new int[]{1, 2}));
        assertEquals(0, classUnderTest.solution(new int[]{14, 12}));

    }

    @Test
    public void testAntiSum1() {
        Solution classUnderTest = new Solution();

        //total sum is correct, but it is not a permutation
        assertEquals(0, classUnderTest.solution(new int[]{1, 2, 2, 5, 5}));

    }
}
