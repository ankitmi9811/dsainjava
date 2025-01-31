// find missing number in array
public class array09 {
    public static void main(String[] args) {
        int arr[] ={1,2,3,4,5,7};
        int count=arr[0];
        for(int i =0; i<arr.length;i++)
        {
            if(count==arr[i])
            {
                count++;
            }
            else 
            {
                System.out.println(count + "is the missing number");
                break;
            }
        }
    }
}
