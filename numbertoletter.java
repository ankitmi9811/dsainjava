import java.util.*;
class numbertoletter
{

   public static void convert(int s)
   {
    HashMap<Integer , String> map =  new HashMap<>();
    map.put(0,"zero");
    map.put(1,"One");
    map.put(2,"Two");
    map.put(3,"Three");
    map.put(4,"Four");
    map.put(5,"Five");
    map.put(6,"Six");
    map.put(7,"seven");
    map.put(8,"Eight");
    map.put(9,"Nine");
    String str = Integer.toString(s);

    for (int i = 0; i < str.length(); i++) {

        int num = Integer.parseInt(str.charAt(i)+"");

        System.out.print(map.get(num) + " ");
    }
    System.out.println(); 
}


 

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num ");
        int s = sc.nextInt();
    
        convert(s);
         
    }
}