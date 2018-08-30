package codility.Lesson4.FrogRiverOne;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Task Score   81%
 * Correctness  100%
 * Performance  60%
 */
class Solution {

    int solution(int X, int A[]) {
        //N and X are integers within the range [1..100,000];
        //        each element of array A is an integer within the range [1..X].
        int N = A.length;
        if (N < 1 || N > 100000 || X < 1 || X > 100000) {
            return -1;
        }
        if (Arrays.stream(A).anyMatch(it -> it < 1 || it > X)) {
            return -1;
        }
        if (A.length == 1 && A[0] == X) return 0;

        Map<Integer, Integer> leaves = new HashMap<>();

        for (int i = 0; i < N; i++) {
            if (A[i] <= X) {
                leaves.put(A[i], i);
            }
            if (leaves.size() == X) {
                return leaves.values().stream().mapToInt(it -> it).max().orElse(-1);
            }
        }

        return -1;
    }
}
