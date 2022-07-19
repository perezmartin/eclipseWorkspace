package es.rf.tienda.util;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;

class ValidatorTest {

	final String NOT_ALFANUMERIC = "@ # % {c";
	final String ALFANUMERIC = "ABC abc";
	final String CODIGO_PRODUCTO_OK = "AB123";
	final String CODIGO_PRODUCTO_NO1 = "A123B";
	final String CODIGO_PRODUCTO_NO2 = "Ab123";
	final String CODIGO_PRODUCTO_NO3 = "A0123";
	final String CODIGO_PRODUCTO_FORMATO_ERR_NUM = "12345";
	final String CODIGO_PRODUCTO_FORMATO_ERR_ALF = "ABCDE";
	final String CODIGO_PRODUCTO_FORMATO_ERR_LON = "AB345678";
	String STRING_NULA;
	final String STRING_VACIA = "";
	final String CORREO_ELECTRONICO_CORRECTO = "migarcia@recursosformacion.com";
	final String CORREO_ELECTRONICO_ERRONEO_1 = "migarcia.recursosformacion.com";
	final String CORREO_ELECTRONICO_ERRONEO_2 = "migarcia@recursosformacion";

	final String NUMERO_DNI_OK = "12.345.678-Z";
	final String NUMERO_DNI_ERROR_LETRA = "12.345.678-A";
	final String NUMERO_DNI_ERROR_FORM_CORTO = "12.2.678-A";
	final String NUMERO_DNI_ERROR_FORM_CORTO2 = "122.678-A";
	final String NUMERO_DNI_ERROR_FORM_LARGO = "123.456.678-A";
	final String NUMERO_DNI_ERROR_FORM_ERR = "12345678A";
	final String NUMERO_DNI_ERROR_FORM_ERR2 = "12.345.678.A";
	final String CADENA1 = "a";
	final String CADENA5 = "Ansde";
	final String CADENA20 = "asmdjfoeirksndvieqaz";
	final String CADENA30 = "qazxswedcvfrtgbnhyujm,kiol.-�p";
	final String CADENA50 = "poiuytrewqasdfghjkl�mnbvcxzZXCVBNM�LKJHGFDSAQWERTY";
	final String PHONENUMBER = "123456780";

	@Test
	void testIsAlfanumeric() {
		// assertTrue(Validator.isAlfanumeric(ALFANUMERIC));
		assertFalse(Validator.isAlfanumeric(NOT_ALFANUMERIC));
	}

	@Test
	void testIsVacio() {
		assertAll(() -> assertTrue(Validator.isVacio(STRING_NULA)), () -> assertTrue(Validator.isVacio(STRING_VACIA)));
	}

	@Test
	void testCumplePhoneNumber() {

	}

	@Test
	void testIsEmailValido() {

	}

	@Test
	void testCumpleDNI() {
		assertTrue(Validator.cumpleDNI(NUMERO_DNI_OK));
		assertFalse(Validator.cumpleDNI(NUMERO_DNI_ERROR_FORM_CORTO));
		assertFalse(Validator.cumpleDNI(NUMERO_DNI_ERROR_FORM_CORTO2));
		assertFalse(Validator.cumpleDNI(NUMERO_DNI_ERROR_FORM_ERR));
		assertFalse(Validator.cumpleDNI(NUMERO_DNI_ERROR_FORM_ERR2));
		assertFalse(Validator.cumpleDNI(NUMERO_DNI_ERROR_FORM_LARGO));
		assertFalse(Validator.cumpleDNI(NUMERO_DNI_ERROR_LETRA));

	}

	@Test
	void testCumpleRangoIntIntInt() {

	}

	@Test
	void testCumpleRangoDoubleIntInt() {

	}

	@Test
	void testCumpleLongitudMin() {

	}

	@Test
	void testCumpleLongitudMax() {

	}

	@Test
	void testCumpleLongitud() {

	}

	@Test
	void testValDateMin() {

	}

	@Test
	void testValDateMax() {

	}

	@Test
	void testEsFechaValida() {

	}

	@Test
	void testEsPasswordValida() {

	}

	@Test
	void testObject() {

	}

	@Test
	void testGetClass() {

	}

	@Test
	void testHashCode() {

	}

	@Test
	void testEquals() {

	}

	@Test
	void testClone() {

	}

	@Test
	void testToString() {

	}

	@Test
	void testNotify() {

	}

	@Test
	void testNotifyAll() {

	}

	@Test
	void testWait() {

	}

	@Test
	void testWaitLong() {

	}

	@Test
	void testWaitLongInt() {

	}

	@Test
	void testFinalize() {

	}

}
