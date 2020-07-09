package citasmedicas;

import java.util.Vector;
import citasmedicas.Cita;

public class Doctor extends Persona {
	protected int _regDoctor;
	protected String _especialidad;
	protected Vector<Cita> _doctor = new Vector<Cita>();
	public AreaMedica _doctores;

	public void recetar() {
		throw new UnsupportedOperationException();
	}

	public void agregarPlanNut() {
		throw new UnsupportedOperationException();
	}

	public void imprimirReceta() {
		throw new UnsupportedOperationException();
	}

	public void registraSecretaria() {
		throw new UnsupportedOperationException();
	}
}