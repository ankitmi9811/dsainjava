public class reverseArray {
    public static void main(String[] args) {
        int arr[] = {10,20,30,40,50,60,70,80,90};
        int j =arr.length-1;
        int temp=0;
        for(int i=0;i<j;i++)
        {
          temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
          j--;
        }
        for(int num :arr)
        {
            System.out.print(num + " ");
        }
    }
}
