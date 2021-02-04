package tricks;

public class BinarySrch_Iterative {
    private static int buscaBinaria(int[] vetor, int target){
        int meio, inicio, fim;
        inicio = 0;
        fim = vetor.length -1;
        while(inicio<=fim){
            meio = (inicio + fim)/2;
            if(vetor[meio] == target){
                return meio;
            }
            else if (vetor[meio] < target){
                inicio = meio + 1;
            }
            else if (vetor[meio] > target){
                fim = meio -1;
            }
        }
        return -1;
    }
}
