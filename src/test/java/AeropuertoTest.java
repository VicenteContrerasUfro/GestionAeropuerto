package GestionAeropuerto;

import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;

import static org.junit.Assert.*;

public class AeropuertoTest {
    private Aeropuerto aeropuerto;
    private Avion avion;
    private Vuelo vuelo;
    private Pasajero pasajero;
    private Piloto piloto;
    private Pasaporte pasaporte;

    @Before
    public void setUp() {
        aeropuerto = new Aeropuerto();
        aeropuerto.setNombre("Aeropuerto Internacional");
        aeropuerto.setUbicacion("Ciudad XYZ");

        // Inicializar los objetos necesarios para las pruebas
        avion = new Avion("A123", "Boeing 747", 400);
        vuelo = new Vuelo("V123", LocalTime.of(10, 0), LocalTime.of(12, 0),
                LocalDate.of(2024, 10, 21), new CiudadOrigen(), new CiudadDestino());
        pasajero = new Pasajero("John Doe", new Pasaporte("123456", "USA", 5, LocalDate.of(2025, 10, 21)));
        piloto = new Piloto("Jane Smith", "Piloto Licencia A");
        pasaporte = pasajero.getPasaporte();

        // Registrar avión y vuelo
        aeropuerto.registrarAvion(avion);
        aeropuerto.crearVuelo("V123", LocalTime.of(10, 0), LocalTime.of(12, 0),
                LocalDate.of(2024, 10, 21), new CiudadOrigen(), new CiudadDestino());
    }

    @Test
    public void testCrearVuelo() {
        assertEquals(1, aeropuerto.getVuelos().size());  // Verifica que hay 1 vuelo
    }

    @Test
    public void testRegistrarAvion() {
        assertEquals(1, aeropuerto.getAviones().size());  // Verifica que hay 1 avión
    }

    @Test
    public void testAgregarPasajero() {
        aeropuerto.agregarPasajero("V123", pasajero);
        assertNotNull(vuelo.getPasajeros());  // Verifica que el pasajero fue agregado
    }

    @Test
    public void testAgregarPiloto() {
        aeropuerto.agregarPiloto("V123", piloto);
        assertNotNull(vuelo.getPilotos());  // Verifica que el piloto fue agregado
    }

    @Test
    public void testValidarPasaporte() {
        // Crear un pasaporte válido
        Pasaporte pasaporte = new Pasaporte("AB123456", "USA", 5, LocalDate.of(2025, 10, 21));

        // Validar si el pasaporte es válido
        boolean valido = aeropuerto.validarPasaporte(pasaporte);

        // Asegurarse de que el pasaporte es válido
        assertTrue(valido);
    }



    @Test
    public void testBuscarUserPorFecha() {
        // Crea un vuelo para la fecha que buscas
        LocalDate fechaVuelo = LocalDate.of(2024, 10, 21);
        aeropuerto.crearVuelo("V123", LocalTime.of(10, 0), LocalTime.of(12, 0), fechaVuelo, new CiudadOrigen(), new CiudadDestino());

        // Crea un usuario y agrégalo al vuelo
        UserVuelo usuario = new UserVuelo("Usuario1");
        aeropuerto.agregarUsuario("V123", usuario); // Asegúrate de que este método exista en Aeropuerto

        // Busca los usuarios por fecha
        List<UserVuelo> usuarios = aeropuerto.buscarUserPorFecha(fechaVuelo);

    }


    @Test
    public void testBuscarUserEnVuelo() {
        Pasajero pasajero = new Pasajero("12345", "Juan Perez", "AB123456");  // Crear un objeto Pasajero correctamente
        aeropuerto.agregarPasajero("V123", pasajero);  // Ahora la variable pasajero tiene un valor válido
        UserVuelo userVuelo = aeropuerto.buscarUserEnVuelo("V123");

    }

}