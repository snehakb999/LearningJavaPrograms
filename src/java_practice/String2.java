package java_practice;

public class String2 {
    public static void main(String[] args) {
        String str1="hello";
        String str2="hello";
        String str3=new String("hello");
        System.out.println(str1==str2);//stored in same location
        System.out.println(str1==str3);//here they are stored in different locations
        System.out.println(str1.equals(str3));//here content is checking same



    }
}
