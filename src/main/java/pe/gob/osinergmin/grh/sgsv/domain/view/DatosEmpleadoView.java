package pe.gob.osinergmin.grh.sgsv.domain.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "VW_DATOS_EMPLEADO")
public class DatosEmpleadoView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5443398591567530219L;

	@Id
	@Column(name = "IDENTIFICACION")
	private Integer identificacion;

	@Column(name = "NOMBRES")
	private String nombres;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "AREA")
	private String area;

	@Column(name = "CARGO")
	private String cargo;

	@Column(name = "DOMINA")
	private String domina;

	@Column(name = "CORREO_JEFE")
	private String correoJefe;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO")
	private String apellido;

	@Column(name = "FECHA")
	private String fecha;

	@Column(name = "ES_JEFE")
	private Integer esJefe;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public String getDomina() {
		return domina;
	}

	public void setDomina(String domina) {
		this.domina = domina;
	}

	public String getCorreoJefe() {
		return correoJefe;
	}

	public void setCorreoJefe(String correoJefe) {
		this.correoJefe = correoJefe;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Integer getEsJefe() {
		return esJefe;
	}

	public void setEsJefe(Integer esJefe) {
		this.esJefe = esJefe;
	}

	@Override
	public String toString() {
		return "DatosEmpleadoView [identificacion=" + identificacion + ", nombres=" + nombres + ", email=" + email
				+ ", area=" + area + ", cargo=" + cargo + ", domina=" + domina + ", correoJefe=" + correoJefe
				+ ", nombre=" + nombre + ", apellido=" + apellido + ", fecha=" + fecha + ", esJefe=" + esJefe + "]";
	}

}
