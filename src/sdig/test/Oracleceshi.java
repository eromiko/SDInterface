package sdig.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Oracleceshi {
    public static void main(String[] args) {
        Connection con = null;
        Statement st = null;

        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@192.168.100.7:1521:orcl","SDHR","SDHR");
            System.out.println("连接成功");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }
    }
}

