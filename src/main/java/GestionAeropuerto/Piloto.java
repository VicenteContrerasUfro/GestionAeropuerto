package GestionAeropuerto;

public class Piloto implements CharSequence {
	private String _nombre;
	private String _apellido;
	private String _id;
	private Vuelo _vueloAsignado;
	public Avion _unnamed_Avion_;
	public UserVuelo _unnamed_UserVuelo_;

	public Piloto(String janeSmith, String pilotoLicenciaA) {
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

	public Vuelo getVueloAsignado() {
		return this._vueloAsignado;
	}

	public void setVueloAsignado(Vuelo aVueloAsignado) {
		this._vueloAsignado = aVueloAsignado;
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
}