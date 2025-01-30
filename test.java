class demo{
	int a =10;
	static int b =1000;

	void show(){
		System.out.println(a+" "+b);
		++a; ++b;
		}
}

class test{
	public static void main(String[] args){
		demo dem = new demo();
		dem.show();
		dem.show();
		}
	}