package examen;
import static org.junit.Assert.*;

import org.junit.Test;

//a)
public class ExamenTest {
	@Test
	public void Dividir_sumarDosNumerosyLuegoDividirLaSuma_Entero() {
		int Expected =2;
		int Actual = Examen.Dividir(5,0,2);
		assertEquals(Expected,Actual);
	}
	@Test
	public void Multiplicar_NoTomarEnCuentaLetras_Entero() {
		int Expected =6;
		int Actual = Examen.Multiplicar(2a,3);
		assertEquals(Expected,Actual);
	}
	

}
