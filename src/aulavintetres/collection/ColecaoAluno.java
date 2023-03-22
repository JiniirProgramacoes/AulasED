package aulavintetres.collection;

import aulavintetres.Aluno;

public class ColecaoAluno {
    
    private Aluno[] aluno = new Aluno[10];
    
    public void ArmazenarAluno(Aluno aluno){
        for(int i = 0; i < this.aluno.length; i++){
            if(this.aluno[i] == null){
                this.aluno[i] = aluno;
                break;
            }else if(this.aluno[i] == aluno){
                System.out.println("Já foi cadastrado!");
                break;
            }
        }
        
    }

    public Aluno[] getAluno() {
        return aluno;
    }

    public void setAluno(Aluno[] aluno) {
        this.aluno = aluno;
    }
    
}
