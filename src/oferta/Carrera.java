package oferta;

import java.util.ArrayList;
import java.util.List;

public class Carrera extends OfertaAcademica {
    private double costoBasico;
    private List<OfertaAcademica> listaCursoTaller;

    // Constructor
    public Carrera(String nombre, String descripcion, double costoBasico) {
        super(nombre, descripcion);
        this.costoBasico = costoBasico;
        this.listaCursoTaller = new ArrayList<>();
    }

    // Methods
    public void agregarCursoTaller(Curso cursoTaller) throws RuntimeException {
        if (cursoTaller.getCantidadCargaHoraria() < 10) {
            throw new RuntimeException("El curso debe tener una carga horaria mayor a 10");
        } else {
            this.listaCursoTaller.add(cursoTaller);
            this.calcularPrecio();
        }
    }
    public void agregarCursoTaller(Taller taller) {
        this.listaCursoTaller.add(taller);
        this.calcularPrecio();
    }


    public void listarCursoTaller() {
        System.out.println("\nCursos y talleres de la carrera " + this.nombre + ":");
        for (OfertaAcademica cursoTaller : this.listaCursoTaller) {
            System.out.println(cursoTaller.getNombre() + " - " + cursoTaller.getPrecio());
        }
    }

    @Override
    public void calcularPrecio() {
        double precioTotal = 0;
        for (OfertaAcademica cursoTaller : this.listaCursoTaller) {
            precioTotal += cursoTaller.getPrecio();
        }
        this.precio = precioTotal + this.costoBasico;
    }
}
