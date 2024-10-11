class largestelement
{
    public static void main(String args[])
    { 
      int larg =0;
      int[] arr = {1,2,4,5,6,9,17,23,3,98,1,0,2,87};
      for(int i =0; i<=arr.length; i++)
      {
        if(arr[i]> larg)
        {
            larg = arr[i];
        }
      }
      System.out.println(larg);
    }
}