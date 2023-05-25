public class Funcionario{
    private String cpf;
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    public String getCpf() {
        return cpf;
    }
    private String nome;
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }
    private double salario;
    public void setSalario(double salario) {
        this.salario = salario;
    }
    private double teto;
    public double getSalario() {
        return salario;
    }
    public Funcionario(String cpf, String nome, double salario){
        this.cpf=cpf;
        this.nome=nome;
        this.salario=salario;
        teto=40000;
    }
    public void aumentaSalario(double aumento){
        double aux=aumento/100;
        double newsalario=(salario*aux)+salario;
        if(newsalario<0){
            throw new IllegalStateException("Valor inválido de salário");
        }
        if(newsalario>teto){
            throw new IllegalStateException("Valor ultrapassa o teto");
        }else{
            salario=newsalario;
        }
    }
}
