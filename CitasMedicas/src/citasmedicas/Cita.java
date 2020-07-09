package citasmedicas;

import java.util.Date;

public class Cita {
	protected Date _fecha;
	protected boolean _pagada;
	protected String _registradoPor;
	protected Doctor doctor;
	protected Secretaria secretaria;
	protected Paciente paciente;

	public void realizarPago(Object aPago) {
		throw new UnsupportedOperationException();
	}
}