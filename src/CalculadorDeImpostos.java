/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */

//essa classe calcula o orcamento.
public class CalculadorDeImpostos {
    
//metado realiza calculo ICMS
    public void realizaCalculoICMS(Orcamento orcamento, Imposto impostoQualquer) {
        
        double icms =  impostoQualquer.calcula(orcamento);
        System.out.println(icms);
    }

    void realizaCalculo(Orcamento orcamento, Imposto s) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
