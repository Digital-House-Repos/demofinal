package oferta;

import java.util.ArrayList;
import java.util.List;

public class Programa extends OfertaAcademica {
    private List<OfertaAcademica> listaCursos;
    private double descuento;

    // Constructor
    public Programa(String nombre, String descripcion, double descuento) {
        super(nombre, descripcion);
        this.listaCursos = new ArrayList<>();
        this.descuento = descuento;
    }

    // Method
    public void agregarCurso(Curso curso) {
        this.listaCursos.add(curso);
        this.calcularPrecio();
    }

    public void listarCursos() {
        System.out.println("Cursos del programa " + this.getNombre());
        for (OfertaAcademica curso : listaCursos) {
            System.out.println(curso.getNombre());
        }
    }

    @Override
    public void calcularPrecio() {
        double precioTotal = 0;
        for (OfertaAcademica curso : listaCursos) {
            precioTotal += curso.getPrecio();
        }
        this.precio = precioTotal * (1 - this.descuento);
    }
}
