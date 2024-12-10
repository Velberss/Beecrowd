import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> amigosYes = new ArrayList<>(); // Lista dos amigos Yes
        List<String> amigosNo = new ArrayList<>(); // Lista dos amigos No
        String amigoHabay = ""; // String final ner

        while (true) {
            String linha = sc.nextLine(); // Lê a linha inteira

            if (linha.contains("YES")) { // Verifica se tem "YES" no final da entrada
                String[] nomes = linha.split(" "); // Separa a linha em duas partes
                if (!amigosYes.contains(nomes[0])) { // Verifica se o nome já ta na lista
                    amigosYes.add(nomes[0]); // adiciona a primeira parte do array por causa que a posição 0 é o nome
                }
            }
            if (linha.contains("NO")) { // Verifica se tem "NO" no final da entrada
                String[] nomes = linha.split(" "); // Separa a linha em duas partes
                if (!amigosNo.contains(nomes[0])) { // Verifica se o nome já ta na lista
                    amigosNo.add(nomes[0]); // adiciona a primeira parte do array por causa que a posição 0 é o nome
                }
            }
            if (linha.equals("FIM")) { // Verifica se é O "FIM" para acabar com as entradas
                break;
            }
        }

        int maiorTamanho = 0; // Cria uma variavel int para verificar os maiores Tamanhos
        for (int i = 0; i < amigosYes.size(); i++) { // Basico né, vai percorrer toda lista
            for (String nome : amigosYes) {
                if (nome.length() > maiorTamanho) { // verifica se caso o nome que esteja passando no for seja maior que
                                                    // o maiorTamanho
                    maiorTamanho = nome.length(); // Caso seja, ela vira o maiorTamanho e continua fazendo a verificação
                    amigoHabay = nome; // Atualiza o Amigo do Habay
                }
            }
        }
        Collections.sort(amigosNo);
        Collections.sort(amigosYes);
        for (int i = 0; i < amigosYes.size(); i++) { // For para printar os amigos do Yes
            System.out.println(amigosYes.get(i));
        }

        for (int i = 0; i < amigosNo.size(); i++) { // For para printar os amigos do No
            System.out.println(amigosNo.get(i));
        }

        System.out.println();
        System.out.println("Amigo do Habay:");
        System.out.println(amigoHabay);

        sc.close();
    }
}
