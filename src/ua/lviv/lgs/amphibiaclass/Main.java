package ua.lviv.lgs.amphibiaclass;

public class Main {
    public static void main(String[] args) {

        doSomething eat = () -> System.out.println("Eating");
        doSomething sleep = () -> System.out.println("Sleeping");
        doSomething swim = () -> System.out.println("Swimming");
        doSomething walk = () -> System.out.println("Walking");

        eat.print();
        sleep.print();
        swim.print();
        walk.print();

    }
}
interface doSomething{
    void print();
}

