public class TestCuentaBancaria{
	// campos

	// constructores

	// Metodos

	public static void main(String[] args){
		CuentaBancaria cuenta1,cuenta2;

	  	cuenta1 = new CuentaBancaria("Juan Perez","1045-7",'a');
		cuenta2 = new CuentaBancaria("Maria Lopez","1045-7",'m',100.0);

	  	// cuenta1.saldo = 150.25;
	  	// String numeroc = cuenta2.numeroCuenta; 

		System.out.println(cuenta1.numeroCuenta);
		System.out.println(cuenta2.numeroCuenta);
	  	System.out.println(cuenta1.equals(cuenta2));
	  	

	  
	}
}