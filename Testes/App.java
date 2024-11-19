package Testes;

import java.util.Scanner;

public class App {
    public void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Fale o tamanho do array: ");
        int x = sc.nextInt();
        int b[] = new int[x];
        int aux = 0;
        for (int i = 0; i < b.length; i++) {
            System.out.println("fale o veto");
            b[i] = sc.nextInt();
        }

        for (int i = 0; i < b.length - 1; i++) {
            for (int j = 0; j < b.length - i - 1; j++) {
                if (b[j] > b[j + 1]) {
                    aux = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = aux;
                }
            }
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
