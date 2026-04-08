import java.util.Random;
public class RandomNumAT {
    public static final int TAM = 100;
    public static final int MIN = 1;
    public static final int MAX = 30;
    
public static Random random = new Random();
public static void main(String[] args){
    int[] vetor = new int[100];
    double soma = 0;

    for (int i = 0; i < vetor.length;i++){
        vetor[i] = random.nextInt(30) + 1;
        soma += vetor[i];
    }
    
    System.out.print("{");
    for (int i = 0; i < vetor.length; i++){
        System.out.print(vetor[i]);
        
        if (i < vetor.length - 1){
            System.out.print(",");
        }
    }
    System.out.println("}");
    
    double media = soma / vetor.length;
    System.out.println("\n------------------------------------------------------------------------");
    System.out.printf("Media de todos os números: %.2f\n", media);
    

    }
}
