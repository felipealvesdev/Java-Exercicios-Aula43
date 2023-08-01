package javabasico.aula43.classeobject.exercicios.exerc01;

public class ContaPoupanca extends ContaBancaria{

    private double diaRendimento;


    public double getDiaRendimento(){
        return this.diaRendimento;
    }
    public void setDiaRendimento(double diaRendimento){
        this.diaRendimento = diaRendimento;
        System.out.println("Taxa de rendimento alterada para: " + this.diaRendimento);
    }

    public void calcularNovoSaldo(){
        super.setSaldo(super.getSaldo() * this.diaRendimento);
        System.out.println(super.getNomeCliente() + " seu novo saldo atualizado com o" +
                " rendimento atual da poupança de "+ this.diaRendimento + "x é de: R$"+ super.getSaldo());
    }
}
