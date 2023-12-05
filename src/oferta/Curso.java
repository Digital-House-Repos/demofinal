package oferta;

public class Curso extends OfertaAcademica {
    private int cantidadCargaHoraria;
    private int cantidadMeses;
    private double valorHora;

    // Constructor
    public Curso(String nombre, String descripcion, int cantidadCargaHoraria, int cantidadMeses, double valorHora) {
        super(nombre, descripcion);
        this.cantidadCargaHoraria = cantidadCargaHoraria;
        this.cantidadMeses = cantidadMeses;
        this.valorHora = valorHora;

        this.calcularPrecio();
    }

    // Methods
    @Override
    public void calcularPrecio() {
        this.precio =  this.cantidadCargaHoraria * this.cantidadMeses * this.valorHora;
    }
}
