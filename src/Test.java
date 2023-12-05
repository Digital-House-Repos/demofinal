import instituto.Instituto;
import oferta.*;

public class Test {
    public static void main(String[] args) {
        Instituto instituto = new Instituto();

        Curso curso1 = new Curso("FrontEnd", "HTML + CSS + JS", 16, 2, 1000);
        Curso curso2 = new Curso("BackEnd", "Java + Spring", 20, 2, 900);

        Programa programa1 = new Programa("FullStack", "Back + Front", 0.2);
        programa1.agregarCurso(curso1);
        programa1.agregarCurso(curso2);

        instituto.agregarOferta(curso1);
        instituto.agregarOferta(curso2);
        instituto.agregarOferta(programa1);

//        instituto.generarInforme();

        // creando talleres y carreras
        Curso curso3 = new Curso("Docker", "Aprende Docker", 5, 2, 500);
        Taller taller1 = new Taller("Git", "Aprende Git", 5, 200);

        Carrera carrera1 = new Carrera("Certified Developer", "Aprende Front + Back + Docker", 10000);
        carrera1.agregarCursoTaller(curso1);
        carrera1.agregarCursoTaller(curso2);
        try {
            carrera1.agregarCursoTaller(curso3);
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        carrera1.agregarCursoTaller(taller1);

        instituto.agregarOferta(curso3);
        instituto.agregarOferta(taller1);
        instituto.agregarOferta(carrera1);
        carrera1.listarCursoTaller();

        instituto.generarInforme();
    }
}
