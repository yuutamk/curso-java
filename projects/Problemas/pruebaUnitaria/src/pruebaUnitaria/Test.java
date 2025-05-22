package pruebaUnitaria;

import pruebaUnitaria.Calculadora;

public class Test {
	public void testSumar() {
        // Crear una instancia de la clase a probar
        Calculadora calculadora = new Calculadora();
        // Llamar al método a probar y obtener el resultado
        int resultado = calculadora.sumar(2, 3);
        // Verificar que el resultado esperado es igual al resultado obtenido
        assertEquals(5, resultado);
    }
}

}
