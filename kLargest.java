public class kLargest {
    public static int kLargest(int[] arr, int k) {
        int kIndex = arr.length - k;
        int left = 0, right = arr.length - 1;
        int pivot = arr[right];
        int currIndex = left;
        int temp;

        while (true) {

            for (int i = left; i < right - 1; i++) {
                if (arr[i] <= pivot) {
                    temp = arr[i];
                    arr[i] = arr[currIndex];
                    arr[currIndex] = temp;
                    currIndex++;
                }
            }
            temp = arr[currIndex];
            arr[currIndex] = arr[right];
            arr[right] = temp;

            if (currIndex > kIndex) {
                right = currIndex - 1;
                currIndex = left;
            } else if (currIndex < kIndex) {
                left = currIndex + 1;
                currIndex = left;
            } else {
                return arr[currIndex];
            }
        }
    }
}