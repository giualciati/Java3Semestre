public class Controle{

    private ProdutoPerecivel produto;

    public Controle(Produto produto) {
        this.produto = (ProdutoPerecivel) produto;
    }

    public void verificaValidade() {
        if(produto.estaValido()){
            System.out.println(produto.getNome()+ " está válido");
        }else{
            System.out.println(produto.getNome() + " está vencido");
        }
    }
}
