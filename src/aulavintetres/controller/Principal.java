package aulavintetres.controller;

import aulavintetres.Aluno;
import aulavintetres.collection.ColecaoAluno;
import java.util.Arrays;

public class Principal {
    
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno(1,"Miguel","202310070000","111.111.111-22");
        Aluno aluno2 = new Aluno();
        ColecaoAluno colAluno = new ColecaoAluno();
        
        aluno2.setId(2);
        aluno2.setNome("Afonso");
        aluno2.setMatricula("202310070001");
        aluno2.setCpf("222.222.222-11");
        
        colAluno.ArmazenarAluno(aluno1);
        colAluno.ArmazenarAluno(aluno2);
        colAluno.ArmazenarAluno(aluno2);
        
        
        System.out.println(Arrays.toString(colAluno.getAluno()));
    }
    
}
