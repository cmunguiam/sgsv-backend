package pe.gob.osinergmin.grh.sgsv.domain.view;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "VW_SOLITUDES_VACACIONALES")
public class PlazosVacacionalesView implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5443398591567530219L;

	@Id
	@Column(name = "COD_PLAZO")
	private Integer codPlazo;

	@Column(name = "COD_SALDO")
	private Integer codSaldo;

	@Column(name = "DESC_PERIODO")
	private String descPeriodo;

	@Column(name = "SALDO")
	private String saldo;

	@Column(name = "FEC_VENCIMIENTO")
	private String fecVencimiento;

	public Integer getCodSaldo() {
		return codSaldo;
	}

	public void setCodSaldo(Integer codSaldo) {
		this.codSaldo = codSaldo;
	}

	public String getDescPeriodo() {
		return descPeriodo;
	}

	public void setDescPeriodo(String descPeriodo) {
		this.descPeriodo = descPeriodo;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}

	public String getFecVencimiento() {
		return fecVencimiento;
	}

	public void setFecVencimiento(String fecVencimiento) {
		this.fecVencimiento = fecVencimiento;
	}

	public Integer getCodPlazo() {
		return codPlazo;
	}

	public void setCodPlazo(Integer codPlazo) {
		this.codPlazo = codPlazo;
	}

}
