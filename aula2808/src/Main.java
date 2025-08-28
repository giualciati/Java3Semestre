public class Main {
    public static void main(String[] args) {
    Produto p1 = new Produto("Maçã", 3, 0.99, 1234);
        System.out.println(p1.getNome());
        System.out.println(p1);


        Caixa c1 = new Caixa(p1);
        c1.fazCompra(50.00);

    }
}