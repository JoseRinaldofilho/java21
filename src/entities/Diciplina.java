package entities;

import java.util.Objects;

public class Diciplina {

    private String diciplina;
    private double nota;

    public String getDiciplina() {
        return diciplina;
    }

    public void setDiciplina(String diciplina) {
        this.diciplina = diciplina;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
    ///git co
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Diciplina diciplina1 = (Diciplina) o;
        return Double.compare(diciplina1.nota, nota) == 0 && Objects.equals(diciplina, diciplina1.diciplina);
    }

    @Override
    public int hashCode() {
        return Objects.hash(diciplina, nota);
    }
    // to

    @Override
    public String toString() {
        return "Diciplina{" +
                "diciplina='" + diciplina + '\'' +
                ", nota=" + nota +
                '}';
    }
}
