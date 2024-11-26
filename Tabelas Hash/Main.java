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

            if (parts.length >= 2) {

                int mMod = Integer.parseInt(parts[0]);
                int cQuant = Integer.parseInt(parts[1]);

                System.out.println(" " + mMod + " " + cQuant);

                TabelaHash tabela = new TabelaHash(mMod);
                List<Integer> chaves = Arrays.stream(input.trim().split(" ")).map(Integer::parseInt).collect(Collectors.toList());
                for (int i = 0; i < chaves.size(); ++i) {
                    tabela.adiciona(chaves.get(i));
                }

            } else {
                System.out.println("Entrada inválida.");
            }
            sc.close();
        }
    }

    public class TabelaHash {
        private int chave;
        private List<Integer>[] tabela;

        public TabelaHash(int chave){
            this.chave = chave;
            this.tabela = new ArrayList[chave];
        }
    }
}