package java_practice;

import java.util.Scanner;

public class Function2 {
    //1.without parameters/argument and without return type
     static void function1(){
        System.out.println("hello");
    }
    //2.without parameters but with return type
    static int function2(){
       int a=10;
        return a;
    }
    //3.with parameters and without return type
    static void function3(String name,int age,String food){
        System.out.println("name is "+name+" age is "+age+" favourite food is "+food);

    }
    //4.with parameters and with return type
    static int function4(int a,int b){
         int result=a+b;
         return result;
    }


    public static void main(String[] args) {
        function1();
        int ftn2=function2();
        System.out.println(ftn2);
        function3("sneha",23,"biriyani");
        Scanner s=new Scanner(System.in);
        System.out.println("enter your name,age,food details");
        String name=s.next();
        int age=s.nextInt();
        String food=s.next();
        function3(name,age,food);
       int sum= function4(4,3);
        System.out.println(sum);




    }
}
