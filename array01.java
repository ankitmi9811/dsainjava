// find the largest element in the array 

class Main 
{
    public static void main(String args[])
    {
        int arr[]= {1,2,3,7,4,9,21,3,5,6};
        int c=0;
        for(int i =0; i<arr.length;i++)
        {
          if(arr[i]>c)
          {
            c=arr[i];
          }
          else {
            continue;
          }
        }
        System.out.println(c);
    }
}