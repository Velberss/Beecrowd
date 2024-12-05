import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quantTestes = sc.nextInt();
        sc.nextLine(); 

        List<String> resultados = new ArrayList<>();
        for (int t = 1; t <= quantTestes; t++) {
            String[] params = sc.nextLine().trim().split("\\s+");
            int mMod = Integer.parseInt(params[0]);
            String[] chaveStr = sc.nextLine().trim().split("\\s+");
            
            List<Integer> chaves = Arrays.stream(chaveStr).map(Integer::parseInt).collect(Collectors.toList());

            TabelaHash tabela = new TabelaHash(mMod);
            for (int chave : chaves) {
                tabela.adiciona(chave);
            }
            
            resultados.add(tabela.obterTabela());
        }
        sc.close();
    
        for (int i = 0; i < resultados.size(); i++) {
            System.out.print(resultados.get(i));
            if (i < resultados.size() - 1) {
                System.out.println(); 
            }
        }
    }
}

class TabelaHash {
    private int mod;
    private List<Integer>[] tabela;

    public TabelaHash(int mod) {
        this.mod = mod;
        this.tabela = new ArrayList[mod];
        for (int i = 0; i < mod; i++) {
            tabela[i] = new ArrayList<>();
        }
    }

    public void adiciona(Integer valor) {
        int indice = valor % mod; 
        tabela[indice].add(valor);
    }

    public String obterTabela() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tabela.length; i++) {
            sb.append(i).append(" -> ");
            if (tabela[i] != null) {
                for (Integer valor : tabela[i]) {
                    sb.append(valor).append(" -> ");
                }
            }
            sb.append("\\\n");
        }
        return sb.toString();
    }
}
