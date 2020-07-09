package citasmedicas;

import java.util.Date;

public class Persona {
	protected String _usuario;
	protected String _clave;
	protected String _nombre;
	protected String _apellido;
	protected String _cedula;
	protected String _dirección;
	protected Date _fechaNac;
	protected Administrador registradoPor;

	public boolean logIn() {
		throw new UnsupportedOperationException();
	}

	public boolean logOut() {
		throw new UnsupportedOperationException();
	}
}