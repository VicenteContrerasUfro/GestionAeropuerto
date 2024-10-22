package GestionAeropuerto;

public class Pasajero implements CharSequence {
	private String _nombre;
	private String _apellido;
	private String _id;
	public Avion _unnamed_Avion_;
	public Pasaporte _unnamed_Pasaporte_;
	public UserVuelo _unnamed_UserVuelo_;

	public Pasajero(String johnDoe, Pasaporte usa) {
	}

	public Pasajero(String number, String juanPerez, String ab123456) {
	}

	public String getNombre() {
		return this._nombre;
	}

	public void setNombre(String aNombre) {
		this._nombre = aNombre;
	}

	public String getApellido() {
		return this._apellido;
	}

	public void setApellido(String aApellido) {
		this._apellido = aApellido;
	}

	public String getId() {
		return this._id;
	}

	public void setId(String aId) {
		this._id = aId;
	}

	@Override
	public int length() {
		return 0;
	}

	@Override
	public char charAt(int index) {
		return 0;
	}

	@Override
	public CharSequence subSequence(int start, int end) {
		return null;
	}

	public Pasaporte getPasaporte() {
		return null;
	}
}