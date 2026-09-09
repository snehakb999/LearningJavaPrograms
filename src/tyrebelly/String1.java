package tyrebelly;

public class String1 {
    public static void main(String[] args) {
        String name="sneha";
        System.out.println(name.length());
         //name=name.toUpperCase();
         name=name.concat(" is my love");
        System.out.println(name);
        name=name.toUpperCase();
        System.out.println(name);
        //------------------------------------------
        //heap area or object pool
        String s1=new String("hello");
        s1.toUpperCase();
        System.out.println(s1);
    }
}
