package citasmedicas;

import java.util.Date;

public class PagoTarjeta implements Pago {
	protected float _monto;
	protected String _numero;
	protected Date _expira;
	protected String _propietario;
	protected String _banco;

	public boolean realizarPago(float aMonto) {
		throw new UnsupportedOperationException();
	}
}