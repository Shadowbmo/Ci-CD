package sptech.school.ci_cd.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import sptech.school.ci_cd.Service.CalculadoraService;

public class CalculadoraServiceTest {

    @Test
    @DisplayName("Quando acionado com 10 e 2, então deve retornar 5")
    public void testDividir() {

        //Arrange
        CalculadoraService calculadoraService = new CalculadoraService();
        double a = 10;
        double b = 2;
        double esperado = 5;


        // Act
        double resultado = calculadoraService.dividir(a, b);

        //Assert
        assertEquals(esperado, resultado);
    }

}
