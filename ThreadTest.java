class A extends Thread{
	public void run(){
		for(int i = 1; i<=20; i++){
			System.out.println("Hello from A, i="+i);
		}
		System.out.println("Exit from A");
	}
}
class B extends Thread{
	public void run(){
		for(int j = 1; j<=20; j++){
			System.out.println("Hello from B, j="+j);
		}
		System.out.println("Exit from B");
	}
}

class ThreadTest{
	public static void main(String args[]){
	A a = new A();
	B b = new B();
	a.start();
	b.run();
	}
}
