public class exercicio3 {

    public static void main(String[] args) {

        Usuario usuario = new Usuario();

        usuario.login = "GabrielLeles";

        usuario.senha = "^4B!!B/!/!";

        boolean validSenha = Validador.verificadorSenha(usuario);

        boolean validLogin = Validador.verificadorLogin(usuario);

        System.out.println("O login "+usuario.login+" é válido: "+validLogin);

        System.out.println("A senha "+usuario.senha+" é válida: "+validSenha);
        
    }

}

class Usuario {

    String login;

    String senha;

    public String getLogin() {

        return login;
    
    }

    public String getSenha() {
        
	return senha;

    }
}

class VerificadorSenha {
    
	public static boolean verificadorLogin(Usuario usuario){

        String login = usuario.getLogin();

        return login.matches("^(?=.*[@!#$%^&*.~()\\])(?=.*[0-9])(?=.*[A-z])[@!#$%^&*.~()\\a-zA-Z0-9]{5,30}$");

    }

    public static boolean verificadorSenha(Usuario usuario){

        String senha = usuario.getSenha();

        return senha.matches("^(?=.*[@!#$%^&*.~()\\])(?=.*[0-9])(?=.*[A-Z])[@!#$%^&*.~()\\a-zA-Z0-9]{8,12}$");
    }
}