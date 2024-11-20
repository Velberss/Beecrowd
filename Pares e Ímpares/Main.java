
import java.util.ArrayList;
import java.util.Scanner;
import java.io.IOException;
import java.util.Collections;
public class Main{


    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> impares = new ArrayList<>();
        ArrayList<Integer> pares = new ArrayList<>();

        int n = sc.nextInt();
        int x;

        while(n-->0){
            x = sc.nextInt();
            if(x%2 == 0) {
                pares.add(x);
            }
            else {
                impares.add(x);}
        }

        Collections.sort(pares);
        Collections.sort(impares);

        for(int y=0; y < pares.size() ; y++) 

        System.out.println(pares.get(y));
        for(int y = impares.size()-1 ; y>=0 ; y--) 
        System.out.println(impares.get(y));
        
        sc.close();
    }
}