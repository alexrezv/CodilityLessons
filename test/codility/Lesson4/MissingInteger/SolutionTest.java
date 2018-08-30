package codility.Lesson4.MissingInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    @Test
    public void solutionTest1() {
        Solution classUnderTest = new Solution();
        //For example, given A = [1, 3, 6, 4, 1, 2], the function should return 5.
        assertEquals(5, classUnderTest.solution(new int[]{1, 3, 6, 4, 1, 2}));
    }

    @Test
    public void solutionTest2() {
        Solution classUnderTest = new Solution();
        //Given A = [1, 2, 3], the function should return 4.
        assertEquals(4, classUnderTest.solution(new int[]{1, 2, 3}));
    }

    @Test
    public void solutionTest3() {
        Solution classUnderTest = new Solution();
        //Given A = [−1, −3], the function should return 1.
        assertEquals(1, classUnderTest.solution(new int[]{-1, -3}));
    }

}
