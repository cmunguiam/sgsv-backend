package pe.gob.osinergmin.grh.sgsv.service;

import java.util.List;

import pe.gob.osinergmin.grh.sgsv.domain.view.SolicitudesVacacionalesView;
import pe.gob.osinergmin.grh.sgsv.model.DatosEmpleadoBandejaResponse;
import pe.gob.osinergmin.grh.sgsv.model.DatosEmpleadoRequest;
import pe.gob.osinergmin.grh.sgsv.model.DatosEmpleadoResponse;
import pe.gob.osinergmin.grh.sgsv.model.DatosRegistroVacionalRequest;
import pe.gob.osinergmin.grh.sgsv.model.DatosRegistroVacionalResponse;
import pe.gob.osinergmin.grh.sgsv.model.PlazoVacionalRequest;
import pe.gob.osinergmin.grh.sgsv.model.PlazoVacionalResponse;
import pe.gob.osinergmin.grh.sgsv.model.RegistroVacionalRequest;
import pe.gob.osinergmin.grh.sgsv.model.RegistroVacionalResponse;

public interface VacacionesBandejaService {

	public DatosEmpleadoResponse getDatosEmpleado(DatosEmpleadoRequest request);

	public List<SolicitudesVacacionalesView> findAllByCodEmpl(Integer codEmpl);

	public DatosEmpleadoBandejaResponse getDatosEmpleadoBandeja(DatosEmpleadoRequest request);

	public DatosEmpleadoBandejaResponse getDatosEmpleadoBandejaUrl(String identificacion);

	public PlazoVacionalResponse listarPlazosVacacionales(PlazoVacionalRequest request);
	
	public DatosRegistroVacionalResponse obtenerDatosRegistroVacacional(DatosRegistroVacionalRequest request);

	public RegistroVacionalResponse registrarVacacional(RegistroVacionalRequest request);

}
