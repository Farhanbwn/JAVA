class uit {
    void show() {
        System.out.println("UIT");
    }
}
class teachers extends uit {
	 void show() {
        System.out.println("Teachers");
    }
}
public class overriding {
    public static void main(String[] args) {
        uit BU = new uit();
        BU.show();

        uit TEACHER = new teachers();
        TEACHER.show();
    }
}
