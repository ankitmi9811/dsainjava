// left rotation of element by one place
public class array05 {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7};
        int fe = arr[0];
        for(int i =0; i<arr.length-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[arr.length-1] = fe;
    
    for(int num : arr)
    {
        System.out.print(num + " ");
    }
}
}
