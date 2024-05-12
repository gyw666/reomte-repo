public class hw7_18 {
    public static void bubbleSort(double[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    double temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        double[] arr = {64, 34, 25, 12, 22, 11, 90};
        bubbleSort(arr);
        for (double num : arr) {
            System.out.print(num + " ");
        }
    }
}

