package com.periclesfeltrin.api;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import static io.restassured.RestAssured.when;

@Listeners({ExtentITestListenerClassAdapter.class})
public class HealthCheckTest extends BaseTest {

    @Test(groups = "healthcheck")
    public void HealthCheck(){
        when()
            .get("0")
        .then()
            .statusCode(200);
    }
}
