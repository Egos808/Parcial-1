public class Alumno {
    private static int contadorCarnet = 1;
    private int carnet;
    private String nombre;

    public Alumno(String nombre) {
        this.carnet = contadorCarnet++;
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("Carnet: " + carnet);
        System.out.println("Nombre: " + nombre);
    }
}
