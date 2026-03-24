package pack3;
import pack1.Hello;
import pack2.Hello2;

public class Main {
    public static void main(String[] args) {
        Hello a = new Hello();
        Hello2 b = new Hello2();

        a.methodOne();
        b.methodTwo();
        System.out.println("hrllo");
    }
    
}
