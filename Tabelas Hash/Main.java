import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("");
        int quantTestes = sc.nextInt();
        sc.nextLine(); 

        while (quantTestes-- > 0) {
            System.out.println("");
            String input = sc.nextLine();

            String[] parts = input.trim().split("\\s+");

            int m = Integer.parseInt(parts[0]);
            int c = Integer.parseInt(parts[1]);
            System.out.println(m + "" + c);
        }
    }
}
