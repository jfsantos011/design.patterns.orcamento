/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class DescontoPorCincoItens implements Desconto{
    private Desconto proximo;
    

    public double desconta(Orcamento orcamento){
    if(orcamento.getItens().size() > 5){
          return orcamento.getValor() * 0.1;
        }
    else
        return proximo.desconta(orcamento);
    }

    @Override
    public void setProximo(Desconto proximo) {
         this.proximo = proximo;
    }

    @Override
    public double desconto(Orcamento orcamento) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
