class Calculator{

    void add(int a, int b) {
        System.out.println(a+b);
    }
    void add(int a, int b, int c) {
        System.out.println(a+b+c);
    }
}
public class overloading {
    public static void main(String[] args) {
        Calculator obj = new Calculator();

        obj.add(5, 10);
        obj.add(5, 10, 15);
    }
}
