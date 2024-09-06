// Eliminate repeated array from the given string

public class repeatedelement {
    public static void main(String[] args) {
        String s = new String("hello myy nammme is ankit");
        char ch;
        StringBuilder result = new StringBuilder();
        for(int i =0; i<s.length();i++)
        {   ch = s.charAt(i);
            if(result.indexOf(String.valueOf(ch))==-1)
            {
                result.append(ch);
            }
        }
   
   System.out.println(result);
    }
}
