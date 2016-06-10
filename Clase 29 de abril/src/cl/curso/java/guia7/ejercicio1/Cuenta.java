package cl.curso.java.guia7.ejercicio1;

public class Cuenta {
	int saldo;

	public Cuenta(int saldo) {
		this.saldo = saldo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	
	public void abonarDinero (int abonar) {
		this.saldo = this.saldo + abonar;
	}
	
	public void retirarDinero (int retirar)
	{
		if (this.saldo < retirar)
		{
			System.out.println("Saldo insuficiente");
		}
		else
		{
			this.saldo = this.saldo - retirar;
			System.out.println("Se han retirado $"+ retirar);
		}
	}
	
	
	
	
}
