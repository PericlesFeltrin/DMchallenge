package com.periclesfeltrin.api;

import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import com.periclesfeltrin.api.config.Configuration;
import org.aeonbits.owner.ConfigFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;

import static io.restassured.RestAssured.*;

@Listeners({ExtentITestListenerClassAdapter.class})
public abstract class BaseTest {

    private static final String ENVIRONMENT = "environment";

    private static  Configuration environment(){
        String environment = System.getProperty(ENVIRONMENT);
        String atualEnv = environment == null ? "pt" : environment;

        System.setProperty(ENVIRONMENT, atualEnv);
        ConfigFactory.setProperty(ENVIRONMENT, atualEnv);

        return ConfigFactory.create(Configuration.class);
    }

    @BeforeClass(alwaysRun = true)
    public static void preCodicao(){
        Configuration cfg = environment();

        baseURI = cfg.baseURI();
        basePath = cfg.basePath();
        enableLoggingOfRequestAndResponseIfValidationFails();
    }
}
