// second largest element without sorting

class Main{
    public static void main(String args[])
    {
        int arr[] ={1,2,4,5,32,14,9,05};
        int largest =0; 
        int second =-1;

        for(int i =0; i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i];
            }
        }
        System.out.println(largest);

        for(int i=0; i<arr.length;i++)
        {
            if(arr[i]>second && arr[i]!=largest)
            {
                second= arr[i];
            }
        }
        System.out.println(second);
    }
}