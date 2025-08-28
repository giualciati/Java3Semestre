public class Produto {
    private String nome;
    private int quantidade;
    private double precoUnitario;
    private int codigoBarra;

    public Produto(String nome, int quantidade, double precoUnitario, int codigoBarra) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.codigoBarra = codigoBarra;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco(){
        return this.precoUnitario * this.quantidade;
    }

    public void fazCompra(){
        System.out.println("Compra realizada com sucesso!" + "\n" + "Preço " + getPreco());
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public int getCodigoBarra() {
        return codigoBarra;
    }

    public void setCodigoBarra(int codigoBarra) {
        this.codigoBarra = codigoBarra;
    }

    @Override
    public String toString() {
        return "produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", precoUnitario=" + precoUnitario +
                ", codigoBarra=" + codigoBarra +
                '}';
    }
}
