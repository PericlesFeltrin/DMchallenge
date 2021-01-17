package com.periclesfeltrin.api.data.provider;

import org.testng.annotations.DataProvider;

public class DadosInvalidosDataProvider {

    @DataProvider(name = "numeros_invalidos")
    public static Object[][] numeros_invalidos() {
            return new Object[][] {
                    {"-1000.01"},
                    {"-10001"},
                    {"1000.01"},
                    {"10001"},
                    {"A"}
            };
    }
}
