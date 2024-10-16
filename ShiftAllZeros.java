import java.util.*;

public class ShiftAllZeros {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 3, 0, 4, 0, 1, 0, 9, 8, 7, 0};
        int n = arr.length;
        
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[count] = arr[i];
                count++;
            }
        }

        while (count < n) {
            arr[count] = 0;
            count++;
        }

        System.out.println(Arrays.toString(arr));
    }
}
