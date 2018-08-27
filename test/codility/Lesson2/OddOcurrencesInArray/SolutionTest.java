package codility.Lesson2.OddOcurrencesInArray;

import org.junit.Assert;
import org.junit.Test;

public class SolutionTest {

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        Assert.assertEquals(4, classUnderTest.solution(new int[]{1, 2, 3, 1, 2, 3, 4}));
    }

    @Test
    public void testSolution2() {
        Solution classUnderTest = new Solution();
        Assert.assertEquals(0, classUnderTest.solution(new int[]{1, 2, 3, 1, 2, 3}));
    }

    @Test
    public void testSolution3() {
        Solution classUnderTest = new Solution();
        Assert.assertEquals(42, classUnderTest.solution(new int[]{
                1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 42, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37, 38, 39, 40, 41}));
    }
}
