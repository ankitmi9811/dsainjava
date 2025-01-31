public class Array10 {
    public static void main(String[] args) {
        int arr[] = {1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1};
        int count = 0, maxCount = 0;

        for (int num : arr) {
            if (num == 1) {
                count++; 
                if (count > maxCount) { 
                    maxCount = count;
                }
            } else {
                count = 0; 
            }
        }

        System.out.println("Max consecutive ones: " + maxCount);
    }
}
