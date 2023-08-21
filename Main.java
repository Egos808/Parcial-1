public class Main {
    public static void main(String[] args) {
        Catedratico catedratico1 = new Catedratico("Catedrático 1");
        Catedratico catedratico2 = new Catedratico("Catedrático 2");
        Catedratico catedratico3 = new Catedratico("Catedrático 3");

        Curso curso1 = new Curso("Curso 1", 2);
        Curso curso2 = new Curso("Curso 2", 5);
        Curso curso3 = new Curso("Curso 3", 5);

        Alumno alumno1 = new Alumno("Alumno 1");
        Alumno alumno2 = new Alumno("Alumno 2");
        Alumno alumno3 = new Alumno("Alumno 3");

        Asignacion asignacionAlumno1 = new Asignacion();
        Asignacion asignacionAlumno2 = new Asignacion();
        Asignacion asignacionAlumno3 = new Asignacion();

        asignacionAlumno1.addCurso(curso1);
        asignacionAlumno2.addCurso(curso2);
        asignacionAlumno3.addCurso(curso3);

        // Imprimir datos de catedráticos, cursos y alumnos

        // ... (Resto del código)
    }
}
