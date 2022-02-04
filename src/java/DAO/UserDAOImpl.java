
package DAO;

import DBUtility.DBConnection;
import Model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;


public class UserDAOImpl implements UserDAO{

    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    
    @Override
    public List<User> getAllUserDAO() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserDAO(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void insertUserDAO(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteUserDAO(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateUserDAO(User u) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User getUserDAO(String username, String pass) {
        
        
        try{
            String SQL = "SELECT * FROM USER WHERE   username=? and   password = ?  ";
           conn = DBConnection.openConnection();
           ps = conn.prepareStatement(SQL);
           ps.setString(1, username);
           ps.setString(1, pass);
           rs = ps.executeQuery();
           
           rs.next();
           User u = new User(rs.getString("username"), rs.getString("id"), rs.getString("password") ,rs.getInt("level"));
               
  
          return u;
        }catch(Exception ex){
            
        } 
       
        
        
        
        
       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
