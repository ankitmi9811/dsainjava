// remove duplicate elements from sorted array

import java.util.HashSet;

public class array04 {
    public static void main(String args[])
    {
        int arr[] = { 1,2,2,3,3,3,4,4,4,5,6,7,7};
        HashSet<Integer> set = new HashSet<>();
        for(int num : arr)
        {
            set.add(num);
        }
        int k = set.size();
        System.out.println(k);
    }


    
}
