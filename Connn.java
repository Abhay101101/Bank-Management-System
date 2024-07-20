package bank.management.system;

import java.sql.*;

public class Connn {
    Connection connection;
    Statement statement;
    public Connn(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankSystem","root","25@bh@y2003Jangid");
            statement = connection.createStatement();
        }catch (Exception e){
            e.printStackTrace();
        }


    }
}