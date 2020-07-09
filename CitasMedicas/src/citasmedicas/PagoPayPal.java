package citasmedicas;

public class PagoPayPal implements Pago {
	protected float _monto;
	protected String _email;

	public boolean realizarPago(float aMonto) {
		throw new UnsupportedOperationException();
	}
}