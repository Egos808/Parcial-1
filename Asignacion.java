import java.util.ArrayList;

public class Asignacion {
    private ArrayList<Curso> cursosAsignados;

    public Asignacion() {
        cursosAsignados = new ArrayList<>();
    }

    public void addCurso(Curso curso) {
        cursosAsignados.add(curso);
    }
}
