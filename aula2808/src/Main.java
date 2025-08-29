public class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto("Maçã", 3, 0.99, 1234);
        System.out.println(p1.getNome());
        System.out.println(p1);


        Caixa c1 = new Caixa(p1);
        c1.fazCompra(50.00);

        ProdutoPerecivel p2 = new ProdutoPerecivel ("Pão", 2, 0.50, 1255, 15, 12);
        System.out.println(p2);

        Controle controle = new Controle(p2);
        controle.verificaValidade();

        ProdutoPerecivel p3 = new ProdutoPerecivel("Leite", 1, 6.00, 254585, 12, 8);
        System.out.println(p3);
        Controle c3 = new Controle(p3);
        c3.verificaValidade();
        Caixa caixa3 = new Caixa(p3);
        caixa3.fazCompra(20.00);
    }
}