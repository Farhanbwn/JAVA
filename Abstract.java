// Abstract class
abstract class A {
    abstract void show();
}

// Abstraction performed using extends
class B extends A{
    void show()
    {
        System.out.println("Farhan");
	}
}
// Base class
class Abstract {
    public static void main(String args[])
    {

        B obj = new B();
        obj.show();
    }
}