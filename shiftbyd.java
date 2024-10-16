import java.util.*;
public class shiftbyd {
 public static void main(String[] args) {
    
 
    int d = 3;
    int j =d;
    int[] arr = {1,2,3,4,5,6,7};
    // output : {4,5,6,7,1,2,3}
    int n = arr.length;
    int[] temp = new int[d];
    for(int i =0; i<d;i++)
    {
        temp[i] = arr[i];
    }
    for(int i =0; i<n-d;i++)
    {
        arr[i] = arr[j];
        j++;
    }
    for(int i =0; i<d;i++)
    {
        arr[n-d+i] = temp[i];
    }
    
    System.out.println(Arrays.toString(arr));
}
}
