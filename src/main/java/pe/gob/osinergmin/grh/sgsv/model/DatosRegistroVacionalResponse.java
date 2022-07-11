package pe.gob.osinergmin.grh.sgsv.model;

import java.util.List;

import pe.gob.osinergmin.grh.sgsv.domain.view.DatosEmpleadoComboView;

public class DatosRegistroVacionalResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6485207767722850260L;

	private Integer identificacion;
	private String nombres;
	private Integer codRegistro;
	private String codigoSolicitud;
	private List<DatosEmpleadoComboView> listaEmpleadosReemplazo;
	private List<DatosEmpleadoComboView> listaEmpleadoAprobacion;

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

	public List<DatosEmpleadoComboView> getListaEmpleadosReemplazo() {
		return listaEmpleadosReemplazo;
	}

	public void setListaEmpleadosReemplazo(List<DatosEmpleadoComboView> listaEmpleadosReemplazo) {
		this.listaEmpleadosReemplazo = listaEmpleadosReemplazo;
	}

	public List<DatosEmpleadoComboView> getListaEmpleadoAprobacion() {
		return listaEmpleadoAprobacion;
	}

	public void setListaEmpleadoAprobacion(List<DatosEmpleadoComboView> listaEmpleadoAprobacion) {
		this.listaEmpleadoAprobacion = listaEmpleadoAprobacion;
	}

}
