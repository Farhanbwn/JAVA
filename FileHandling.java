import java.io.*;
class FileHandling{
	public static void main(String[] args){

	File f = new File("C:\\Users\\nisha\\Desktop\\Myfile.txt");
	try{
		if(f.createNewFile()){
			System.out.println("File Created");
		}
		else{
			System.out.println("File already exist");
		}
	}
	catch(IOException i){
		System.out.println(i);
		}
	}
}