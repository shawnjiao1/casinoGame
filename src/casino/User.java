
package casino;


public abstract class User {
    private String user;
    private String pass;
    
    public User(String user, String pass){
        
        this.user = user;
        this.pass = pass;
        
        
    }
    
    public String getUsername(){
        
        return user;
    }
    
    public String getPassword(){
        
        return pass;
    }
    
    
    
    
}
