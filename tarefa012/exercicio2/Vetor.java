package exercicio2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Vetor {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] vetor = new int[10];
        int i=0;
        
        try{

        while(true){
            
            System.out.println("Informe um numero: ");
            vetor[i] = ler.nextInt();
            i++;
            if(vetor[i-1]==0){
                ler.close();
                break;
            }

            
        }

        }catch(InputMismatchException e){
            System.out.println("Erro do painel: "+e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Erro do painel: "+e);
        }
        ler.close();


        
    }
}