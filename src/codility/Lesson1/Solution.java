package codility.Lesson1;

/*
* A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
* both ends in the binary representation of N.
*
* Write a function:
*     class Solution { public int solution(int N); }
* that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N
* doesn't contain a binary gap.
*
* For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its
* longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation
* '100000' and thus no binary gaps.
*
* Assume that:
*     N is an integer within the range [1..2,147,483,647].
*
* Complexity:
*     expected worst-case time complexity is O(log(N));
*     expected worst-case space complexity is O(1).
*/

import java.util.Arrays;

public class Solution {
    public int solution(int N) {
        String b = Integer.toBinaryString(N).replaceFirst("0+$", "");
        return Arrays.stream(b.split("1")).mapToInt(String::length).max().orElse(0);
    }
}
