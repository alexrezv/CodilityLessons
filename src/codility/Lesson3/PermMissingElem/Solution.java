package codility.Lesson3.PermMissingElem;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Task Score   80%
 * Correctness  100%
 * Performance  60%
 */

public class Solution {
    public int solution(int[] A) {
        if (A.length == 0) {
            return 1;
        }
        if (A.length == 1 && 1 != A[0]) {
            return 1;
        }

        List<Integer> list = Arrays.stream(A).sorted().boxed().collect(Collectors.toList());

        if (1 < list.get(0)) {
            return 1;
        }
        for (int i = 0; i < list.size() - 1; i++) {
            if (1 < list.get(i + 1) - list.get(i)) {
                return list.get(i) + 1;
            }
        }
        return list.get(list.size() - 1) + 1;
    }
}
