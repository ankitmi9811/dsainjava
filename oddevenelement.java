public class oddevenelement {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8};
        int evencount =0;
        int oddcount =0;

        for(int i =0; i<arr.length;i++)
        {
            if(arr[i]%2 ==0)
            {
                evencount +=1;
            }

            else{oddcount+=1;}
        }
    
    System.out.println("even number  = " + evencount );
    System.out.println("even number  = " + oddcount );
    }
}
