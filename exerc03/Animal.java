package javabasico.aula43.classeobject.exercicios.exerc03;

public class Animal {
    private String nome;
    private double comprimento;
    private int numPatas = 4;
    private String cor;
    private String ambiente;
    private double velocidade;

    public String getNome(){
        return this.nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public double getComprimento(){
        return this.comprimento;
    }
    public void setComprimento(double comprimento){
        this.comprimento = comprimento;
    }

    public int getNumPatas(){
        return this.numPatas;
    }
    public void setNumPatas(int numPatas){
        this.numPatas = numPatas;
    }

    public String getCor(){
        return this.cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getAmbiente(){
        return this.ambiente;
    }
    public void setAmbiente(String ambiente){
        this.ambiente = ambiente;
    }

    public double getVelocidade(){
        return this.velocidade;
    }
    public void setVelocidade(double velocidade){
        this.velocidade = velocidade;
    }
}
