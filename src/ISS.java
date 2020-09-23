/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
//class para realizar o calculo do iss, no qual receber o orçamento e calcula o imposto utilizando a interface imposto.
public class ISS implements Imposto {
    
    @Override
    public double calcula(Orcamento orcamento) {
        return orcamento.getValor()*0.6;
    }
}
