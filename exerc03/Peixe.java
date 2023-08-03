package javabasico.aula43.classeobject.exercicios.exerc03;

public class Peixe extends Animal{

    private int numPatas = 0;
    private String ambiente = "Mar";
    private String cor = "Cinza";
    private String caracteristica;

    public String getCaracteristica(){
        return this.caracteristica;
    }
    public void setCaracteristica(String caracteristica){
        this.caracteristica = caracteristica;
    }

}
