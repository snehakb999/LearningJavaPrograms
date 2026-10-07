package java_practice;

public class ForLoop {
    public static void main(String[] args) {
        for (int i=0;i<=10;i++){
            if(i%2==0)
            {
                continue;
                //here even will be skipped and remaining odd will be printed



            }
            System.out.println(i);
        }

    }
}
