package pe.gob.osinergmin.grh.sgsv.model;

public class VerRegistroVacionalRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6485207767722850260L;

	private Integer codRegistro;
	private Integer identificacion;
	private String nombres;
	private String codigoSolicitud;

	public Integer getCodRegistro() {
		return codRegistro;
	}

	public void setCodRegistro(Integer codRegistro) {
		this.codRegistro = codRegistro;
	}

	public Integer getIdentificacion() {
		return identificacion;
	}

	public void setIdentificacion(Integer identificacion) {
		this.identificacion = identificacion;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getCodigoSolicitud() {
		return codigoSolicitud;
	}

	public void setCodigoSolicitud(String codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

}
