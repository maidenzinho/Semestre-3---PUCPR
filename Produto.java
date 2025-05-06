import java.util.ArrayList;

public class Produto {
    // Atributos privados (complete)
    private String nome;
    private double preco;

    // Construtor (complete)
    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    // Método getPreco (complete)
    public double getPreco() {
        return preco;
    }
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<Produto>();
        produtos.add(new Produto("Notebook", 2500.0));
        produtos.add(new Produto("Mouse", 50.0));

        System.out.println("Preço do Notebook: R$" + produtos.get(0).getPreco());
    }
}