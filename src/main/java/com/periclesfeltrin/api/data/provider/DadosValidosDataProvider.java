package com.periclesfeltrin.api.data.provider;

import org.testng.annotations.DataProvider;

public class DadosValidosDataProvider {

    @DataProvider(name = "numeros_validos")
    public static Object[][] numeros_validos() {
        String environment = System.getProperty("environment");

        switch (environment){
            case "en":
                return new Object[][] {
                        {"-9999", "minus nine thousand, nine hundred and ninety-nine"},
                        {"-9999.9", "minus nine thousand, nine hundred and ninety-nine"},
                        {"-10000", "minus ten thousand"},
                        {"-10000.0", "minus ten thousand"},
                        {"-9999", "nine thousand, nine hundred and ninety-nine"},
                        {"-9999.9", "nine thousand, nine hundred and ninety-nine"},
                        {"10000.0", "ten thousand"},
                        {"10000", "ten thousand"}
                };
            default:
                return new Object[][] {
                        {"-9999", "menos nove mil novecentos e noventa e nove"},
                        {"-9999.9", "menos nove mil novecentos e noventa e nove"},
                        {"-10000", "menos dez mil"},
                        {"-10000.0", "menos dez mil"},
                        {"9999", "nove mil novecentos e noventa e nove"},
                        {"9999.9", "nove mil novecentos e noventa e nove"},
                        {"10000", "dez mil"},
                        {"10000.0", "dez mil"}
                };
        }
    }

}
