import java.util.Scanner;

public class VetorUnico {
    public static final int TAM = 10; //o tamanho máximo é 10
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros = new int[TAM];
        pSR(numeros); //pSR(preencher sem repetição) é o que vai verificar e colcoar os numeros juntos.
        imprimir(numeros); // vai mostrar o resultado
    }

    public static void pSR(int[] v) {
        for (int i = 0; i < v.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número:");
            int valor = input.nextInt();
            //esse for laço vai fazer a tarefa de repetir 10 vezes.(para cada espaço existente).

            while (existeNoVetor(v, i, valor)) {
                System.out.println("Valor já presente! Digite um valor diferente.");
                System.out.print("Digite o " + (i + 1) + " número novamente: ");
                valor = input.nextInt();
                /* aqui no while, ele chama o existeNoVetor, ele vai verificar se existe o número la dentro.
                No caso de existir o número digitado, ele irá repetir infinitamente ate digitar um numero viável.
                */

            }
            v[i] = valor; //toda vez que um número é digitado e ele for "NOVO" ele vai ser guardado aqui.
        }
    }
    public static boolean existeNoVetor(int[] v, int quantidadeAtual, int valor) {
        for(int j = 0; j < quantidadeAtual; j++) {
            if(v[j] == valor) {
                return true;
                /* Nesse bloco ele vai verificar todos os numeros. ele recebe a caixa (v) que é responsavel
                * pela entrada de números. No caso esse bloco vai percorrer por todos os numeros digitados e vai verificar
                * se há numeros repetidos ou não. se ele achar um numero igual, ele será igual a TRUE. */
            }
        }
        return false; //se não achar numeros iguais o resultado é false. (pode entrar que é novo.)

    }
    public static void imprimir(int[] v) {
        for (int i = 0; i < v.length; i++){
            System.out.print(v[i] + (i == v.length - 1 ? "" : " ")); /*Depois que você ja tem os 10 numeros diferente
             ele imprimi o resultado, mas pq a laço "for" ? no caso é so pra ficar mais bonitinho, enquanto ele mostra cada
             numero ele vai gerar um espaço " " mas no ultimo da fila não irá existir espaço. ""*/
        }
        System.out.println();
    }
}
