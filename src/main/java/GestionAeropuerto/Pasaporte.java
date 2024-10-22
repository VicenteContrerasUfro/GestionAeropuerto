package GestionAeropuerto;

import java.time.LocalDate;

public class Pasaporte {
	private String _id;
	private String _nacionalidad;
	private int _hojasDisponibles;
	private LocalDate _fechaExpiracion;
	public Pasajero _unnamed_Pasajero_;

	public Pasaporte(String id, String nacionalidad, int hojasDisponibles, LocalDate fechaExpiracion) {
		this._id = id;
		this._nacionalidad = nacionalidad;
		this._hojasDisponibles = hojasDisponibles;
		this._fechaExpiracion = fechaExpiracion;
	}

	public Pasaporte(String ab123456, LocalDate of, int hojasDisponibles) {
	}

	public String getId() {
		return this._id;
	}

	public void setId(String aId) {
		this._id = aId;
	}

	public String getNacionalidad() {
		return this._nacionalidad;
	}

	public void setNacionalidad(String aNacionalidad) {
		this._nacionalidad = aNacionalidad;
	}

	public int getHojasDisponibles() {
		return this._hojasDisponibles;
	}

	public void setHojasDisponibles(int aHojasDisponibles) {
		this._hojasDisponibles = aHojasDisponibles;
	}

	public LocalDate getFechaExpiracion() {
		return this._fechaExpiracion;
	}

	public void setFechaExpiracion(LocalDate aFechaExpiracion) {
		this._fechaExpiracion = aFechaExpiracion;
	}

	public boolean isExpirado(LocalDate fechaActual) {
		return _fechaExpiracion.isBefore(fechaActual);
	}
}
