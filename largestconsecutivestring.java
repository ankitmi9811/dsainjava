
import java.util.*;;
public class largestconsecutivestring {

    public static void main(String args[])
    {  

     int arr[] = {1,12,3,4,5,11,2,13,14,7, 8, 15,16,18,6,17, 9, 19, 20, 21, 22};
     Arrays.sort(arr);
     int maxLength = 0;
     int count = 1;

     for(int i =0; i<arr.length-1; i++)
     {
        if(arr[i+1] - arr[i] == 1){
            count++;
            if(count > maxLength){
                maxLength = count;
            }
        }
        else{
            count = 1;
        }
     }
     System.out.println(maxLength);
    }
    
}
