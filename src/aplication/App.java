package aplication;

import entities.Aluno;
import entities.Diciplina;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<Aluno>();
        for (int qtd = 1; qtd <=2 ; qtd++) {
            String nome = JOptionPane.showInputDialog("qual o nome do aluno "+qtd+" ?");

            // estancia
            Aluno aluno1 = new Aluno();
            aluno1.setNome(nome);
            // diciplina
            for (int pos = 1; pos <= 4; pos++) {
                String nomeD = JOptionPane.showInputDialog("Nome da Diciplina: " + pos);
                String notaD = JOptionPane.showInputDialog("Nota da Diciplina: " + pos);
                Diciplina diciplina = new Diciplina();
                diciplina.setDiciplina(nomeD);
                diciplina.setNota(Double.valueOf(notaD));

                aluno1.getDiciplinas().add(diciplina);
            }
            //remover diciplina
            int rcoleta = JOptionPane.showConfirmDialog(null, "Deseja remover diciplina ? ");

            if (rcoleta == 0) {

                int continuaRemover = 0;
                int posicao = 1;// para lista nao fica vazia e sobrepor

                while (continuaRemover == 0) {
                    String diciplinaRemover = JOptionPane.showInputDialog("qual diciplina 1, 2, 3 ou 4");
                    aluno1.getDiciplinas().remove(Integer.valueOf(diciplinaRemover) - posicao);
                    posicao++;
                    continuaRemover = JOptionPane.showConfirmDialog(null, "continua a remover ?");
                }
            }
            alunos.add(aluno1);
        }//fim do for
        for (Aluno aluno: alunos) {


            if (aluno.getNome().equalsIgnoreCase("Jose")){
                System.out.println(aluno.toString());
                System.out.println("Media: " + aluno.mediaAluno());
                System.out.println("Resultado: " + aluno.resultadoAluno());
                System.out.println("*********************************************************************");
                break;
            }
        }
    }


}
