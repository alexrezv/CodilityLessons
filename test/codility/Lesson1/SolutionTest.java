package codility.Lesson1;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

    @Test
    public void testSolution() {
        Solution classUnderTest = new Solution();

        assertEquals(String.valueOf(0), String.valueOf(classUnderTest.solution(0)));

        //For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
        assertEquals(String.valueOf(2), String.valueOf(classUnderTest.solution(9)));

        //The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3.
        assertEquals(String.valueOf(4), String.valueOf(classUnderTest.solution(529)));

        //The number 20 has binary representation 10100 and contains one binary gap of length 1.
        assertEquals(String.valueOf(1), String.valueOf(classUnderTest.solution(20)));

        //The number 15 has binary representation 1111 and has no binary gaps.
        assertEquals(String.valueOf(0), String.valueOf(classUnderTest.solution(15)));

        //The number 32 has binary representation 100000 and has no binary gaps.
        assertEquals(String.valueOf(0), String.valueOf(classUnderTest.solution(32)));
    }
}
