package pe.gob.osinergmin.grh.sgsv.domain.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "VW_COMBO_DATOS_EMPLEADO")
public class DatosEmpleadoComboView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5443398591567530219L;

	@Id
	@Column(name = "IDENTIFICACION")
	private Integer identificacion;

	@Column(name = "NOMBRES")
	private String nombres;

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

	
}
