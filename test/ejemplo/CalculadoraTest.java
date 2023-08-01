package ejemplo;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {
    static Calculadora actual;

    @BeforeAll
    public static void beforetodo(){//realiza este codigo antes de todas las pruebas
        actual = new Calculadora();
    }

    @BeforeEach //realiza este codigo antes de cada prueba
    public void before(){
        actual.clear();
    }

    @Test
    public void testSuma(){
        actual.suma(2, 3);
        int expected = 5;
        assertEquals(expected, actual.ans());
    }

    @Test
    public void testDiv(){
        actual.dividir(5, 5);
        assertEquals(1, actual.ans());
    }

    @Test
    public void testDivPorCero(){
        assertThrows(ArithmeticException.class, () -> { //esto sirve para determinar un error
                actual.dividir(5, 0);
        });
    }

    @Test
    public void testResta(){
        actual.resta(2, 3);
        int expected = -1;
        assertEquals(expected, actual.ans());
        //assertEquals(); verifica que 2 variables son iguales
        //assertArrayEquals(); verifica que 2 arrays son iguales
        //assertNotEquals(); verifica que 2 variables no son iguales
        //assertNotNull(); verifica que una variable no sea null
    }

    //@AfterAll //despues de realizar todos los tests
    @AfterEach //despues de realizar un test
    public void after(){
    }
}