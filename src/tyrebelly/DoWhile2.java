package tyrebelly;

public class DoWhile2 {
    public static void main(String[] args) {
        int a=0;
        do{
           a++;
            System.out.println(a);
        }while(a<0);

        //A do-while loop executes at least once, regardless of the condition.
        //Initially, a = 0.
        //The loop:
        //Increments a → a = 1
        //Prints 1
        //Then checks a < 0 → which is false
        //So, loop stops after one iteration
    }
}
