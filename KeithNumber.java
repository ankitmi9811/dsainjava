public class KeithNumber {
    public static void main(String[] args) {
        int n = 197;
        if (isKeithNumber(n)) {
            System.out.println(n + " is a Keith number.");
        } else {
            System.out.println(n + " is not a Keith number.");
        }
    }

    public static boolean isKeithNumber(int n) {
        String numStr = Integer.toString(n);
        int[] digits = new int[numStr.length()];
        
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = Character.getNumericValue(numStr.charAt(i));
        }
        
        int sum;
        while (true) {
            sum = 0;
            for (int digit : digits) {
                sum += digit;
            }
            if (sum == n) {
                return true; 
            }
            if (sum > n) {
                return false; 
            }
            System.arraycopy(digits, 1, digits, 0, digits.length - 1);
            digits[digits.length - 1] = sum;
        }
    }
}
