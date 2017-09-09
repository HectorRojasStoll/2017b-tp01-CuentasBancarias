
public class Cuenta {
	
	public int saldo;
	
	public Cuenta(){
		
		saldo = 0;
	}

	public int getSaldo() {
		// TODO Auto-generated method stub
		return saldo;
	}
	
	public void depositar(int monto) {
		if(monto >= 0)
			saldo += monto;
	}

	public void TransferirA(Cuenta cuentaDestino, int monto) {
		if(monto <= saldo)
			saldo -= monto;
		
		cuentaDestino.saldo += monto;
		
	}
}
