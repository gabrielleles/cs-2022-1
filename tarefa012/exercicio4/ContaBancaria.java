package exercicio4;

public class ContaBancaria {

    double saldo = 0;
    
    void depositar(double adicional){
        saldo+=adicional;
    }
    
    boolean sacar(double valor){
        try{
            this.saldo-=valor;
            if(this.saldo<0){
                
                throw new SaldoInsuficienteException();
            }else{
                return true;
            }
        }catch(SaldoInsuficienteException e){
            System.out.println(e);
        }
        return false;

    }

}