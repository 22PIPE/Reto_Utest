package co.com.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class PaginaFinal {

    public static final Target CONTRASENA = Target.the("Campo para contraseña del usuario")
            .located(By.id("password"));
    public static final Target CONFIRMAR_CONTRASENA = Target.the("Campo para confirmar contraseña del usuario")
            .located(By.id("confirmPassword"));
    public static final Target CHECKBOX_STAY_INFORMED = Target.the("Checkbox para recibir informacion")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_TERMS_OF_USE = Target.the("Checkbox para terminos de uso")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_PRIVACIDAD = Target.the("Checkbox para el manejo de la informacion")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_SETUP = Target.the("Boton para finalizar el registro")
            .located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/div/div/a"));
}
