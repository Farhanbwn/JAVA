import java.util.Scanner;
 class prog1{
    public static void main(String[] args) {
        System.out.println("Enter first Charecter:");
        Scanner sc=new Scanner(System.in);
        char a=sc.next().charAt(0);
        System.out.println("Enter second Charecter:");
        char b=sc.next().charAt(0);

        if(a>b){
            System.out.println(a+"," +b);
        }
        else{
            System.out.println(b+","+a);
        }
        sc.close();
    }
}