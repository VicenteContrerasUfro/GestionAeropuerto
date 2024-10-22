package GestionAeropuerto;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Vuelo {
	private String idVuelo;
	private LocalDate fechaInicio;
	private CiudadOrigen lugarorigen;
	private CiudadDestino ciudadDestino;
	private List<Piloto> pilotos;
	private List<Pasajero> pasajeros;
	private List<UserVuelo> usuarios;

	public Vuelo(String idVuelo, LocalTime horaInicio, LocalTime horaLlegada, LocalDate fecha, CiudadOrigen origen, CiudadDestino destino) {
		this.idVuelo = idVuelo;
		this.fechaInicio = fecha;
		this.lugarorigen = origen;
		this.ciudadDestino = destino;
		this.pilotos = new ArrayList<>();
		this.pasajeros = new ArrayList<>();
		this.usuarios = new ArrayList<>();
	}

	public String getId() {
		return this.idVuelo;
	}

	public List<Piloto> getPilotos() {
		return this.pilotos;
	}

	public void agregarPiloto(Piloto piloto) {
		this.pilotos.add(piloto);
	}

	public List<Pasajero> getPasajeros() {
		return this.pasajeros;
	}

	public void agregarPasajero(Pasajero pasajero) {
		this.pasajeros.add(pasajero);
	}

	public LocalDate getFecha() {
		return this.fechaInicio;
	}

	public List<UserVuelo> getUsuarios() {
		return this.usuarios;
	}

	public void agregarUsuario(UserVuelo usuario) {
		this.usuarios.add(usuario);
	}
}


