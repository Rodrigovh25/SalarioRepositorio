package salario;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SalarioTest {
	private Salario salario;
	
	/*Con esta traza damos acceso a las pruebas*/
	@BeforeAll
	static void mensajeInicial() {
		System.out.println("Comienzo de pruebas de salario");
	}
	
	/*Gracias al mensajeFinal podemos ver que las pruebas se han completado*/
	@AfterAll
	static void mensajeFinal() {
		System.out.println("Cierre de pruebas");
	}
	
	/*Damos valor a las variables antiguedad y plus*/
	@BeforeEach
	void previoTest() {
		int antiguedad = 4;
		int plus = 1000;
		System.out.println("Previo a las pruebas");
		salario = new Salario(antiguedad, plus);
	}
	
	/*Esto es lo que nos indica que ha acabado una prueba*/
	@AfterEach
	void acabamosTest() {
		System.out.println("Fin de la prueba");
	}
	
	/*Prueba cuando antiguedad > 3 y plus <= 1000*/
	@Test
	void test1() {
		int resultado, esperado;
		System.out.println("Prueba cuando antiguedad > 3 y plus <= 1000");
		resultado = salario.calcularSalarioFinal();
		esperado = 25000;
		assertEquals(resultado,esperado);
	}
	
	/*Prueba cuando antiguedad <= 3 y plus <= 1000*/
    @Test
    void test2() {
        int antiguedad = 3;
        int plus = 1000;
        salario = new Salario(antiguedad, plus);
        System.out.println("Prueba cuando antiguedad <= 3 y plus <= 1000");
        int resultado = salario.calcularSalarioFinal();
        int esperado = 22000;
        assertEquals(esperado, resultado);
    }

    /*Prueba cuando antiguedad <= 3 y plus > 1000*/
    @Test
    void test3() {
        int antiguedad = 3;
        int plus = 1500;
        salario = new Salario(antiguedad, plus);
        System.out.println("Prueba cuando antiguedad <= 3 y plus > 1000");
        int resultado = salario.calcularSalarioFinal();
        int esperado = 21500;
        assertEquals(esperado, resultado);
    }
    
    /*test añadido para github*/
    @Test
    void test4() {
        int antiguedad = 3;
        int plus = 1501;
        salario = new Salario(antiguedad, plus);
        System.out.println("Prueba cuando antiguedad <= 3 y plus > 1000");
        int resultado = salario.calcularSalarioFinal();
        int esperado = 21501;
        assertEquals(esperado, resultado);
    }
	

}
