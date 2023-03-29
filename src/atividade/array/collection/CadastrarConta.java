package atividade.array.collection;

import atividade.array.object.Conta;

public class CadastrarConta {
    
    private Conta[] conta = new Conta[100];
    
    public void adicionarConta(Conta conta){
        for(int i = 0; i < this.conta.length; i++){
            if (this.conta[i] == null){
                this.conta[i] = conta;
                break;
            }
        }
    }
    public void adicionarContaIndice(Conta conta, int indice){
        if (this.conta[indice] == null){
            this.conta[indice] = conta;
        }else{
            System.out.println("Já está ocupado.");
        }
    }
    
    public Conta[] listarConta(){
        return this.conta;
    }
    
    public Conta procurarConta(int i){
        return conta[i];
    }
    
    public Conta procurarContaNome(String nome){
        for(Conta c : this.conta){
            if(c.getNome().toLowerCase().equals(nome.toLowerCase())){
                return c;
            }
        }
        return null;
    }
    
}
