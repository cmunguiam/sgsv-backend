package pe.gob.osinergmin.grh.sgsv.model;

import java.util.List;

import pe.gob.osinergmin.grh.sgsv.domain.view.SolicitudesVacacionalesView;

public class DatosEmpleadoBandejaResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6485207767722850260L;

	private String nombres;
	private Integer saldo;
	private String fechaVencimiento;
	private Integer esJefe;
	private String email;
	private Integer cantidaPorAprobar;
	private List<SolicitudesVacacionalesView> solicitudesVacacionales;

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
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

	public Integer getEsJefe() {
		return esJefe;
	}

	public void setEsJefe(Integer esJefe) {
		this.esJefe = esJefe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getCantidaPorAprobar() {
		return cantidaPorAprobar;
	}

	public void setCantidaPorAprobar(Integer cantidaPorAprobar) {
		this.cantidaPorAprobar = cantidaPorAprobar;
	}

	public List<SolicitudesVacacionalesView> getSolicitudesVacacionales() {
		return solicitudesVacacionales;
	}

	public void setSolicitudesVacacionales(List<SolicitudesVacacionalesView> solicitudesVacacionales) {
		this.solicitudesVacacionales = solicitudesVacacionales;
	}

	@Override
	public String toString() {
		return "DatosEmpleadoBandejaResponse [nombres=" + nombres + ", saldo=" + saldo + ", fechaVencimiento="
				+ fechaVencimiento + ", esJefe=" + esJefe + ", email=" + email + ", cantidaPorAprobar="
				+ cantidaPorAprobar + ", solicitudesVacacionales=" + solicitudesVacacionales + "]";
	}

}
