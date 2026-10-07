package java_practice;

public class StringBufferBuilder1 {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("sneha");
        System.out.println("------- string buffer-----------");

        System.out.println(sb);
        System.out.println(sb.append("love"));
        System.out.println(sb.insert(5,"is")); // here it will insert the string after the given index position
        System.out.println(sb.reverse());

        StringBuilder sb1=new StringBuilder("poornima");
        System.out.println("------- string builder-----------");

        System.out.println(sb1);
        System.out.println(sb1.append(" love"));
        System.out.println(sb1.delete(5,9));//delete from 5 to 9 includes 9
        System.out.println(sb1.replace(0,4,"sneha"));

    }
}
