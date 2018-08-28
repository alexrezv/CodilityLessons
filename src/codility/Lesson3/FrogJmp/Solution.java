package codility.Lesson3.FrogJmp;

public class Solution {
    public int solution(int X, int Y, int D) {
        return (int) Math.ceil(((double) Y - (double) X) / (double) D);
    }
}
