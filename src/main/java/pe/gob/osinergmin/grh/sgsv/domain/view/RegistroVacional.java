package pe.gob.osinergmin.grh.sgsv.domain.view;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SGSV_REGISTRO_VACACIONAL")
public class RegistroVacional implements Serializable {

	private static final long serialVersionUID = -5443398591567530219L;

	@Id
	@Column(name = "COD_REGISTRO")
	private Integer codRegistro;

	@Column(name = "FECHA_INICIO")
	private Date fechaInicio;

	@Column(name = "FECHA_FIN")
	private Date fechaFin;

	@Column(name = "DIAS")
	private Double dias;

	@Column(name = "DIA_MEDIO")
	private String diaMedio;

	@Column(name = "COD_EMPL_REEMPLAZO")
	private Integer codEmplReemplazo;

	@Column(name = "COD_EMPL_APROBACION")
	private Integer codEmplAprobacion;

	@Column(name = "FECHA_REGISTRO")
	private String fechaRegistro;

	@Column(name = "FECHA_MODIFICACION")
	private String fechaModificacion;

	@Column(name = "ESTADO")
	private String estado;

	@Column(name = "COD_TIPO_GOCE")
	private Integer codTipoGoce;

	@Column(name = "COD_SALDO")
	private Integer codSaldo;

	@Column(name = "COD_SOLICITUD")
	private String codSolicitud;

	@Column(name = "COD_ESTADO")
	private Integer codEstado;

	public Integer getCodRegistro() {
		return codRegistro;
	}

	public void setCodRegistro(Integer codRegistro) {
		this.codRegistro = codRegistro;
	}

	public Date getFechaInicio() {
		return fechaInicio;
	}

	public void setFechaInicio(Date fechaInicio) {
		this.fechaInicio = fechaInicio;
	}

	public Date getFechaFin() {
		return fechaFin;
	}

	public void setFechaFin(Date fechaFin) {
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

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public String getFechaModificacion() {
		return fechaModificacion;
	}

	public void setFechaModificacion(String fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public Integer getCodTipoGoce() {
		return codTipoGoce;
	}

	public void setCodTipoGoce(Integer codTipoGoce) {
		this.codTipoGoce = codTipoGoce;
	}

	public Integer getCodSaldo() {
		return codSaldo;
	}

	public void setCodSaldo(Integer codSaldo) {
		this.codSaldo = codSaldo;
	}

	public String getCodSolicitud() {
		return codSolicitud;
	}

	public void setCodSolicitud(String codSolicitud) {
		this.codSolicitud = codSolicitud;
	}

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

}
