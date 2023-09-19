package model;

public class Desenvolvedor extends Funcionario{
    public Desenvolvedor() {
    }

    public double getBonus() {
        double bonusDev = getSalario() + (getSalario() * 0.05);
        return bonusDev;
    }

    public Desenvolvedor(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public String toString() {
        return "\nDesenvolvedor{" +
                "nome='" + getNome() + '\'' +
                ", salario=" + getSalario() +
                '}';
    }
}
