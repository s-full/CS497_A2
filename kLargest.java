public class kLargest {
    public static int kLargest(int[] arr, int k) {
        int kIndex = arr.length-k;
        
        return kLargest.quickSelect(arr, 0, arr.length-1,k);
    }

    private static int quickSelect(int[] arr, int left, int right, int kIndex) {
        int pivot = right;
        int lPoint = left;

        for (int i = lPoint; i < pivot; i++) {
            if (arr[i] <= pivot) {
                int temp = arr[lPoint];
                arr[lPoint] = arr[i];
                arr[i] = temp;
                lPoint++;
            }
        }
        int temp2 = arr[lPoint];
        arr[lPoint] = arr[right];
        arr[right] = temp2;

        if (lPoint > kIndex) {
            return quickSelect(arr, left, lPoint-1, kIndex);
        }
        else if (lPoint < kIndex) {
            return quickSelect(arr, lPoint+1, right, kIndex);
        
        }
        else return arr[lPoint];

    }
}