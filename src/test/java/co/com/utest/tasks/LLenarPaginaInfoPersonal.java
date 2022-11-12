package co.com.utest.tasks;

import co.com.utest.model.Utest_Datos;
import co.com.utest.userinterface.PaginaInfoPersonal;
import cucumber.api.java.bs.A;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import java.util.List;

import static co.com.utest.userinterface.PaginaInfoPersonal.*;

public class LLenarPaginaInfoPersonal implements Task {

    private List<Utest_Datos> datos;

    public LLenarPaginaInfoPersonal(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LLenarPaginaInfoPersonal laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LLenarPaginaInfoPersonal.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(datos.get(0).getStrNombre()).into(NOMBRE),
                Enter.theValue(datos.get(0).getStrApellido()).into(APELLIDO),
                Enter.theValue(datos.get(0).getStrEmail()).into(EMAIL),
                SelectFromOptions.byVisibleText(datos.get(0).getStrMesNacimiento()).from(MES_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrDiaNacimiento()).from(DIA_NACIMIENTO),
                SelectFromOptions.byVisibleText(datos.get(0).getStrAnoNacimiento()).from(AnO_NACIMIENTO),
                Click.on(BOTON_DIRECCION)

                );

    }
}
