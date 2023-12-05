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

        instituto.generarInforme();
    }
}
