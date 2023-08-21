public class Curso {
    private String nombre;
    private int cupoMaximo;
    private int cupoActual = 0;

    public Curso(String nombre, int cupoMaximo) {
        this.nombre = nombre;
        this.cupoMaximo = cupoMaximo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public int getCupoActual() {
        return cupoActual;
    }

    public void incrementarCupo() {
        cupoActual++;
    }

    public boolean verificaEspacio() {
        return cupoActual < cupoMaximo;
    }
}
