import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(); // Tamanho do trem (
        sc.nextLine(); // Consumir o caractere de nova linha após o próximo inteiro
        String[] resultados = new String[L]; // Armazenar os resultados para exibição posterior

        for (int i = 0; i < L; i++) {
            int permutaçãoL = sc.nextInt(); // Quantidade de vagões na permutação
            sc.nextLine(); // Consumir o caractere de nova linha após o próximo inteiro

            int[] vagoes = new int[permutaçãoL];// Ler todos os vagões em uma única linha
            String linha = sc.nextLine();
            String[] vagoeString = linha.split(" ");

            for (int k = 0; k < permutaçãoL; k++) {
                vagoes[k] = Integer.parseInt(vagoeString[k]);// Transforma os vagões para int
            }

            // Contar os ordenamentos necessários (usando bolha)
            int cont = 0;
            for (int j = 0; j < permutaçãoL - 1; j++) {
                for (int k = 0; k < permutaçãoL - j - 1; k++) {
                    if (vagoes[k] > vagoes[k + 1]) {
                        int temp = vagoes[k]; // vai trocar os vagões
                        vagoes[k] = vagoes[k + 1];
                        vagoes[k + 1] = temp;
                        cont++; // contador de trocas
                    }
                }
            }

            if (cont == 1) { // Coloco os resultados no array de string para passar no final
                resultados[i] = "Optimal train swapping takes 1 swap.";
            } else {
                resultados[i] = "Optimal train swapping takes " + cont + " swaps.";
            }
        }
        for (String resultado : resultados) {
            System.out.println(resultado);
        }
        sc.close();
    }
}
