import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<List<Integer>> valores = new ArrayList<>(); // Cria o arraylist para colocas os valores

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

        List<Integer> somas = new ArrayList<>();
        for (int a = 0; a < valores.get(0).size(); a++) {
            for (int b = 0; b < valores.get(1).size(); b++) {
                for (int c = 0; c < valores.get(2).size(); c++) {
                    for (int d = 0; d < valores.get(3).size(); d++) {
                        for (int e = 0; e < valores.get(4).size(); e++) {
                            int soma = valores.get(0).get(a) + valores.get(1).get(b) + valores.get(2).get(c)
                                    + valores.get(3).get(d) + valores.get(4).get(e);
                            somas.add(soma); // Armazena a soma na lista
                        }
                    }
                }
            }
        }

        somas.sort(Collections.reverseOrder());//Organizei todas as somas de forma decrescente
        int somaFinal = 0;
        
        for (int i = 0; i < k; i++) {
            somaFinal += somas.get(i);
        }
        System.out.println(somaFinal);
        sc.close();
    }
}