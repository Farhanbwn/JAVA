class S1{
	void abc(){
		System.out.println("Ami S1");
		}
	}
class S2 extends S1{
	void def(){
		System.out.println("ami S2");
		}
	}
class S3 extends S1{
	void ghi(){
		System.out.println("ami S3");
		}
	}

public class inheritance{
	public static void main(String args[]){
		S3 obj = new S3();
		obj.abc();
		S2 obj2 = new S2();
		obj2.abc();

	}

}