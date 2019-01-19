package plsqlexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;

public class ProcedureCall {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayws","root","root");
        CallableStatement cs=con.prepareCall("call edata(?,?,?)");
        cs.setInt(1,117);
        cs.setString(2, "GGG");
        cs.setInt(3,70000);
        cs.execute();
        System.out.println("Completed");
        con.close();
        
    }
}
