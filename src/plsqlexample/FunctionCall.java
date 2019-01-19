package plsqlexample;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Types;

public class FunctionCall {
 public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mayws","root","root");
        CallableStatement cs=con.prepareCall("{?=call GetBonus(?)}");
        cs.registerOutParameter(1, Types.INTEGER);
        cs.setInt(2,116);
        cs.execute();
        int res=cs.getInt(1);
        System.out.println(res);
        con.close();
        
    }    
}
