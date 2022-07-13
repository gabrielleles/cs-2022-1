package questao3;

public class LoginInvalidException extends Exception{
    public LoginInvalidException(){
        super("Login inválido! Usuário e/ou senha incorretos!");
    }
    
}