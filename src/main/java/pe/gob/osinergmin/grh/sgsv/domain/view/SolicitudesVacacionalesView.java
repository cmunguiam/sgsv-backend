package pe.gob.osinergmin.grh.sgsv.domain.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_SOLITUDES_VACACIONALES")
public class SolicitudesVacacionalesView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5443398591567530219L;

	@Id
	@Column(name = "COD_REGISTRO")
	private Integer codRegistro;

	@Column(name = "COD_SOLICITUD")
	private String codSolicitud;

	@Column(name = "FECHA_REGISTRO")
	private String fechaRegistro;

	@Column(name = "COD_TIPO_GOCE")
	private Integer codTipoGoce;

	@Column(name = "DESC_TIPO_GOCE")
	private String descTipoGoce;

	@Column(name = "FECHA_INICIO")
	private String fechaInicio;

	@Column(name = "FECHA_FIN")
	private String fechaFin;

	@Column(name = "DIAS")
	private Integer dias;

	@Column(name = "COD_ESTADO")
	private Integer codEstado;

	@Column(name = "DESC_ESTADO")
	private String desEstado;

	@Column(name = "COD_EMPL")
	private Integer codEmpl;

	@Column(name = "COD_EMPL_APROBACION")
	private Integer codEmplAprobacion;

	@Column(name = "SALDO")
	private Integer saldo;

	@Column(name = "FEC_VENCIMIENTO")
	private String fechaVencimiento;

	@Column(name = "COD_SALDO")
	private Integer codSaldo;

	public Integer getCodRegistro() {
		return codRegistro;
	}

	public void setCodRegistro(Integer codRegistro) {
		this.codRegistro = codRegistro;
	}

	public String getCodSolicitud() {
		return codSolicitud;
	}

	public void setCodSolicitud(String codSolicitud) {
		this.codSolicitud = codSolicitud;
	}

	public String getFechaRegistro() {
		return fechaRegistro;
	}

	public void setFechaRegistro(String fechaRegistro) {
		this.fechaRegistro = fechaRegistro;
	}

	public Integer getCodTipoGoce() {
		return codTipoGoce;
	}

	public void setCodTipoGoce(Integer codTipoGoce) {
		this.codTipoGoce = codTipoGoce;
	}

	public String getDescTipoGoce() {
		return descTipoGoce;
	}

	public void setDescTipoGoce(String descTipoGoce) {
		this.descTipoGoce = descTipoGoce;
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

	public Integer getDias() {
		return dias;
	}

	public void setDias(Integer dias) {
		this.dias = dias;
	}

	public Integer getCodEstado() {
		return codEstado;
	}

	public void setCodEstado(Integer codEstado) {
		this.codEstado = codEstado;
	}

	public String getDesEstado() {
		return desEstado;
	}

	public void setDesEstado(String desEstado) {
		this.desEstado = desEstado;
	}

	public Integer getCodEmpl() {
		return codEmpl;
	}

	public void setCodEmpl(Integer codEmpl) {
		this.codEmpl = codEmpl;
	}

	public Integer getCodEmplAprobacion() {
		return codEmplAprobacion;
	}

	public void setCodEmplAprobacion(Integer codEmplAprobacion) {
		this.codEmplAprobacion = codEmplAprobacion;
	}

	public Integer getSaldo() {
		return saldo;
	}

	public void setSaldo(Integer saldo) {
		this.saldo = saldo;
	}

	public String getFechaVencimiento() {
		return fechaVencimiento;
	}

	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}

	public Integer getCodSaldo() {
		return codSaldo;
	}

	public void setCodSaldo(Integer codSaldo) {
		this.codSaldo = codSaldo;
	}

	@Override
	public String toString() {
		return "SolicitudesVacacionalesView [codRegistro=" + codRegistro + ", codSolicitud=" + codSolicitud
				+ ", fechaRegistro=" + fechaRegistro + ", codTipoGoce=" + codTipoGoce + ", descTipoGoce=" + descTipoGoce
				+ ", fechaInicio=" + fechaInicio + ", fechaFin=" + fechaFin + ", dias=" + dias + ", codEstado="
				+ codEstado + ", desEstado=" + desEstado + ", codEmpl=" + codEmpl + ", codEmplAprobacion="
				+ codEmplAprobacion + ", saldo=" + saldo + ", fechaVencimiento=" + fechaVencimiento + ", codSaldo="
				+ codSaldo + "]";
	}

}
