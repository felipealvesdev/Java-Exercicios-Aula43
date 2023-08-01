package javabasico.aula43.classeobject.exercicios.exerc01;

public class Teste {
    public static void main(String[] args){
        
        ContaBancaria contaBancaria01 = new ContaBancaria();

        ContaPoupanca contaPoupanca01 = new ContaPoupanca();

        // Preenchendo conta bancaria 01

        contaBancaria01.setNumConta("001");
        contaBancaria01.setNomeCliente("José Rico");
        contaBancaria01.setSaldo(10000);

        //contaBancaria01.sacar(500);


        // Preenchendo conta especial 01


        ContaEspecial contaEspecial01 = new ContaEspecial();
        contaEspecial01.setNumConta("002");
        contaEspecial01.setNomeCliente("Zé Milionário");
        contaEspecial01.setLimite(2000);


        contaEspecial01.setSaldo(1000);
        contaEspecial01.sacar(1200);
        System.out.println(contaEspecial01.getLimite());

        contaPoupanca01.setNomeCliente("Zé do rendimento");

/*
        contaPoupanca01.setSaldo(300);
        contaPoupanca01.setDiaRendimento(2);
        contaPoupanca01.calcularNovoSaldo();
        System.out.println("Sistema atualizado");
        System.out.println(contaPoupanca01.getSaldo());

*/
    }
}
