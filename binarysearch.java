import java.util.Arrays;

public class binarysearch {

    public static void search( int arr[] , int target )
    {
      int left =0;
      int right =arr.length-1;
      

      for(int i =0; i<arr.length;i++)
      {
        int mid = (right+left)/2;
        if(arr[mid]== target)
        {
            System.out.println("target is found at " + mid);
            break;
        }
        else if(target>arr[mid])

        {
           left=mid+1;
        }

        else if(target<arr[mid])

        {
           right=mid-1;
        }

      }
    }

    public static void main(String[] args) {
        int arr[] = {1,9,2,3,6,5,6,77,8,110};
        Arrays.sort(arr);
        System.out.println(arr);
        int target = 9;
        search(  arr ,  target );

    }
    
}
