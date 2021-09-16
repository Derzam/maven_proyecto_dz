package ejercicios.clases.wrapers;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Dato primitivo
		// byte

		byte datoByte = 2;
		Byte datoByteWrapper = 3;
		System.out.println("primitivo: " + datoByte);
		System.out.println("Wrapper: " + datoByteWrapper);
		// CONVERSIONES
		byte datoByte1 = 6;
		Byte datoConvertido = datoByte1;
		System.out.println("Byte convertido: " + datoConvertido);
		// conversiones2
		Byte datoConvertidoByte = 7;
		byte datoByte2 = datoConvertidoByte.byteValue();
		System.out.println("byte convertido: " + datoByte2);

		// short

		short datoShort = 1;
		Short datoShortWrapper = 1;
		System.out.println("primitivo: " + datoShort);
		System.out.println("Wrapper: " + datoShortWrapper);
		// Conversiones
		short datoShort1 = 5;
		Short datoConvertido2 = datoShort1;
		System.out.println("short convertido: " + datoConvertido2);
		// conversiones2
		Short shortConvertido = 23;
		short datoShort2 = shortConvertido.shortValue();
		System.out.println("short convertido: " + datoShort2);

		// int
		int datoInt = 34;
		Integer datoIntrWrapper = 37;
		System.out.println("primitivo: " + datoInt);
		System.out.println("Wrapper: " + datoIntrWrapper);
		// Conversiones
		Integer integerConvertido = 23;
		int edad2 = integerConvertido.intValue();
		System.out.println("int convertido: " + edad2);
		// Conversiones2
		int datoint1 = 8;
		Integer datoConvertido3 = datoint1;
		System.out.println("int convertido: " + datoConvertido3);
		// long

		long datoLong = 1236777;
		Long datoLongWrapper = 1353343L;
		System.out.println("primitivo: " + datoLong);
		System.out.println("Wrapper: " + datoLongWrapper);
		// CONVERSIONES
		long datoLong1 = 12314;
		Long datoConvertidoLong = datoLong1;
		System.out.println("Long convertido: " + datoConvertidoLong);
		// conversiones2
		Long datoConvertidoLong1 = 1213147l;
		long datoLong2 = datoConvertidoLong1.byteValue();
		System.out.println("Long convertido: " + datoLong2);

		// char

		char datoChar = 'A';
		Character datoCharWrapper = 'B';
		System.out.println("primitivo: " + datoChar);
		System.out.println("Wrapper: " + datoCharWrapper);
		char datoChar1 = 'F';
		Character datoConvertidoChar = datoChar1;
		System.out.println("Char convertido: " + datoConvertidoChar);
		// conversiones2
		Character datoConvertidoChar1 = 'H';
		char datoChar2 = datoConvertidoChar1.charValue();
		System.out.println("Char convertido: " + datoLong2);
		

		// float

		float datoFloat = 20;
		Float datoFloatWrapper = 32f;
		System.out.println("primitivo: " + datoFloat);
		System.out.println("Wrapper: " + datoFloatWrapper);
		float datoFloat1 = 1234;
		Float datoConvertidoFloat = datoFloat1;
		System.out.println("Float convertido: " + datoConvertidoFloat);
		// conversiones2
		Float datoConvertidoFloat1 = 123f;
		float datoFloat2 = datoConvertidoFloat1.floatValue();
		System.out.println("float convertido: " + datoFloat2);

		// double
		double datoDouble = 23;
		Double datoDoubleWrapper = 32d;
		System.out.println("primitivo: " + datoDouble);
		System.out.println("Wrapper: " + datoDoubleWrapper);
		double datoDouble1 = 123224;
		Double datoConvertidoDouble = datoDouble1;
		System.out.println("Double convertido: " + datoConvertidoDouble);
		// conversiones2
		Double datoConvertidoDouble1 = 12333d;
		double datoDouble2 = datoConvertidoDouble1.floatValue();
		System.out.println("double convertido: " + datoDouble2);

		// boolean
		boolean datoBoolean = true;
		Boolean datoBooleanWrapper = false;
		System.out.println("primitivo: " + datoBoolean);
		System.out.println("Wrapper: " + datoBooleanWrapper);
		boolean datoBoolean1 = true;
		Boolean datoConvertidoBoolean = datoBoolean1;
		System.out.println("boolean convertido: " + datoConvertidoDouble);
		// conversiones2
		Boolean datoConvertidoBoolean2 = true;
		boolean datoBoolean2 = datoConvertidoBoolean2.booleanValue();
		System.out.println("boolean convertido: " + datoBoolean2);
		

	}

}
