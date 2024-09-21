public class ProductofArrayExceptSelf {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4}; 
        int[] n= new int[4];
        int k = 1;
        for(int i =0; i<arr.length;i++)
        { 
            k= k*arr[i];
            
        }
         for(int i =0; i<arr.length;i++)
         {
              n[i] = k/arr[i];
             System.out.print(n[i] + "  ");
         }
        
        

    }
}
 