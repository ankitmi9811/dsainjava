// left rotate elemeent of an array
import java.util.*;
class shiftele
{
    public static void main(String args[])
    {
        int[] arr = {1,2,3,4,5};
        int n = arr.length;
        int arr1[] = new int[n];
        
        arr1[n-1] = arr[0];
        
        for(int i =0; i<n-1; i++)
        {
            arr1[i] = arr[i+1];
        }
        System.out.println(Arrays.toString(arr1));
    }
}