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
import pe.gob.osinergmin.grh.sgsv.model.VerRegistroVacionalRequest;
import pe.gob.osinergmin.grh.sgsv.model.VerRegistroVacionalResponse;

public interface VacacionesBandejaService {

	public DatosEmpleadoResponse getDatosEmpleado(DatosEmpleadoRequest request);

	public List<SolicitudesVacacionalesView> findAllByCodEmpl(Integer codEmpl);

	public DatosEmpleadoBandejaResponse getDatosEmpleadoBandeja(DatosEmpleadoRequest request);

	public DatosEmpleadoBandejaResponse getDatosEmpleadoBandejaUrl(String identificacion);

	public PlazoVacionalResponse listarPlazosVacacionales(PlazoVacionalRequest request);
	
	public DatosRegistroVacionalResponse obtenerDatosRegistroVacacional(DatosRegistroVacionalRequest request);

	public RegistroVacionalResponse registrarVacacional(RegistroVacionalRequest request);
	
	public VerRegistroVacionalResponse verRegistroVacacional(VerRegistroVacionalRequest request);
	
	public RegistroVacionalResponse editarRegistroVacacional(RegistroVacionalRequest request);
	
	public RegistroVacionalResponse anularRegistroVacacional(VerRegistroVacionalRequest request);
	
	public RegistroVacionalResponse enviarJefeRegistroVacacional(VerRegistroVacionalRequest request);
	
	public RegistroVacionalResponse recuperarJefeRegistroVacacional(VerRegistroVacionalRequest request);



}
