class array03 {
    public static void main(String args[]) {
        int arr[] = {1, 2, 6, 4, 5, 7}; // Example array

        boolean isSorted = true; // Assume array is sorted

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) { // If current element is greater than next, it's not sorted
                isSorted = false;
                break; // Exit loop early if array is not sorted
            }
        }

        System.out.println(isSorted); // Prints "true" if sorted, "false" otherwise
    }
}
