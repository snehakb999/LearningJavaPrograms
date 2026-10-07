package java_practice;

import java.util.Arrays;

public class Arrays1 {
    public static void main(String[] args) {
        System.out.println("three ways of printing elements");

        String name = "pramod";
        String[] each = name.split("");
       System.out.println(Arrays.toString(each));
        System.out.println("-------------");
       for(String c:each){
           System.out.println(c);
        }
        System.out.println("-----------");
       for(int i=0;i< each.length;i++)
       {
           System.out.println(each[i]);
       }

}
}