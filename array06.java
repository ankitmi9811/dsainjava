// put all zeros to the end

public class array06 {
    public static void main(String args[])
    {
        int arr[] ={1,2,0,3,0,0,4,7,0,6};
        int n=arr.length;
        int temp[] = new int[n];
        int j =0;
        for(int i =0; i<n;i++)
        {
            if(arr[i]!=0)
            {
               temp[j]=arr[i];
               j++;
            }
        
        }
        for(int num : temp)
        {
            System.out.print(num +" ");
        }
    }
    
}
