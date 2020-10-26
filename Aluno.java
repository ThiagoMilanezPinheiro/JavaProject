package javaproject;

public class Aluno {
    public String nome;
    public float av1;
    public float av2;
    public float media;
    public float situacao;

   

    public String getNome() {
        return nome;
    }

    public float getAv1() {
        return av1;
    }

    public float getAv2() {
        return av2;
    }

    public float getMedia() {
       return media;
    }

    public float getSituacao() {
        return situacao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAv1(float av1) {
        this.av1 = av1;
    }

    public void setAv2(float av2) {
        this.av2 = av2;
    }

    public void setMedia(float media) {
        this.media = media;
    }

    public void setSituacao(float situacao) {
        this.situacao = situacao;
    }
    
    public void status() {
        System.out.println("Sobre o Aluno: ");
        System.out.println("Nome: " + this.nome);
        System.out.println("Primeira nota: " + this.av1);
        System.out.println("Segunda nota: " + this.av2);
    }
    
}
