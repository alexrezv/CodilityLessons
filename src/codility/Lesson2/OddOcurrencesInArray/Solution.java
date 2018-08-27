package codility.Lesson2.OddOcurrencesInArray;

import java.util.Arrays;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.stream.Collectors;

public class Solution {
    public int solution(int[] A) {
        Map<Integer, Integer> map = Arrays.stream(A).boxed().
                collect(Collectors.toMap(k -> k, v -> 1, (v1, v2) -> v1 + v2));
        int result;
        try {
            result = map.entrySet().stream().filter(it -> 0 != it.getValue() % 2).findFirst().get().getKey();
        } catch (NoSuchElementException e) {
            result = 0;
        }
        return result;
    }
}
