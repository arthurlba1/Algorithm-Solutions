package tricks;

public class BinarySrch_Recursive {
    private static int buscaBinariaRecursiva(int[] vetor, int target){
        return buscaRecursiva(vetor, target, 0, vetor.length -1);
    }
    private static int buscaRecursiva(int[] vetor, int target, int menor, int maior){
        int meio = (menor + maior)/2;
        if(menor > maior){
            return -1;
        }
        if(vetor[meio] == target){
            return meio;
        }
        if(vetor[meio] < target){
            return buscaRecursiva(vetor, target, meio+1, maior);
        }
        else {
            return buscaRecursiva(vetor, target, menor, meio-1);
        }
    }
}
