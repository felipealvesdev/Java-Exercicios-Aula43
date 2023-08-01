package javabasico.aula43.classeobject.exercicios.exerc01;

public class ContaBancaria {
    private String nomeCliente;
    private String numConta;
    private double saldo;

    public String getNomeCliente(){
        return this.nomeCliente;
    }
    public void setNomeCliente(String nome){
        this.nomeCliente = nome;
    }

    public String getNumConta(){
        return this.numConta;
    }
    public void setNumConta(String numConta){
        this.numConta = numConta;
    }

    public double getSaldo(){
        return this.saldo;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void sacar(double valor){
        if(valor>this.saldo){
            System.out.println("Senhor(a) "+ this.nomeCliente +" seu saldo é insuficiente. Por favor, deposite na sua conta");
            return;
        }
        this.saldo -= valor;
        System.out.println("Senhor(a) "+ this.nomeCliente +" você sacou " + valor + " da sua conta.");
        System.out.println("Seu saldo é: R$" + this.getSaldo()+".");
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
}
