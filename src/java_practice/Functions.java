package java_practice;

public class Functions {

    //non return type ftn
    static void maxima_ftn(){
        System.out.println("hello");
    }
    //return type ftn
    static int doodle_ftn(){
        int a=10;
        a++;
        return a;

    }
    public static void main(String[] args) {
        System.out.println("next line, I'm calling a non return type ftns output");
        maxima_ftn();
        int doodle=doodle_ftn();
        System.out.println(doodle);

    }
}
