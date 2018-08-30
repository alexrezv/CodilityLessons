package codility.Lesson4.MaxCounters;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * Task Score   55%
 * Correctness  100%
 * Performance  ??%
 */
class Solution {

    public int[] solution(int N, int[] A) {
        //integer N and a non-empty array A consisting of M integers
        //N and M are integers within the range [1..100,000];
        //        each element of array A is an integer within the range [1..N + 1]
        if (N < 1 || N > 100000 || A.length < 1 || A.length > 100000) return new int[0];
        if (Arrays.stream(A).anyMatch(it -> it < 1 || it > N + 1)) return new int[0];

        int[] counters = new int[N];
        boolean wasIncreased = false;
        for (int aA : A) {
            if (aA <= N) {
                counters[aA - 1] += 1;
                wasIncreased = true;
                continue;
            }
            if (aA == N + 1 && wasIncreased) {
                final int max = Arrays.stream(counters).max().orElse(-1);
                counters = IntStream.generate(() -> max).limit(N).toArray();
                wasIncreased = false;
            }
        }

        return counters;
    }

}
