// linear search

import java.util.Scanner;

public class array07 {
    public static void main(String args[])
    {
        int arr[] = {1,2,4,3,5,6,8,7};
        // int target = 4;
        // for(int i =0; i<arr.length;i++)
        // {
        //     if(arr[i]==target)
        //     {
        //         System.out.println("Target found at " + i);
        //     }
        // }
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Target Value : ");
        int target = sc.nextInt();
        for(int i =0; i<arr.length;i++)
         {
            if(arr[i]==target)
            {
                System.out.println("Target found at " + i);
            }
         }

    }
    
}
