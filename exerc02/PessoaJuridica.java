package javabasico.aula43.classeobject.exercicios.exerc02;

public class PessoaJuridica extends Contribuinte{
    private double impostoTotal;


    public double getImpostoTotal(){
        return this.impostoTotal;
    }

    public void calcularImpostoTotal(){
        this.impostoTotal = super.getRendaBruta() * 0.1;
        System.out.println("O imposto total pago pela empresa " + super.getNome() +
                " no imposto de renda é: R$" + this.impostoTotal);
    }

}
