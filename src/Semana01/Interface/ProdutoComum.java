package Semana01.Interface;

public class ProdutoComum implements IDescontavel{
    @Override
    public double calcularPrecoFinal(double precoBase){
        return precoBase * 0.95;
    }
}