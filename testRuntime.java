class abc{
	int a = 10;
	public void show(){
		a=10+10;
		System .out.println("I am NIshan"+a);
	}
}
class cde extends abc{
	int b= a+20;
	public void show(){
		System.out.println("I am Chowdhury"+b);
	}
}

public class testRuntime{
	public static void main(String[] args){
		abc obj1 = new abc();
		cde obj2 = new cde();
		obj1.show();
		obj2.show();
	}
}