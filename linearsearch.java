class LinearSearch {

    public static void search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                System.out.println(target + " is found at " + i);
                return; // Optional: stops searching after the first match
            }
        }
        System.out.println(target + " is not found in the array.");
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int target = 5;
        search(arr, target);
    }
}
