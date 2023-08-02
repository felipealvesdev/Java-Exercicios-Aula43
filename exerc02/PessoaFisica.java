package javabasico.aula43.classeobject.exercicios.exerc02;

public class PessoaFisica extends Contribuinte{
    private double impostoTotal;

    public double getImpostoTotal(){
        return this.impostoTotal;
    }
    public void calcularImpostoTotal(){
        if(super.getRendaBruta()<=1400){
            this.impostoTotal = (super.getRendaBruta()*0) - 0;
        }else if(super.getRendaBruta()>1400 && super.getRendaBruta()<=2100){
            this.impostoTotal = (super.getRendaBruta()*0.1) - 100;
        }else if(super.getRendaBruta()>2100 && super.getRendaBruta()<=2800){
            this.impostoTotal = (super.getRendaBruta()*0.15) - 270;
        }else if(super.getRendaBruta()>2800 && super.getRendaBruta()<=3600){
            this.impostoTotal = (super.getRendaBruta()*0.25) - 500;
        }else{
            this.impostoTotal = (super.getRendaBruta()*0.3) - 700;
        }
        System.out.println("O imposto total pago pela pessoa física " + super.getNome() +
                " no imposto de renda é: R$" + this.impostoTotal);
    }

}
