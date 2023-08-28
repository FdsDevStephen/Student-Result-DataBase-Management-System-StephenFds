package student.rms;
import java.sql.*;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.Statement;

public class connect{
    Connection connection;
    Statement statement;
    public Conn(){
        try{
            connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/dbsr","root","2594");
            statement = connection.createStatement();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {

    }

}