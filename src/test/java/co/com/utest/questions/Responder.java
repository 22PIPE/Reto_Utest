package co.com.utest.questions;

import co.com.utest.model.Utest_Datos;
import co.com.utest.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

import java.util.List;

public class Responder implements Question<Boolean> {

    private List<Utest_Datos> datos;

    public Responder(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static Responder aLos(List<Utest_Datos> datos) {
        return new Responder(datos);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String texto_boton_final = Text.of(PaginaFinal.BOTON_SETUP).viewedBy(actor).asString();
        return datos.get(0).getStrTextoFinal().equals(texto_boton_final);
    }
}
