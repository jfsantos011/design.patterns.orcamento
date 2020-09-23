/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Henrique
 */
public class ImpostosTestes {
    public static void main(String[] args){
        Imposto iss = new ISS();
        Imposto icms = new ICMS();
        
        Orcamento orcamento = new Orcamento(500.0);
        
        CalculadorDeImpostos calculador = new CalculadorDeImpostos();
        
        calculador.realizaCalculo(orcamento, iss);
        calculador.realizaCalculo(orcamento, icms);
        
    }
    
}
