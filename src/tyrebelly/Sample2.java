package tyrebelly;

public class Sample2 {
    public static void main(String[] args) {

        //this is the correct way of how the post increment works .
        // first we need to print b then only a,
        // bcz first b will be assigned with original value then only a will be incremented
        int a=10;
        System.out.println("original value of a = "+a);
        int b=a++;
        System.out.println("value of b = "+b);
        System.out.println("the new value of a = "+a);
        //pre increment - here increment works
        int x=20;
        System.out.println("original value of x = "+x);
        int y=++x;
        System.out.println("value of y = "+y);
        System.out.println("the new x value will be "+x);



    }
}
