package exercicio1; 

import java.util.InputMismatchException;
import java.util.Scanner;

 public class Divisao {

     public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        double num1, num2;
          
        try{
            System.out.println("Informe o dividendo: ");
            num1 = ler.nextDouble();
            System.out.println("Informe o divisor: ");
            num2 = ler.nextDouble();
            if(num2==0){
                ler.close();
                throw new ArithmeticException("Dividido por zero");
            }
            else {
                System.out.println(num1/num2);
            }          

        }
        catch(InputMismatchException e){
            System.out.println("Erro: "+e);
        }  
        ler.close();
               
    }

 }
 
