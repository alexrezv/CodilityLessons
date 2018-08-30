package codility.Lesson4.MissingInteger;

import java.util.Arrays;

/**
 * Task Score   88%
 * Correctness  100%
 * Performance  75%
 * <p>
 * Flaw: Performance test
 * > medium (chaotic sequences length=10005 (with minus))
 * ✘ TIMEOUT ERROR running time: 0.13 sec., time limit: 0.11 sec.
 * 1. 0.128 s   TIMEOUT ERROR, running time: 0.13 sec., time limit: 0.11 sec.
 * 2. 0.124 s   TIMEOUT ERROR, running time: 0.12 sec., time limit: 0.10 sec.
 * 3. 0.132 s   TIMEOUT ERROR, running time: 0.13 sec., time limit: 0.13 sec.
 */
class Solution {

    int solution(int[] A) {
        //N is an integer within the range [1..100,000];
        //        each element of array A is an integer within the range [−1,000,000..1,000,000].
        if (1 > A.length || 100000 < A.length) return 0;
        if (Arrays.stream(A).anyMatch(it -> -1000000 > it || 1000000 < it)) return 0;

        int[] arr = Arrays.stream(A).filter(it -> 0 < it).sorted().toArray();

        if (0 == arr.length || 1 != arr[0]) return 1;

        for (int i = 0; i < arr.length - 1; i++) {
            if (1 < arr[i + 1] - arr[i]) {
                return arr[i] + 1;
            }
        }
        return arr[arr.length - 1] + 1;


    }
}
