package citasmedicas;

import java.util.Vector;
import citasmedicas.Persona;

public class Administrador extends Persona {
	public Vector<Persona> _registradoPor = new Vector<Persona>();

	public void registraUsuario() {
		throw new UnsupportedOperationException();
	}

	public void asignarRol(Object aPersona) {
		throw new UnsupportedOperationException();
	}
}