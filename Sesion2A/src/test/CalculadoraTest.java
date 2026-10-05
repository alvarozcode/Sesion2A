package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Sesion2A.Calculadora;

class CalculadoraTest {

    private Calculadora calc;

    @BeforeAll
    static void setUpBeforeClass() throws Exception {
        System.out.println("=== INICIANDO CONJUNTO DE PRUEBAS UNITARIAS ===");
    }

    @AfterAll
    static void tearDownAfterClass() throws Exception {
        System.out.println("=== TODAS LAS PRUEBAS FINALIZADAS CON ÉXITO ===");
    }

    @BeforeEach
    void setUp() {
        calc = new Calculadora();
        System.out.println("----------------------------------------------");
        System.out.println("[setUp] Instancia de Calculadora creada.");
    }

    @AfterEach
    void tearDown() {
        System.out.println("[tearDown] Prueba completada.");
    }

    @Test
    void testSuma() {
        int resultado = calc.suma(2, 3);
        System.out.println("Ejecutando testSuma: 2 + 3 = " + resultado);
        assertEquals(5, resultado);
    }

    @Test
    void testResta() {
        int resultado = calc.resta(10, 4);
        System.out.println("Ejecutando testResta: 10 - 4 = " + resultado);
        assertEquals(6, resultado);
    }

    @Test
    void testMultiplica() {
        int resultado = calc.multiplica(3, 4);
        System.out.println("Ejecutando testMultiplica: 3 * 4 = " + resultado);
        assertEquals(12, resultado);
    }

    @Test
    void testDivide() {
        int resultado = calc.divide(20, 5);
        System.out.println("Ejecutando testDivide: 20 / 5 = " + resultado);
        assertEquals(4, resultado);
    }

    @Test
    void testDividePorCero() {
        int resultado = calc.divide(10, 0);
        System.out.println("Ejecutando testDividePorCero: 10 / 0 = " + resultado + " (Esperado: -1)");
        assertEquals(-1, resultado);
    }
}