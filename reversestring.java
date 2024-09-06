public class reversestring {
    public static void main(String args[])
    {
        String s = new String("hello i am github");
        StringBuilder snew = new StringBuilder();
        int n = s.length();
        for(int i =n-1; i>=0; i--)
        {
            snew.append(s.charAt(i));
        }

        System.out.println(snew);
    }
}
