import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> amigosYes = new ArrayList<>();
        List<String> amigosNo = new ArrayList<>(); // Lista para armazenar as entradas

        while (true) {
            String linha = sc.nextLine(); // Lê a linha inteira
            if (linha.contains("YES")) { // Verifica se é o final da entrada
                String[] nomes = linha.split(" ");
                amigosYes.add(nomes[0]);
            }
            if (linha.contains("NO")) { // Verifica se é o final da entrada
                String[] nomes = linha.split(" ");
                amigosNo.add(nomes[0]);
            }
            if (linha.equals("FIM")) { // Verifica se é o final da entrada
                break;
            }
        }
        
        int valorNome = amigosYes.get(0).length();
        System.out.println(valorNome);

        sc.close();
    }
}

    