package codility.Lesson4.PermCheck;

import java.util.Arrays;

class Solution {

    public int solution(int[] A) {
        int[] arr = Arrays.stream(A).sorted().toArray();

        //A permutation is a sequence containing each element from 1 to N once, and only once.
        if (1 == arr.length && 1 == arr[0]) return 1;

        if (0 == arr.length || 1 != arr[0]) return 0;

        int diffSum = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                return 0;
            }
            diffSum += arr[i + 1] - arr[i];
        }

        if (diffSum == arr.length - 1) {
            return 1;
        } else return 0;
    }
}