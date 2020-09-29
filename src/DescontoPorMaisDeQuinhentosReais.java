/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class DescontoPorMaisDeQuinhentosReais implements Desconto {
    private Desconto proximo;

   
    
    public double desconta(Orcamento orcamento){
    if(orcamento.getValor() > 500){
            return orcamento.getValor() * 0.0;
}else
        return proximo.desconto(orcamento);
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
