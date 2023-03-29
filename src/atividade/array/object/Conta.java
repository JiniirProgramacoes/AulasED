package atividade.array.object;

public class Conta {
    
    private int id;
    private String nome;
    private double valor;

    public Conta() {
    }

    public Conta(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
    }

    public Conta(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Conta no nome de: "+nome+" e no valor de: R$"+valor;
    }
    
    
    
}
