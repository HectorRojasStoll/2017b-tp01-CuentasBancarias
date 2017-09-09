import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentasBancarias {

	@Test
	public void TestSaldoInicial() {
		Cuenta cuenta = new Cuenta();
		Assert.assertEquals(0, cuenta.getSaldo());
	}

	@Test
	public void TestDepositar(){
		Cuenta cuenta = new Cuenta();
		cuenta.depositar(10);
		Assert.assertEquals(10, cuenta.getSaldo());
	}
	
	@Test
	public void TestTransferirA(){
		Cuenta cuentaOrigen = new Cuenta();
		Cuenta cuentaDestino = new Cuenta();
		int monto = 5;
		cuentaOrigen.TransferirA(cuentaDestino, monto);
		Assert.assertEquals(5, cuentaDestino.getSaldo());
		
		
	}
}
