package citasmedicas;

public class Paciente extends Persona {
	protected String _email;
	protected Cita _paciente;
	public HistoriaClinica _posee;

	public boolean solicitarCita() {
		throw new UnsupportedOperationException();
	}
}