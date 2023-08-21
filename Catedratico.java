public class Catedratico {
    private static int contadorCatedratico = 1;
    private int numeroCatedratico;
    private String nombre;

    public Catedratico(String nombre) {
        this.numeroCatedratico = contadorCatedratico++;
        this.nombre = nombre;
    }

    public void imprimirDatos() {
        System.out.println("Número de catedrático: " + numeroCatedratico);
        System.out.println("Nombre: " + nombre);
    }
}
