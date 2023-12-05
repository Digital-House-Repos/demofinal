package oferta;

public class Taller extends OfertaAcademica {
    private int trabajosPracticos;
    private double costoTrabajoPractico;

    // Constructor
    public Taller(String nombre, String descripcion, int trabajosPracticos, double costoTrabajoPractico) {
        super(nombre, descripcion);
        this.trabajosPracticos = trabajosPracticos;
        this.costoTrabajoPractico = costoTrabajoPractico;

        this.calcularPrecio();
    }

    // Methods
    @Override
    public void calcularPrecio() {
        this.precio = this.trabajosPracticos * this.costoTrabajoPractico;
    }
}
