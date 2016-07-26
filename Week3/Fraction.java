public class Fraction{
	
	// campos 
	int numerador, denominador ;

	// constructor
	public Fraction(int n, int d){
		this.numerador = n ;
		if( d != 0 )
			this.denominador = d ;
	}

	public Fraction(int n){
		this.numerador = n;
		this.denominador = 1;
	}

	public int getNum(){
		return this.numerador;
	}

	public int getDen(){
		return this.denominador;
	}

	public void setNum(int n){
		this.numerador = n ;
	}

	public void setDen(int d){
		if( d != 0 )
			this.denominador = d;
	}

	public Fraction add(Fraction f){
		int nuevoNumerador = this.numerador * f.denominador + this.denominador * f.numerador ;
		int nuevoDenominador = this.denominador * f.denominador ;
		Fraction suma = new Fraction(nuevoNumerador , nuevoDenominador);
		return suma ;
	}

	public Fraction multiply(Fraction f){
		int nuevoNumerador = this.numerador * f.numerador ;
		int nuevoDenominador = this.denominador * f.denominador ;
		Fraction mult = new Fraction(nuevoNumerador , nuevoDenominador);
		return mult;
	}

	public Fraction divide(Fraction f){
		int nuevoNumerador = this.numerador * f.denominador ;
		int nuevoDenominador = this.denominador * f.numerador ;
		Fraction divi = new Fraction(nuevoNumerador, nuevoDenominador);
		return divi;
	}

	public String toString(){
		return this.numerador + "/" + this.denominador ;
	}

	public boolean equals(Fraction f){
		boolean b = this.numerador == f.numerador && this.denominador == f.denominador;
		return b;
	}



}