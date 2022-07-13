package exercicio3;

public class Login {

    public String usuario;
    public String senha; 
    
    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }
    public String getUsuario() {
        return usuario;
    }
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    public boolean fazerLogin(String usuario, String senha){
        try{
            if(usuario==getUsuario() &&  senha==getSenha()){
                return true;
            }
            else{
                throw new LoginInvalidException();
            }

        }catch(LoginInvalidException e){
            System.out.println(e);
        }
        return false;
    }

}