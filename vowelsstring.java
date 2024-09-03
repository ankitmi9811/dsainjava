class vowelsstring
{
    public static void main(String args[])
    {
        char ch;
        String str = new String("hello welcome to codespacs");

        for(int i =0; i < str.length(); i++)
        {   ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' )
            {
                 continue ; 
            }
            else 
            {
            System.out.print(ch);
            }
        }
    }
}