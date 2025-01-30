class S1{
	int a;
	void S1(int a){
	this.a=a;
		System.out.println(a);
		}
	}

public class THIS{
	public static void main(String args[]){
		S1 obj = new S1();
		obj.S1(100);

	}

}