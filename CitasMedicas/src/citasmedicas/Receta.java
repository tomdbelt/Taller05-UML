package citasmedicas;

import java.util.Vector;
import citasmedicas.Medicamento;

public class Receta {
	protected DateTime _fecha;
	public Doctor _registra;
	protected Paciente _recetas;
	public Vector<Medicamento> _posee = new Vector<Medicamento>();
	public PlanNutricional _unnamed_PlanNutricional_;
}