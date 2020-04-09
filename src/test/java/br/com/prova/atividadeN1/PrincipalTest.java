package br.com.prova.atividadeN1;

import static org.junit.Assert.assertNotEquals;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.junit.Test;
import br.com.prova.model.Principal;

public class PrincipalTest {
	SimpleDateFormat d = new SimpleDateFormat("HH:mm:ss.SSS");

	@Test
	public void testePrincipal() {
		assertNotEquals(d.format(new Date()), new Principal().getHorario(), 0.1);
	}

}