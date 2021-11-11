package aula11;

public class Professor extends Pessoa {
    private String especialidade;
    private float salario;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    public void receberAumento(float f){
        this.setSalario(this.getSalario() + f);
        System.out.println(this.getNome() + " recebeu um aumento\nNovo salário R$" + this.getSalario());
    } 
}