import java.util.LinkedList;
import java.util.List;

public class Eletronicos extends Produto{
        LinkedList<String> eletronico = new LinkedList<>();

        public Eletronicos() {
            super();
            eletronico.add("TV");
            eletronico.add("DVD");
            eletronico.add("Notebook");
        }

        @Override
        public void listarItem(List<String> produtos) {
            super.listarItem(eletronico);
        }
    }


