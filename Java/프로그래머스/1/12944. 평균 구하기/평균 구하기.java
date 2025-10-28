class Solution {
    public double solution(int[] arr) {
        double sum = 0;
        for (int n : arr) {
            sum += n;
        }
        double average = sum / arr.length;
        return average;
    }
}