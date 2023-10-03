package Aerolinea;

import java.io.Serializable;// clase para serializar
import java.util.ArrayList;

public class Avion implements Serializable { // se crea la clase e implementa serializacion

	private static final long serialVersionUID; // atributo con el codigo de serializacion

	private Asiento asientos; // se crean los atributos requeridos para la clase
	private final String AEROLINEA;
	private final String ID;
	private String horarioSalida;
	private String horarioLlegada;
	private final String DESTINO;
	private final String ORIGEN;
	private ArrayList<Maleta> equipajes = new ArrayList<>();

	public Avion(String aerolinea, String id, String tiempoSalida, String tiempoLlegada, String Destino,
			String origen) {
		this.AEROLINEA = aerolinea;
		this.ID = id;
		this.horarioSalida = tiempoSalida;
		this.horarioLlegada = tiempoLlegada;
		this.DESTINO = Destino;
		this.ORIGEN = origen;
	}

	private static void generarVuelos(int cantidad) {
		/*
		 * vuels = array
		 * Imprime y muestra los vuelos
		 * 
		 * - Vuelos debe tener un metodo q sea para imprimir el vuelo
		 * 
		 */
		ArrayList<Avion> vuelos = new ArrayList<>();

		for (int i = 0; i < cantidad; i++) {
			// Generar vuelos y meterlos al array, devueve al array y puede mostrarse

		}

	}

	// ........

	public Asiento getAsientos() {
		return this.asientos;
	}

	public void setAsientos(Asiento asientos) {
		this.asientos = asientos;
	}

	public String getAEROLINEA() {
		return this.AEROLINEA;
	}

	public String getID() {
		return this.ID;
	}

	public String getHorarioSalida() {
		return this.horarioSalida;
	}

	public void setHorarioSalida(String horarioSalida) {
		this.horarioSalida = horarioSalida;
	}

	public String getHorarioLlegada() {
		return this.horarioLlegada;
	}

	public void setHorarioLlegada(String horarioLlegada) {
		this.horarioLlegada = horarioLlegada;
	}

	public String getDESTINO() {
		return this.DESTINO;
	}

	public String getORIGEN() {
		return this.ORIGEN;
	}

	public ArrayList<Maleta> getEquipajes() {
		return this.equipajes;
	}

	public void setEquipajes(ArrayList<Maleta> equipajes) {
		this.equipajes = equipajes;
	}

}
