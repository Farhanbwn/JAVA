class S1{
	void abc(){
		System.out.println("Ami S1");
		}
	}
class S2 {
	void def(){
		System.out.println("ami S2");
		}
	}
class S3 extends S1,S2{
	void ghi(){
		System.out.println("ami S3");
		}
	}

public class inheritance2{
	public static void main(String args[]){
		S3 obj = new S3();
		obj.abc();


	}

}