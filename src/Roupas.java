import java.util.LinkedList;
import java.util.List;

public class Roupas extends Produto{
    LinkedList<String> roupa = new LinkedList<>();

    public Roupas() {
        super();
        roupa.add("Calça");
        roupa.add("Camisa");
        roupa.add("Meia");
    }

    @Override
    public void listarItem(List<String> produtos) {
        super.listarItem(roupa);
    }
}
