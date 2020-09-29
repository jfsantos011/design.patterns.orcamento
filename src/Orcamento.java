

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Henrique
 */

public class Orcamento {
    
    private final double valor;
    private List<Item> itens;

    
    
    public Orcamento(double valor){
      this.valor = valor;
      itens = new ArrayList<Item>();
    }

    public double getValor() {
        return valor;
    }
    public void adiconaItem(Item item){
        itens.add(item);
    }
    public List<Item> getItens() {
        return Collections.unmodifiableList(itens);
    }

    void adicionaItem(Item item) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
