package entities;

import entities.Diciplina;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
    private String nome;

    List<Diciplina> diciplinas = new ArrayList<Diciplina>();
    // methods

    public Aluno(){

    }
    public double mediaAluno(){
        double somaNota = 0.0;
        for (Diciplina diciplina: getDiciplinas()) {
            somaNota += diciplina.getNota();
        }
        return somaNota / 4;
    }
    public String resultadoAluno(){
        if (mediaAluno() >= 6){
            return "Aprovado";

        }else if (mediaAluno()>5){
            return "Fazer Reculperação ";
        }else {
            return "Reprovado";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Diciplina> getDiciplinas() {
        return diciplinas;
    }

    public void setDiciplinas(List<Diciplina> diciplinas) {
        this.diciplinas = diciplinas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(nome, aluno.nome) && Objects.equals(diciplinas, aluno.diciplinas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, diciplinas);
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", diciplinas=" + diciplinas +
                '}';
    }
}
