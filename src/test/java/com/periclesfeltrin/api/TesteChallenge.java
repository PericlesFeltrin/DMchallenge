package com.periclesfeltrin.api;

import com.periclesfeltrin.api.data.provider.DadosInvalidosDataProvider;
import com.periclesfeltrin.api.data.provider.DadosValidosDataProvider;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.is;

public class TesteChallenge extends BaseTest {

    @Test(dataProvider = "numeros_validos", dataProviderClass = DadosValidosDataProvider.class, groups = "funcional", description = "Validar números de entrada válidos.")
    public void validarNumerosValidos(String numero, String extenso){
        given()
            .pathParam("numero", numero)
        .when()
            .get("{numero}")
        .then()
            .statusCode(200)
            .body("extenso",  is(extenso));
    }


    @Test(dataProvider = "numeros_invalidos", dataProviderClass = DadosInvalidosDataProvider.class, groups = "funcional", description = "Validar números de entrada inválidos")
    public void validarNumerosInvalidos(String numero){
        given()
            .pathParam("numero", numero)
        .when()
            .get("{numero}")
        .then()
            .statusCode(400)
            .body("extenso",  is("Invalid data"));
    }
}
