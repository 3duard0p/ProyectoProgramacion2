package tallercuentabancaria;

public class CuentaBancaria {

	private static String nombreBanco = "Banco Central";
	private static double totalCuentasCreadas = 0;
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	
	public CuentaBancaria(int numeroCuenta, String titular, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		
		if (saldo<0) {
				System.out.println("Valor denegado");
	    }else {
			this.saldo = saldoInicial;
		}
	    if(titular == "") {
		    	System.out.println("Ingrese nombre del titular");
		    }else{
		    	this.titular = titular;
		    }
		totalCuentasCreadas = totalCuentasCreadas + 1;
	}
	
	public void mostrarInfo() {
		
	System.out.println("Banco: " + nombreBanco);
	System.out.println("Titular: " + titular);
	System.out.println("Numero de Cuenta: " + numeroCuenta);
	System.out.println("Cuenta #" + totalCuentasCreadas);
	System.out.println("Su saldo es: " + saldo);
	
		
		
		
	}
	
	public void depositar(double monto) {
	      if (monto <= 0) {
	    	  System.out.println("Monto incorrecto");
	      }
	      else {
	    	 saldo = saldo + monto;
	      }
	}
	
	public void retirar (double monto) {
		if (monto > saldo) {
			System.out.println("No se puedo realizar la operacion");
		} else if(monto<=0) {
			System.out.println("Monto incorrecto");
		}
		else {
			saldo = saldo - monto;
		}
		
	}


	public static String getNombreBanco() {
		return nombreBanco;
	}

	

	public static double getTotalCuentasCreadas() {
		return totalCuentasCreadas;
	}

	

	public int getNumeroCuenta() {
		return numeroCuenta;
	}
	
	public void setTitular(String titular) {
		if (titular == "") {
			System.out.println("Ingrese nombre del titular");
		}else {
			this.titular = titular;
		}
	}

	
	public String getTitular() {
		return titular;
	}
	
	public void setSaldo(double saldo) {
		if(saldo < 0 ) {
			System.out.println("Valor denegado");
		} else {
			this.saldo = saldo;
		}
		
	}
	    	
	
	public double getSaldo() {
		return saldo;
	}
		
	}


