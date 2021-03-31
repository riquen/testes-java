package teste;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class CalculadoraTest {

	@Test
	public void testSomar() {
		Calculadora calc = new Calculadora();
		int soma = calc.somar("1+2+3");
		assertEquals(6, soma);
	}
	
	@Test
	public void testSomarComMock() {
		Calculadora calc = mock(Calculadora.class);
		when(calc.somar("1+2")).thenReturn(10);
		
		int resultado = calc.somar("1+2");
		assertEquals(10, resultado);
	}
}
