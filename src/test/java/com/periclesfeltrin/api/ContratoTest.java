package com.periclesfeltrin.api;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;
import java.io.File;
import static io.restassured.module.jsv.JsonSchemaValidator.*;

public class ContratoTest extends BaseTest {

    @Test(groups = "contrato")
    public void validarContrato(){
        when()
            .get("1")
        .then()
            .statusCode(200)
        .body(matchesJsonSchema(new File("src/test/resources/json_schemas/contrato.json")));
    }
}
