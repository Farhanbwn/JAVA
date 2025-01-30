/* Create your own Exception */
class Rana extends Exception{
	Rana(String s){
		super(s);
	}
}

class RDS{
	public static void main(String[] args){
	try {
	throw new Rana("Rana sobar jaan");
	}
	catch(Rana r){
		System.out.println(r.getMessage());
		}
	}
}