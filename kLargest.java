public class kLargest {
    public static int kLargest(int[] arr, int k) {
        int kIndex = arr.length - k;
        int leftIndex = 0, rightIndex = arr.length - 1;
        int pivot = arr[rightIndex];
        int currIndex = leftIndex;
        int temp;

        while (leftIndex <= rightIndex) {
            pivot = arr[rightIndex];
            currIndex = leftIndex;
            for (int i = leftIndex; i < rightIndex - 1; i++) {
                if (arr[i] <= pivot) {
                    temp = arr[i];
                    arr[i] = arr[currIndex];
                    arr[currIndex] = temp;
                    currIndex++;
                }
            }
            temp = arr[currIndex];
            arr[currIndex] = arr[rightIndex];
            arr[rightIndex] = temp;

            if (currIndex > kIndex) {
                rightIndex = currIndex-1;
            } else if (currIndex < kIndex) {
                leftIndex = currIndex+1;
            } else {
                return arr[currIndex];
            }
        }
        return arr[currIndex];
    }
}