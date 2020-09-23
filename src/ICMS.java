/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */

//class para realizar o calculo do icms usando a interface de imposto.
public class ICMS implements Imposto {
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor()*0.1;
    }
}
