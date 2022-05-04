package br.ufrn.imd;

public class TesouroSelic extends Investimento{

    public double calcular(double rentabilidadeLiquidaAno, double ValorInicial){

        return (rentabilidadeLiquidaAno/100 + valorInicial);
    }

}
