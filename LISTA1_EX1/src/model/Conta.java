package model;

public class Conta {
    private Double saldo;
    private Integer id;


    public Double getSaldo() {
        return saldo;
    }

    public int getId() {
        return id;
    }

    public void depositar(double valor){
        this.saldo += valor;
    }

    public void  saca(double valor){
        this.saldo -= valor;
    }

    public  void atualiza(double taxa){
        this.saldo += this.saldo * (taxa/100);
    }

    public Conta() {
    }
    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public Conta(Double saldo, Integer id) {
        this.saldo = saldo;
        this.id = id;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "\nConta{" +
                "saldo=" + saldo +
                ", id=" + id +
                '}';
    }
}
