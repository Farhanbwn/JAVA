import java.sql.*;

public class jdbc {
public static void main(String[] args) {
    try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
        Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","L20233080","2436");
        Statement st =con.createStatement();
        /*st.executeQuery("insert into Student_details values('S0077','Nishan','Bwn','IT','28-oct-03')");
        System.out.println("1 row inserted");*/

        ResultSet rs = st.executeQuery("select * from Student_details");
        while (rs.next()) {
    
        String sid = rs.getString(1);
        String name = rs.getString(2);
        String add = rs.getString(3);
        String branch = rs.getString(4);
        Date adm_date = rs.getDate(5);

        System.out.println(sid+" "+name+" "+add+" "+branch+" "+adm_date);
}
con.close();
    }
    catch(Exception e){
            System.err.println(e);
    }
}
}
