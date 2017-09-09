import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class TestCuentasBancarias {

	@Test
	public void TestSaldoInicial() {
		Cuenta cuenta = new Cuenta();
		Assert.assertEquals(0, cuenta.getSaldo());
	}

}
