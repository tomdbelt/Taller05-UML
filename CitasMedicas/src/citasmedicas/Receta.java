package citasmedicas;

import java.util.Vector;
import citasmedicas.Medicamento;
import java.util.Date;

public class Receta {
	protected Date _fecha;
	public Doctor _registra;
	protected Paciente _recetas;
	protected Vector<Medicamento> medicamentos = new Vector<Medicamento>();
	protected PlanNutricional planNut;
}