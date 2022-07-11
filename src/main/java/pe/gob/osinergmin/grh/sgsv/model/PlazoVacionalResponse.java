package pe.gob.osinergmin.grh.sgsv.model;

import java.util.List;

import pe.gob.osinergmin.grh.sgsv.domain.view.PlazosVacacionalesView;

public class PlazoVacionalResponse {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6485207767722850260L;


	private List<PlazosVacacionalesView> listaPlazozVacacionales;


	public List<PlazosVacacionalesView> getListaPlazozVacacionales() {
		return listaPlazozVacacionales;
	}


	public void setListaPlazozVacacionales(List<PlazosVacacionalesView> listaPlazozVacacionales) {
		this.listaPlazozVacacionales = listaPlazozVacacionales;
	}

	

}
