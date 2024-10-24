import java.util.LinkedList;
import java.util.List;

public class Alimentos extends Produto{

        LinkedList<String> alimento = new LinkedList<>();

        public Alimentos() {
            super();
            alimento.add("Banana");
            alimento.add("Chocolate");
            alimento.add("Torta");
        }

        @Override
        public void listarItem(List<String> produtos) {
            super.listarItem(alimento);
        }
    }


