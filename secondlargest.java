// public class secondlargest {
//     public static void main(String[] args) {
//         int second =0;
//         int largest =0;
//         int[] arr = {1,2,4,7,7,5};
//         for(int i =0; i<arr.length-1;i++)
//         {
//             if(arr[i]> largest)
//             {
//                 largest = arr[i];

//             }
//         }

//         for(int i =0; i<arr.length;i++)
//         {
//             if(arr[i]>second && arr[i]!=largest)
//             {
//                 second = arr[i];
//             }
//         }
//         System.err.println(second);
//     }
// }

public class secondlargest 
    {
      public static void main(String[] args) {
        int second =0;
        int largest = 0;
        int[] arr = {1,2,4,7,7,5};

        for(int i =0; i<=arr.length-1;i++)
        {
            if(arr[i]>largest)
            {
                second = largest;
                largest= arr[i];
            }
            else if (arr[i] > second && arr[i] != largest) {
                second = arr[i];
            }
        }
        System.err.println(largest);
        System.err.println(second);
      }
    }
