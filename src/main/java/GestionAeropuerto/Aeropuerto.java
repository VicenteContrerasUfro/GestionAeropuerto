package GestionAeropuerto;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.time.LocalDate;

public class Aeropuerto {
	private String nombre;
	private String ubicacion;
	private List<Avion> aviones;
	private List<Vuelo> vuelos;

	// Constructor
	public Aeropuerto() {
		this.aviones = new ArrayList<>();
		this.vuelos = new ArrayList<>();
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getUbicacion() {
		return this.ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public void crearVuelo(String idVuelo, LocalTime horaInicio, LocalTime horaLlegada, LocalDate fecha, CiudadOrigen origen, CiudadDestino destino) {
		Vuelo nuevoVuelo = new Vuelo(idVuelo, horaInicio, horaLlegada, fecha, origen, destino);
		vuelos.add(nuevoVuelo);
	}

	public void registrarAvion(Avion avion) {
		aviones.add(avion);
	}

	public void agregarPasajero(String idVuelo, Pasajero pasajero) {
		Vuelo vuelo = buscarVueloPorId(idVuelo);
		if (vuelo != null) {
			vuelo.agregarPasajero(pasajero);
		} else {
			throw new IllegalArgumentException("Vuelo no encontrado.");
		}
	}

	public void agregarPiloto(String idVuelo, Piloto piloto) {
		Vuelo vuelo = buscarVueloPorId(idVuelo);
		if (vuelo != null) {
			vuelo.agregarPiloto(piloto);
		} else {
			throw new IllegalArgumentException("Vuelo no encontrado.");
		}
	}

	public boolean validarPasaporte(Pasaporte pasaporte) {
		LocalDate fechaActual = LocalDate.now();
		return !pasaporte.isExpirado(fechaActual) && pasaporte.getHojasDisponibles() > 0;
	}

	public List<UserVuelo> buscarUserPorFecha(LocalDate fechaInicio) {
		List<UserVuelo> usuarios = new ArrayList<>();
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getFecha().equals(fechaInicio)) {
				usuarios.addAll(vuelo.getUsuarios());
			}
		}
		return usuarios;
	}

	public UserVuelo buscarUserEnVuelo(String idVuelo) {
		Vuelo vuelo = buscarVueloPorId(idVuelo);
		if (vuelo != null) {
			for (UserVuelo usuario : vuelo.getUsuarios()) {
				if (usuario != null) {
					return usuario;
				}
			}
		}
		return null;
	}

	Vuelo buscarVueloPorId(String idVuelo) {
		for (Vuelo vuelo : vuelos) {
			if (vuelo.getId().equals(idVuelo)) {
				return vuelo;
			}
		}
		return null;
	}

	public List<Vuelo> getVuelos() {
		return vuelos;
	}

	public List<Avion> getAviones() {
		return aviones;
	}

	public void agregarUsuario(String v123, UserVuelo usuario) {
	}
}
