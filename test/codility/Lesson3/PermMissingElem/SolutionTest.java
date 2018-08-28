package codility.Lesson3.PermMissingElem;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given array A such that:
         *     A = {2, 3, 1, 5}
         * the function should return 4, as it is the missing element.
         */
        assertEquals(4, classUnderTest.solution(new int[]{2, 3, 1, 5}));
    }

    @Test
    public void testSolution2() {
        Solution classUnderTest = new Solution();

        assertEquals(6, classUnderTest.solution(new int[]{2, 3, 1, 5, 4}));
    }

    @Test
    public void testSolution3() {
        Solution classUnderTest = new Solution();

        assertEquals(1, classUnderTest.solution(new int[]{}));
    }

    @Test
    public void testSolution4() {
        Solution classUnderTest = new Solution();

        assertEquals(3, classUnderTest.solution(new int[]{1, 2}));
    }

    @Test
    public void testSolution5() {
        Solution classUnderTest = new Solution();

        assertEquals(4, classUnderTest.solution(new int[]{1, 2, 3}));
    }

    @Test
    public void testSolution6() {
        Solution classUnderTest = new Solution();

        assertEquals(1, classUnderTest.solution(new int[]{2, 3, 4}));
    }
}
