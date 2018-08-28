package codility.Lesson3.FrogJmp;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given:
         *     X = 10, Y = 85, D = 30
         * the function should return 3
         */
        assertEquals(3, classUnderTest.solution(10, 85, 30));
    }

    @Test
    public void testSolution2() {
        Solution classUnderTest = new Solution();

        assertEquals(2, classUnderTest.solution(0, 100, 95));
    }

    @Test
    public void testSolution3() {
        Solution classUnderTest = new Solution();

        assertEquals(108583091, classUnderTest.solution(0, 651498541, 6));
    }

    @Test
    public void testSolution4() {
        Solution classUnderTest = new Solution();

        assertEquals(1, classUnderTest.solution(0, 50, 51));
    }


}
