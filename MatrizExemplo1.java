import java.util.Scanner;

public class matriz {
    public static void main(String[] args) {
        // Instancia o Scanner apenas uma vez
        Scanner scanner = new Scanner(System.in);

        // Definição das dimensões
        int linhas = 4;
        int colunas = 3;
        int[][] matriz = new int[linhas][colunas];

        System.out.println("Preencha a matriz 4x3:");

        // Leitura dos dados
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt(); // Agora usa a variável 'scanner' correta
            }
        }

        // Exibição da matriz
        System.out.println("\nMatriz Resultante:");
        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println(); // Pula linha após imprimir cada linha da matriz
        }

        scanner.close(); // Boa prática: fechar o scanner ao final
    }
}