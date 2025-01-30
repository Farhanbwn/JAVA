class S1{

		int a= 100;


	}
class S2 extends S1{
	int a= 500;
	void def(){
		System.out.println(a);
		System.out.println(super.a);
		}
	}

public class SUPER{
	public static void main(String args[]){
		S3 obj = new S3();
		obj.def();

	}

}