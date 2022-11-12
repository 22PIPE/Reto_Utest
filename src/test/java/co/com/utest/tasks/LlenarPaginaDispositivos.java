package co.com.utest.tasks;

import co.com.utest.model.Utest_Datos;
import co.com.utest.userinterface.PaginaDispositivos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import org.openqa.selenium.Keys;

import java.util.List;

import static co.com.utest.userinterface.PaginaDispositivos.*;
import static org.openqa.selenium.Keys.*;

public class LlenarPaginaDispositivos implements Task {

    private List<Utest_Datos> datos;

    public LlenarPaginaDispositivos(List<Utest_Datos> datos) {
        this.datos = datos;
    }

    public static LlenarPaginaDispositivos laPagina(List<Utest_Datos> datos) {
        return Tasks.instrumented(LlenarPaginaDispositivos.class, datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CONTENEDOR_COMPUTADOR),
                Enter.theValue(datos.get(0).getStrComputador()).into(COMPUTADOR).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_VERSION),
                Enter.theValue(datos.get(0).getStrVersionComputador()).into(VERSION).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_LENGUAJE),
                Enter.theValue(datos.get(0).getStrLenguajeComputador()).into(LENGUAJE).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrDispositivoMovil()).into(DISPOSITIVO_MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_MODELO_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrModeloDispositivoMovil()).into(MODELO_DISPOSITIVO_MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(CONTENEDOR_SO_DISPOSITIVO_MOVIL),
                Enter.theValue(datos.get(0).getStrSODispositivoMovil()).into(SO_DISPOSITIVO_MOVIL).thenHit(ARROW_DOWN, ENTER),
                Click.on(BOTON_PASO_FINAL)
        );
        
    }
}
