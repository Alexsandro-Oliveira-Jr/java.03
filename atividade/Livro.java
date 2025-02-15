package atividade;

public class Livro {
    
    private String titulo;
    private String autor;
    private String ISBN;
    private int numPG;
    private int valor;




    public Livro(String titulo, String autor, String iSBN, int numPG, int valor) {
    this.titulo = titulo;
    this.autor = autor;
    ISBN = iSBN;
    this.numPG = numPG;
    this.valor = valor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getISBN() {
        return ISBN;
    }
    public void setISBN(String iSBN) {
        ISBN = iSBN;
    }
    public int getNumPG() {
        return numPG;
    }
    public void setNumPG(int numPG) {
        this.numPG = numPG;
    }
    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    



}
