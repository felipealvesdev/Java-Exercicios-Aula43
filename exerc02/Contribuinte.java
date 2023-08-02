package javabasico.aula43.classeobject.exercicios.exerc02;

public abstract class Contribuinte {
    private String nome;
    private double rendaBruta;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getRendaBruta(){
        return this.rendaBruta;
    }
    public void setRendaBruta(double rendaBruta){
        this.rendaBruta = rendaBruta;
    }
}
