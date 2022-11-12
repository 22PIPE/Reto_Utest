package co.com.utest.tasks;

import co.com.utest.model.Utest_Datos;
import co.com.utest.userinterface.PaginaFinal;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import java.util.List;

import static co.com.utest.userinterface.PaginaFinal.*;

public class LlenaPaginaFinal implements Task {

    private List<Utest_Datos> datos;

    public LlenaPaginaFinal(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LlenaPaginaFinal laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LlenaPaginaFinal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONTRASENA),
                Enter.theValue(datos.get(0).getStrContrasena()).into(CONFIRMAR_CONTRASENA),
                Click.on(CHECKBOX_STAY_INFORMED),
                Click.on(CHECKBOX_TERMS_OF_USE),
                Click.on(CHECKBOX_PRIVACIDAD),
                Click.on(BOTON_SETUP)
        );
        
    }
}
