package codility.Lesson3.TapeEquilibrium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Task Score   83%
 * Correctness  100%
 * Performance  66%
 */
public class Solution {

    public int solution(int[] A) {
        List<Integer> list = new ArrayList<>();

        int leftSum = 0;
        int rightSum = Arrays.stream(A).parallel().sum();

        for (int i = 0; i < A.length - 1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            list.add(Math.abs(leftSum - rightSum));
        }

        return list.stream().min(Integer::compareTo).orElse(0);
    }
}
