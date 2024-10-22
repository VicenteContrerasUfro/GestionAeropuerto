package GestionAeropuerto;

import java.util.Vector;
import GestionAeropuerto.Vuelo;
import GestionAeropuerto.Piloto;
import GestionAeropuerto.Pasajero;

public class Avion {
	private String _matricula;
	private int _capacidad;
	public Aeropuerto _unnamed_Aeropuerto_;
	public Vector<Vuelo> _unnamed_Vuelo_ = new Vector<Vuelo>();
	public Vector<Piloto> _unnamed_Piloto_ = new Vector<Piloto>();
	public Vector<Pasajero> _unnamed_Pasajero_ = new Vector<Pasajero>();

	public Avion(String a123, String s, int i) {
	}

	public String getMatricula() {
		return this._matricula;
	}

	public void setMatricula(String aMatricula) {
		this._matricula = aMatricula;
	}

	public int getCapacidad() {
		return this._capacidad;
	}

	public void setCapacidad(int aCapacidad) {
		this._capacidad = aCapacidad;
	}
}