package OOP01.Interface;

public class ProdutoPromocional implements IDescontavel{
    @Override
    public double calcularPrecoFinal(double precoBase){
        return precoBase * 0.8;
    }
}