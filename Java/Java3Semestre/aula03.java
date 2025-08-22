public class aula03{
    public static void main(String[] args) {
        System.out.println("Oi");

        Professor prof1 = new Professor(15, 47000.00, 50, "Marcio");
        prof1.fazAniversario();
        prof1.recebeSalario();
        System.out.println(prof1.getIdade());

        Aluno a1 = new Aluno("ADS", 486.00, 9, 21, "Giulia");
        a1.fazAniversario();
        a1.verificaAprovacao();
        a1.pagarMensalidade();
        System.out.println(a1.getIdade());

        Aluno a2 = new AlunoBolsista("ADS", 486.00, 10, 19, "Manuela");
        a2.fazAniversario();
        a2.verificaAprovacao();
        a2.pagarMensalidade();
        System.out.println(a2.getIdade());

    }
}