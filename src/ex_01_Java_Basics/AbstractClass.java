package ex_01_Java_Basics;
abstract class Vehicle{

    //-no body for abstract method in it
    abstract public void start();


    // Normal method - has a body
    public void stop() {
        System.out.println("the vehicle stops");
    }
}

class Kia extends Vehicle{

    @Override
    public void start() {
        System.out.println("kia starts with press button");

    }

    @Override
    public void stop() {
        super.stop();

    }

}
class Bike extends Vehicle{

    @Override
    public void start() {
        System.out.println("bike starts with kicker");

    }

}
public class AbstractClass {
    public static void main(String[] args) {
        //we cannot create abstract class object

        Kia ob=new Kia();
        ob.start();
        ob.stop();
        Bike ob2=new Bike();
        ob2.start();

    }
}
