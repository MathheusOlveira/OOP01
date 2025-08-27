package OOP01.Interface;

public class MainProduto {
    public static void main(String[] args) {

        IDescontavel prodDesc1 = new ProdutoComum();
        IDescontavel prodDesc2 = new ProdutoPromocional();

        System.out.println("\n" + "Desconto Produto Comum: " + prodDesc1.calcularPrecoFinal(200));
        System.out.println("\n" + "Desconto Produto Promocional: " + prodDesc2.calcularPrecoFinal(200));

    }
}