public class AlunoBolsista extends Aluno{
    
    public AlunoBolsista(String curso, double mensalidade, double nota, int idade, String nome) {
        super(curso, mensalidade, nota, idade, nome);
    }
    
    //@Override
    public void pagarMensalidade(){
        System.out.println("Aluno bolsista não precisa pagar mensalidade.");
    }
    
}
