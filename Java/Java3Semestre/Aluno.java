public class Aluno extends Pessoa {
    String curso;
    double nota;
    double mensalidade;

    public Aluno(String curso, double mensalidade, double nota, int idade, String nome) {
        super(idade, nome);
        this.curso = curso;
        this.mensalidade = mensalidade;
        this.nota = nota;
    }

    public void verificaAprovacao(){
        if (this.nota >= 6.0){
            System.out.println("Aluno aprovado com nota " + this.nota);
        }else{
            System.out.println("Aluno reprovado com nota " + this.nota);
        }
    }

    public void pagarMensalidade(){
        System.out.println(getNome() + " tem a mensalidade paga.");
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public double getMensalidade() {
        return mensalidade;
    }

    public void setMensalidade(double mensalidade) {
        this.mensalidade = mensalidade;
    }

    

}
