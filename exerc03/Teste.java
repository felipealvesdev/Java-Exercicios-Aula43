package javabasico.aula43.classeobject.exercicios.exerc03;

public class Teste {
    public static void main(String[] args){

        // criando um zoo

        Animal camelo1 = new Animal();
        camelo1.setNome("Camelo");
        camelo1.setComprimento(1.50);
        camelo1.setCor("Amarelo");
        camelo1.setAmbiente("Terra");
        camelo1.setVelocidade(2);

        Peixe tubarao1 = new Peixe();

        tubarao1.setNome("Tubarão");
        tubarao1.setComprimento(3);
        tubarao1.setVelocidade(1.5);
        tubarao1.setCaracteristica("Barbatanas e cauda");

        Mamifero urso1 = new Mamifero();

        urso1.setNome("Urso-do-canadá");
        urso1.setComprimento(1.8);
        urso1.setCor("Vermelho");
        urso1.setVelocidade(0.5);
        urso1.setAlimento("Mel");
    }
}
