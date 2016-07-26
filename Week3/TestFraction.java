public class TestFraction{
	
	public static void main(String[] args){

		Fraction f1 = new Fraction(5,2); 	//5/2
		Fraction f2 = new Fraction(6);		// 6/1
		Fraction f3 = new Fraction(9,8);	// 9/8

		f3.setNum(11);
		f2.setDen(5);

		System.out.println(f1);
		System.out.println(f2);
		System.out.println(f3);

		Fraction resultadoSuma = f1.add(f2);
		System.out.println(resultadoSuma);

		Fraction resultadoMultiplicacion = f2.multiply(f3);
		System.out.println(resultadoMultiplicacion);

		Fraction resultadoDividir = f1.divide(f3);
		System.out.println(resultadoDividir);		

		boolean compararF1yF3 = f1.equals(f3);
		System.out.println(compararF1yF3);


	}

}