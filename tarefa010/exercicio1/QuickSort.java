import java.util.*;

public class QuickSort {
    
    static int particao(int vetor[], int menor, int maior)
    {
        int pivot = vetor[maior];
        int i = (menor - 1); 
        for (int j = menor; j <= maior - 1; j++) {
            
            if (vetor[j] <= pivot) {
                i++;
  
                
                int temp = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = temp;
            }
        }
  
        
        int temp = vetor[i + 1];
        vetor[i + 1] = vetor[maior];
        vetor[maior] = temp;
  
        return i + 1;
    }
  
    
    static void quickSortRecursivo(int vetor[], int menor, int maior)
    {
        if (menor < maior) {
           
            int pi = particao(vetor, menor, maior);
  
            
            qSortRecursivo(vetor, menor, pi - 1);
            qSortRecursivo(vetor, pi + 1, maior);
        }
    }

   
  
    
    static void quickSortIterativo(int vetor[], int menor, int maior)
    {
        
        int[] pilha = new int[maior - menor + 1];
  
        
        int topo = -1;
  
        
        pilha[++topo] = menor;
        pilha[++topo] = maior;
  
        
        while (topo >= 0) {
            
            maior = pilha[topo--];
            menor = pilha[topo--];
  
            
            int p = particao(vetor, menor, maior);
  
            
            if (p - 1 > menor) {
                pilha[++topo] = menor;
                pilha[++topo] = p - 1;
            }
  
            
            if (p + 1 < maior) {
                pilha[++topo] = p + 1;
                pilha[++topo] = maior;
            }
        }
    }

    
    
}