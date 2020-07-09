package citasmedicas;

public class Paciente extends Persona {
	protected String _email;
	protected Cita _paciente;
	protected HistoriaClinica historiaClinica;

	public boolean solicitarCita() {
		throw new UnsupportedOperationException();
	}
}