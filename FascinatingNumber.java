import java.util.*;
public class FascinatingNumber {
  public static void main(String[] args) {
      int n = 193;
      int var2 = n * 2;
      int var3 = n * 3;

      
      String sum = Integer.toString(n) + Integer.toString(var2) + Integer.toString(var3);

    
      if (isFascinating(sum)) {
          System.out.println(n + " is a fascinating number.");
      } else {
          System.out.println(n + " is not a fascinating number.");
      }
  }

  
  public static boolean isFascinating(String sum) {
      String num = "123456789";
      
      
      char[] chars = sum.toCharArray();
      Arrays.sort(chars);
      String sortedSum = new String(chars);

    
      return sortedSum.equals(num);
  }
}
