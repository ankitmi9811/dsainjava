// union in two arrays 

import java.util.HashMap;
import java.util.HashSet;

class array08 {
    public static void main(String[] args) {
        int arr1[] ={1,2,3,4,5};
        int arr2[] ={2,3,4,4,5};

        HashSet<Integer> set = new HashSet<>();
        for(int num : arr1)
        {
            set.add(num);
        }
        for(int num : arr2)
        {
            set.add(num);
        }
        for(int num : set)
        {
            System.out.print(num + " ");
        }
    }
    
}
