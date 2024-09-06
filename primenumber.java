public class primenumber {

    public static void primenumber(int n)
    {

        if(n==1 || n==2 || n==3)
        {
          System.out.println("prime number");
        }
      for(int i=2;i<n;i++)
      {
        if(n%i==0)
        {
            System.out.println(" not prime");

        }
        else{
            System.out.println(" prime");
        }
      }
    }

    public static void main(String[] args) {
    
        primenumber(12);
    }
    
}
