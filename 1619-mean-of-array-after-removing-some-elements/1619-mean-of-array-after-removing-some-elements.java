class Solution {
    public double trimMean(int[] arr) {
        double l = arr.length * 0.05;
        Arrays.sort(arr);
        double sum = 0;
        double j = 0;
        for (int i = (int)l; i < arr.length - l; i++) {
            sum = sum + arr[i];
            j++;
        }
        double mean = sum / j;
        return mean;
    }
}