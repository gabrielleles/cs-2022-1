import java.util.ArrayList;
import java.util.Random;

public class Principal {

    
    public static void main(String[] args) {
        Random numAleatorio = new Random();
        int[] lista100 = new int[100];
        int[] lista1000 = new int[1000];
        int[] lista10000 = new int[10000];

        int[] lista1001 = new int[100];
        int[] lista10001 = new int[1000];
        int[] lista100001 = new int[10000];


        for(int i=0;i<lista10000.length;i++){
            if(i<lista100.length){

                lista100[i]=numAleatorio.nextInt(90000);
                lista1001[i]=numAleatorio.nextInt(90000);
            }
            if(i<lista1000.length){

                lista1000[i]=numAleatorio.nextInt(90000);
                lista10001[i]=numAleatorio.nextInt(90000);
            }
            lista10000[i]=numAleatorio.nextInt(90000);
            lista100001[i]=numAleatorio.nextInt(90000);
        }

        long start = System.currentTimeMillis();
        QuickSort.quickSortRecursivo(lista100, 0, lista100.length-1);
        long elapsed = System.currentTimeMillis() - start;
        System.out.println("Tempo do quickSort recursivo com 100 valores é de: "+elapsed);

        long comeco = System.currentTimeMillis();
        QuickSort.quickSortIterativo(lista1001, 0, lista100.length-1);
        long fim = System.currentTimeMillis() - comeco;
        System.out.println("Tempo do quickSort iterativo com 100 valores é de: "+fim);

        long start1 = System.currentTimeMillis();
        QuickSort.quickSortRecursivo(lista1000, 0, lista1000.length-1);
        long elapsed1 = System.currentTimeMillis() - start1;
        System.out.println("Tempo do quickSort recursivo com 1000 valores é de: "+elapsed1);

        long comeco1 = System.currentTimeMillis();
        QuickSort.quickSortIterativo(lista10001, 0, lista1000.length-1);
        long fim1 = System.currentTimeMillis() - comeco1;
        System.out.println("Tempo do quickSort iterativo com 1000 valores é de: "+fim1);
        
        long start2 = System.currentTimeMillis();
        QuickSort.qSortRecursivo(lista10000, 0, lista10000.length-1);
        long elapsed2 = System.currentTimeMillis() - start2;
        System.out.println("Tempo do quickSort recursivo com 10000 valores é de: "+elapsed2);

        long comeco2 = System.currentTimeMillis();
        QuickSort.quickSortIterativo(lista100001, 0, lista10000.length-1);
        long fim2 = System.currentTimeMillis() - comeco2;
        System.out.println("Tempo do quickSort iterativo com 10000 valores é de: "+fim2);
        

        


        

        
        
    }


    
}