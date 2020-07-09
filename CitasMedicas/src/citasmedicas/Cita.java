package citasmedicas;

public class Cita {
	protected DateTime _fecha;
	protected boolean _pagada;
	protected String _registradoPor;
	protected Doctor _citasPendientes;
	public Secretaria _maneja;
	protected Paciente _cita;

	public void realizarPago(Object aPago) {
		throw new UnsupportedOperationException();
	}
}