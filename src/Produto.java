import java.util.List;

public class Produto implements I_Listar {

    public Produto() {

    }

    @Override
    public void listarItem(List<String> produtos) {
        for (int i = 0; i < produtos.size(); i++) {
            System.out.print("| " + produtos.get(i) + " |");
        }
        System.out.println();
    }

}
