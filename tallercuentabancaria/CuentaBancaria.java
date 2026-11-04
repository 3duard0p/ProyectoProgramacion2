package tallercuentabancaria;

public class CuentaBancaria {

	private static String nombreBanco;
	private static double totalCuentasCreadas;
	private int numeroCuenta;
	private String titular;
	private double saldo;
	
	
	public CuentaBancaria(int numeroCuenta, String titular, double saldoInicial) {
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldoInicial;
		this.titular = titular;
		
	}
	
	public void mostrarInfo() {
		
		
		
		
		
	}
	
	public void depositar(double monto) {
	      if (monto < 0) {
	    	  System.out.println("Monto incorrecto");
	      }
	      else {
	    	 saldo = saldo + monto;
	      }
	}
	
	public void retirar (double monto) {
		if (monto > saldo) {
			System.out.println("No se puedo realizar la operacion");
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

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		if (saldo<0) {
			System.out.println("Valor denegado");
		}
		this.saldo = saldo;
	}
	
	
		
	}


