/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public interface Desconto {
    
    double desconta(Orcamento orcamento);
    void setProximo(Desconto proximo);

    public double desconto(Orcamento orcamento);
}
