package codility.Lesson3.TapeEquilibrium;

import org.junit.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private int[] mediumRandom1, mediumRandom2, largeOnes;

    public SolutionTest() {
        mediumRandom1 = readArray("/home/alex/Documents/CodilityLessons/test/codility/Lesson3/TapeEquilibrium/0-100_10k.txt");
        mediumRandom2 = readArray("/home/alex/Documents/CodilityLessons/test/codility/Lesson3/TapeEquilibrium/-1000-50_10k.txt");
        largeOnes = readArray("/home/alex/Documents/CodilityLessons/test/codility/Lesson3/TapeEquilibrium/-1-1_100k.txt");
    }

    private int[] readArray(String filename) {
        int[] arr = new int[]{};
        try {
            arr = Files.lines(Paths.get(filename))
                    .mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return arr;
    }

    @Test
    public void testSolution1() {
        Solution classUnderTest = new Solution();
        /*
         * For example, given:
         *     A = {3, 1, 2, 4, 3}
         * the function should return 1.
         */
        assertEquals(1, classUnderTest.solution(new int[]{3, 1, 2, 4, 3}));
    }

    @Test
    public void testSolution2() {
        Solution classUnderTest = new Solution();

        assertEquals(0, classUnderTest.solution(new int[]{2, 2}));
    }


    @Test
    public void test10kArrayFrom0To100() {
        Solution classUnderTest = new Solution();

        assertEquals(62, classUnderTest.solution(mediumRandom1));
    }

    @Test
    public void test10kArrayFromMinus1000to50() {
        Solution classUnderTest = new Solution();

        assertEquals(243, classUnderTest.solution(mediumRandom2));
    }

    @Test
    public void test100kArrayFromMinus1to1() {
        Solution classUnderTest = new Solution();

        assertEquals(1, classUnderTest.solution(largeOnes));
    }
}
