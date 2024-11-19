import java.util.Scanner;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Primeira entrada: ");
        int numLinhas = sc.nextInt();
        int entradas[] = new int[numLinhas];
        int aux = 0;
        int entradasPar[] = new int[numLinhas];
        int entradasImpar[] = new int[numLinhas];
        int auxPar = 0;
        int auxImpar = 0;

        for (int i = 0; i < numLinhas; i++) {
            System.out.println("Informe a " + (i + 1) + " entrada: ");
            entradas[i] = sc.nextInt();
        }

        for (int i = 0; i < entradas.length; i++) {
            if (entradas[i] % 2 == 0) {
                entradasPar[auxPar] = entradas[i];
                auxPar++;
            } else {
                entradasImpar[auxImpar] = entradas[i];
                auxImpar++;
            }
        }

        for (int i = 0; i < auxPar - 1; i++) {
            for (int j = 0; j < auxPar - i - 1; j++) {
                if (entradasPar[j] > entradasPar[j + 1]) {
                    aux = entradasPar[j];
                    entradasPar[j] = entradasPar[j + 1];
                    entradasPar[j + 1] = aux;
                }
            }
        }

        for (int i = 0; i < auxImpar - 1; i++) {
            for (int j = 0; j < auxImpar - i - 1; j++) {
                if (entradasImpar[j] < entradasImpar[j + 1]) {
                    aux = entradasImpar[j];
                    entradasImpar[j] = entradasImpar[j + 1];
                    entradasImpar[j + 1] = aux;
                }
            }
        }

        System.out.println();
        for (int i = 0; i < auxPar; i++) {
            System.out.println(entradasPar[i]);
        }

        for (int i = 0; i < auxImpar; i++) {
            System.out.println(entradasImpar[i]);
        }
    }
}
