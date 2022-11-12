package co.com.utest.userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;


@DefaultUrl("https://www.utest.com")
public class PaginaUtest extends PageObject {

    public static final Target BOTON_JOIN = Target.the("Boton para iniciar registro de usuario")
            .located(By.xpath("//a[@class ='unauthenticated-nav-bar__sign-up']"));
}
