package instituto;

import oferta.OfertaAcademica;

import java.util.ArrayList;
import java.util.List;

public class Instituto {
    private List<OfertaAcademica> listaOfertas;

    // Constructor
    public Instituto() {
        this.listaOfertas = new ArrayList<>();
    }

    // Methods
    public void agregarOferta(OfertaAcademica oferta) {
        this.listaOfertas.add(oferta);
    }

    public void generarInforme() {
        System.out.println("\nOfertas del instituto");
        for (OfertaAcademica oferta : this.listaOfertas) {
            System.out.println(oferta.getNombre() + " - " + oferta.getPrecio());
        }
    }
}
