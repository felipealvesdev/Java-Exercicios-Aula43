package javabasico.aula43.classeobject.exercicios.exerc02;

public class Teste {
    public static void main(String[] args){

        PessoaJuridica juridico01 = new PessoaJuridica();

        juridico01.setNome("Ford");
        juridico01.setRendaBruta(70000);
        juridico01.calcularImpostoTotal();

        PessoaJuridica juridico02 = new PessoaJuridica();

        juridico01.setNome("Fiat");
        juridico01.setRendaBruta(12900);
        juridico01.calcularImpostoTotal();

        PessoaJuridica juridico03 = new PessoaJuridica();

        juridico01.setNome("VolksWagen");
        juridico01.setRendaBruta(1234123);
        juridico01.calcularImpostoTotal();

        PessoaFisica fisica01 = new PessoaFisica();

        fisica01.setNome("Mario");
        fisica01.setRendaBruta(1300);
        fisica01.calcularImpostoTotal();

        PessoaFisica fisica02 = new PessoaFisica();

        fisica01.setNome("Maria");
        fisica01.setRendaBruta(13500);
        fisica01.calcularImpostoTotal();

        PessoaFisica fisica03 = new PessoaFisica();

        fisica01.setNome("Pedro");
        fisica01.setRendaBruta(4500);
        fisica01.calcularImpostoTotal();
    }
}
