public class UniqueNumberXOR {
    public static void main(String[] args) {
        int arr[] = {1, 1, 2, 3, 3, 4, 4, 4}; // Modify input for single unique case
        int unique = 0;

        for (int num : arr) {
            unique ^= num; // XOR cancels out duplicate numbers
        }

        System.out.println("The number that appears once is: " + unique);
    }
}
