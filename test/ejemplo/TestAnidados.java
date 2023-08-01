package ejemplo;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.*;

public class TestAnidados {


    @Nested
    class ArrayListEmpty {
        ArrayList<String> hola = new ArrayList<>(Arrays.asList());

        @Test
        public void vacio() {
            assertTrue(hola.isEmpty());
        }

        @Test
        public void Tamaño() {
            assertEquals(0, hola.size());
        }
    }



    @Nested
    class ArrayListNotEmpty{
        ArrayList<String> hola = new ArrayList<>(Arrays.asList("a", "b", "c"));

        @Test
        public void vacio(){
            assertFalse(hola.isEmpty());
        }

        @Test
        public void Tamaño(){
            assertEquals(3, hola.size());
        }
    }




}
