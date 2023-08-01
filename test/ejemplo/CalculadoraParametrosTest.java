package ejemplo;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.*;


public class CalculadoraParametrosTest {

    static Calculadora calc;

    @BeforeAll
    public static void Beforetodo(){
        calc = new Calculadora();
    }

    @BeforeEach
    public void Before(){
        calc.clear();
    }

    @ParameterizedTest
    @CsvSource({"3, 2, 5", "10, 20, 30", "2, -5, -3"})
    public void TestSumParametrized(int a, int b, int exp){
        assertEquals(calc.suma(a, b), exp);
    }

}
