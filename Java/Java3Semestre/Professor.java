public class Professor extends Pessoa {

    private int cargaHoraria;
    private double salario;

    public Professor(int cargaHoraria, double salario, int idade, String nome) {
        super(idade, nome);
        this.cargaHoraria = cargaHoraria;
        this.salario = salario;
    }

    

    public void recebeSalario(){
        System.out.println(getNome() + " recebe o salário de " + this.salario);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }


}    

