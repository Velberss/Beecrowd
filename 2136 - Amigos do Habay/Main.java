import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

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

        Collections.sort(amigosYes);
        Collections.sort(amigosNo);

        for(int i =0; i< amigosYes.size();i++){
            System.out.println(amigosYes.get(i));
        }

        for(int i =0; i< amigosNo.size();i++){
            System.out.println(amigosNo.get(i));
        }
        
        System.out.println("Amigo do Habay:");
        System.out.println(amigosYes.get(0));

        sc.close();
    }
}

    