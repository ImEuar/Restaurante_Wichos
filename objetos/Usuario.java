package objetos;

public class Usuario{
    private String username;
    private String password;

    public Usuario(){}
    public Usuario(String u, String pw){
        this.username = u;
        this.password = pw;
    }

    public String getUsername(){
        return username;
    }
    public void setUsername(String username){
        this.username = username;
    }
    public String getPassword(){
        return password;
    }
    public void setPasword(String password){
        this.password = password;
    }
}