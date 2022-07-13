package exercicio3;

public class Principal {
    
    public static void main(String[] args) {
        
        Login login = new Login();
        login.setUsuario("usuario1");
        login.setSenha("123");

        System.out.println(login.fazerLogin("usuario1", "123"));
        System.out.println(login.fazerLogin("us", "12"));
    }
    
}