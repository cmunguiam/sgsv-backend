package pe.gob.osinergmin.grh.sgsv.model;

import java.sql.Date;

import javax.persistence.Column;

public class RegistroVacionalRequest {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6485207767722850260L;

	private Integer identificacion;
	private String nombres;
	private Integer codRegistro;
	private String codigoSolicitud;
	private Integer codEmplReemplazo;
	private Integer codEmplAprobacion;
	private String fechaInicio;
	private String fechaFin;
	private Double dias;
	private String diaMedio;

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

	public Integer getCodRegistro() {
		return codRegistro;
	}

	public void setCodRegistro(Integer codRegistro) {
		this.codRegistro = codRegistro;
	}

	public String getCodigoSolicitud() {
		return codigoSolicitud;
	}

	public void setCodigoSolicitud(String codigoSolicitud) {
		this.codigoSolicitud = codigoSolicitud;
	}

	public Integer getCodEmplReemplazo() {
		return codEmplReemplazo;
	}

	public void setCodEmplReemplazo(Integer codEmplReemplazo) {
		this.codEmplReemplazo = codEmplReemplazo;
	}

	public Integer getCodEmplAprobacion() {
		return codEmplAprobacion;
	}

	public void setCodEmplAprobacion(Integer codEmplAprobacion) {
		this.codEmplAprobacion = codEmplAprobacion;
	}

	public String getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(String fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public String getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(String fechaFin) {
		this.fechaFin = fechaFin;
	}

	public Double getDias() {
		return dias;
	}

	public void setDias(Double dias) {
		this.dias = dias;
	}

	public String getDiaMedio() {
		return diaMedio;
	}

	public void setDiaMedio(String diaMedio) {
		this.diaMedio = diaMedio;
	}

}
