package oferta;

public abstract class OfertaAcademica {
    protected String nombre;
    protected String descripcion;
    protected double precio;

    // Constructor
    public OfertaAcademica(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = 0;
    }

    // Getters
    public double getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    // Methods
    public abstract void calcularPrecio();
}
