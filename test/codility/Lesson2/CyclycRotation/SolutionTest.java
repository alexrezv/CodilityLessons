package codility.Lesson2.CyclycRotation;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given
         *     A = [3, 8, 9, 7, 6]
         *     K = 3
         * the function should return [9, 7, 6, 3, 8].
         */
        int[] result = classUnderTest.solution(new int[]{3, 8, 9, 7, 6}, 3);
        assertEquals(Arrays.toString(new int[]{9, 7, 6, 3, 8}), Arrays.toString(result));
    }

    @Test
    public void testSolution2() {
        Solution classUnderTest = new Solution();
        /*
         * For another example, given
         *     A = [0, 0, 0]
         *     K = 1
         * the function should return [0, 0, 0]
         */
        int[] result = classUnderTest.solution(new int[]{0, 0, 0}, 1);
        assertEquals(Arrays.toString(new int[]{0, 0, 0}), Arrays.toString(result));
    }

    @Test
    public void testSolution3() {
        Solution classUnderTest = new Solution();
        /*
         * Given
         *     A = [1, 2, 3, 4]
         *     K = 4
         * the function should return [1, 2, 3, 4]
         */
        int[] result = classUnderTest.solution(new int[]{1, 2, 3, 4}, 4);
        assertEquals(Arrays.toString(new int[]{1, 2, 3, 4}), Arrays.toString(result));
    }
}