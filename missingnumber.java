public class missingnumber {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,6,7,8,9,10};
        
        for(int i = 1 ; i< arr.length ; i++)
        {
            if(i != arr[i-1])
            {
                System.out.println("Number missing " + i);
                break;
            }

        }
    }
}
