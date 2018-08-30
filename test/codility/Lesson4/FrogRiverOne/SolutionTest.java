package codility.Lesson4.FrogRiverOne;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given X = 5 and array A such that:
         *     A = {1, 3, 1, 4, 2, 3, 5, 4}
         * the function should return 6
         * */
        assertEquals(6, classUnderTest.solution(5, new int[]{1, 3, 1, 4, 2, 3, 5, 4}));
    }

    @Test
    public void testSolution2() {
        Solution classUnderTest = new Solution();

        assertEquals(0, classUnderTest.solution(5, new int[]{5}));
    }
}
