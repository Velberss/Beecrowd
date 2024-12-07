import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> valores = new ArrayList<>(); // Cria o arraylist para colocas os valores
        int maior = 0;
        for (int i = 0; i < 5; i++) {
            String linha = sc.nextLine(); // Recebe toda a linha para a formatação
            String[] partes = linha.split(" "); // Separa toda a linha quando tem " "
            int quantidadeLivros = Integer.parseInt(partes[0]); // Pega o primeiro valor
            List<Integer> livros = new ArrayList<>(); // Cria o lista dos valores
            for (int j = 1; j <= quantidadeLivros; j++) {
                livros.add(Integer.parseInt(partes[j])); // Transforma em inteiro e passa pro livros
            }
            valores.add(livros);// adiciona a list no arraylist
        }
        for (List<Integer> sublista : valores) {
            sublista.sort(Collections.reverseOrder()); // Converte a lista os valores para ordem descrescente
        }
        int k = sc.nextInt();

        for (int i = 0; i > k; i++) {
        }

        sc.close();
    }
}
