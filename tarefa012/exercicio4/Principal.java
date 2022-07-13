package exercicio4;

public class Principal {
    
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(300);
        System.out.println(conta.sacar(200));
        System.out.println(conta.sacar(200));
    }
    
}