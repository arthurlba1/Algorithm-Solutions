public class Maximum_Swap {
    public static void main(String[] args) {
        int num = 2736;
        //       >|
        char[] digitos = String.valueOf(num).toCharArray();
        
        for(int i = 0; i < digitos.length; i++){
            System.out.println("No i" +digitos[i]);
            int aux=1;
            if(digitos[i] > digitos[i + aux]) {
                aux++;
            }
        } 
    }
}
