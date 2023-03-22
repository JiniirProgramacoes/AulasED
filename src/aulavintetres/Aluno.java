package aulavintetres;

import java.util.Objects;

public class Aluno {
    
    private int id;
    private String nome;
    private String matricula;
    private String cpf;

    public String toString() {
        return "Nome do aluno: "+nome+" ";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aluno other = (Aluno) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) {
            return false;
        }
        return true;
    }
   

    public Aluno() {
    }

    public Aluno(int id, String nome, String matricula, String cpf) {
        super();
        this.id = id;
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
    }

    public Aluno(String nome, String matricula, String cpf) {
        super();
        this.nome = nome;
        this.matricula = matricula;
        this.cpf = cpf;
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

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
}
