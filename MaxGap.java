import java.util.Arrays;

public class MaxGap {
    public static int MaxGap(int[] arr) {
        int n = arr.length;
        if (n < 2) {
            return 0;
        }

        int minVal = arr[0];
        int maxVal = arr[0];
        for (int i = 1; i < n; i++) {
            minVal = Math.min(minVal, arr[i]);
            maxVal = Math.max(maxVal, arr[i]);
        }

        int bucketSize = Math.max(1, (maxVal - minVal) / (n - 1));
        int bucketNum = (maxVal - minVal) / bucketSize + 1;

        int[] bucketMin = new int[bucketNum];
        int[] bucketMax = new int[bucketNum];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);

        for (int i = 0; i < n; i++) {
            int bucketIndex = (arr[i] - minVal) / bucketSize;
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], arr[i]);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], arr[i]);
        }

        int maxGap = Integer.MIN_VALUE;
        int prevMax = minVal;
        for (int i = 0; i < bucketNum; i++) {
            if (bucketMin[i] == Integer.MAX_VALUE && bucketMax[i] == Integer.MIN_VALUE) {
                continue;
            }
            maxGap = Math.max(maxGap, bucketMin[i] - prevMax);
            prevMax = bucketMax[i];
        }

        return maxGap;
    }

}
