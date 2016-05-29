package base;
/**
 *
 * @author hayashi-s
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DBManager {
    public static Connection getConnection(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            
        //課題６
            String url = "jdbc:mysql://localhost:8889/Challenge_db?useUnicode=true&characterEncoding=utf8";
            con = DriverManager.getConnection(url,"root","root");
        //課題６
            
            System.out.println("DBConnected!!");
            return con;
        }catch(ClassNotFoundException e){
            throw new IllegalMonitorStateException();
        } catch (SQLException e) {
            throw new IllegalMonitorStateException();
        }
    }
}
