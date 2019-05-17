package Login;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
/**
 *
 * @author #RIGBY MULTIMEDIA
 */
public class LoginToRegister {
    private static String servername="localhost";
    private static String username="root";
    private static String dbname="Perpustakaan";
    private static int portnumber=3306;
    private static String password="";
    
    public static Connection getConnection (){
        Connection cnx = null;
        MysqlDataSource datasource = new MysqlDataSource();
        
        datasource.setServerName(servername);
        datasource.setUser(username);
        datasource.setPassword(password);
        datasource.setDatabaseName(dbname);
        datasource.setPortNumber(portnumber);
        
        try {
            cnx = datasource.getConnection();
        } catch (SQLException ex) {
            java.util.logging.Logger.getLogger(" Get Connection" + LoginToRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
        
   
        return cnx;
    }
    
    public static void setData (String s) throws Exception{
        LoginToRegister.getConnection().createStatement().executeUpdate(s);
    }
    public static ResultSet getData(String sq) throws Exception{
        return LoginToRegister.getConnection().createStatement().executeQuery(sq);
    }
    
}
