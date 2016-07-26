public class CuentaBancaria{
	
	// Campos
	String nombre ;
	String numeroCuenta;
	double saldo ;
	char tipo ;

	// Constructores
	public CuentaBancaria(String n, String nc, char t , double s){
		this.nombre = n;
		this.numeroCuenta = nc;
		this.saldo = s;
		this.tipo = t;
	}

	public CuentaBancaria( String nombre, String nc , char tipo ){
		this( nombre , nc , tipo , 0.00 );
	}	



	// Metodos

	/*
retirar(monto): hace un retiro del monto indicado
disponible(monto): verifica si el monto está disponible
toString: devuelve el objeto en forma de String
	*/

	public String getNombre(){
		return this.nombre;
	}

	public String getNumeroCuenta(){
		return this.numeroCuenta;
	}

	public double getSaldo(){
		return this.saldo;
	}

	public char getTipo(){
		return this.tipo;
	}

	public void depositar(double monto){
		if( monto > 0 ){
			this.saldo = this.saldo + monto;	
		}
	}

	public boolean disponible( double monto ){
		return this.saldo >= monto ;
	}

	public void retirar(double monto){
		if( this.disponible(monto) ){
			this.saldo = this.saldo - monto ;
		}
	}


	public String toString(){
		String retornar = nombre + " , " + numeroCuenta + " : " + saldo;
		return retornar;
	}


	public boolean equals(CuentaBancaria c2){
		return c2.numeroCuenta.equals( this.numeroCuenta );
	}






}