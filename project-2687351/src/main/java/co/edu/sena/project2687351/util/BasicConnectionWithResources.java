package co.edu.sena.project2687351.util;

import java.sql.*;

public class BasicConnectionWithResources {
    public static void main(String[] args) {
    String url="jdbc:mysql://localhost:3308/myapp?serverTimezone=America/Bogota";
    String username="myapp";
    String password="sena1234";

    String sql="SELECT * FROM myapp.users_tbl";
    try(Connection conn= DriverManager.getConnection(url,username,password);
        Statement stmt= conn.createStatement();
        ResultSet rs=stmt.executeQuery(sql)){
        while(rs.next()){
            System.out.println(rs.getString("user_firstname"));
            System.out.println(rs.getString("user_lastname"));
        }
    }catch (SQLException e){
        e.printStackTrace();
    }
    }
}
