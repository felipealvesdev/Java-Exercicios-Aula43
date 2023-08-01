package javabasico.aula43.classeobject.exercicios.exerc01;

public class ContaEspecial extends ContaBancaria{
    private double limite;

    public ContaEspecial(){}

    public double getLimite(){
        return this.limite;
    }
    public void setLimite(double limite){
        this.limite = limite;
    }
    @Override
    public void sacar(double valor){
        if(super.getSaldo()> 0 && valor<=super.getSaldo()){
            super.setSaldo(super.getSaldo() - valor);
            System.out.println("Senhor(a) "+ super.getNomeCliente()+ " você sacou R$" + valor + " da sua conta.");
            System.out.println("Seu saldo é: R$" + super.getSaldo()+".");
        }else if(super.getSaldo()>=0 && valor<=this.limite){
            double result;
            result = valor - super.getSaldo();
            super.setSaldo(0);
            this.limite -= result;
            System.out.println("Senhor(a) "+ super.getNomeCliente() + " você sacou R$" + valor);
            System.out.println("Seu saldo é: R$" + super.getSaldo()+".");
            System.out.println("Seu saldo no LIMITE ESPECIAL é: R$" + this.limite+".");
        }else if(super.getSaldo()==0 && valor<=this.limite){
            this.limite -= valor;
            System.out.println("Senhor(a) "+ super.getNomeCliente()+ " você sacou R$" + valor +
                    " do limite especial da sua conta.");
            System.out.println("Seu saldo é: R$" + super.getSaldo()+".");
            System.out.println("Seu saldo no LIMITE ESPECIAL é: R$" + this.limite+".");
        }else{
            System.out.println("Valor indisponível de R$" +this.limite + "."+
                    "Por favor, entre em contato com seu banco.");
            System.out.println("Seu saldo no limite especial é de: R$" + this.limite + ".");
        }

    }
}
