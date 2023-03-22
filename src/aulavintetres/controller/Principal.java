package aulavintetres.controller;

import aulavintetres.Aluno;
import aulavintetres.collection.ColecaoAluno;
import java.util.Arrays;
import java.util.Scanner;

public class Principal {
    
    public static void main(String[] args) {
        ColecaoAluno colAluno = new ColecaoAluno();
        Scanner scan = new Scanner(System.in);
        
        for(int i = 0; i < 3; i++){
            Aluno alunoNovo = new Aluno();
            System.out.println("Escreva o nome:");
            alunoNovo.setNome(scan.nextLine());
            System.out.println("Escreva a matricula:");
            alunoNovo.setMatricula(scan.nextLine());
            System.out.println("Escreva o cpf:");
            alunoNovo.setCpf(scan.nextLine());
            colAluno.ArmazenarAluno(alunoNovo);
        }  
        
        System.out.println(Arrays.toString(colAluno.getAluno()));
    }
    
}
