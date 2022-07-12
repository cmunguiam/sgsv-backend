package pe.gob.osinergmin.grh.sgsv.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
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
import pe.gob.osinergmin.grh.sgsv.model.RegistroVacionesRequest;
import pe.gob.osinergmin.grh.sgsv.model.VerRegistroVacionalRequest;
import pe.gob.osinergmin.grh.sgsv.model.VerRegistroVacionalResponse;
import pe.gob.osinergmin.grh.sgsv.service.VacacionesBandejaService;

@CrossOrigin(origins = "*", maxAge = 360)
@RestController
@RequestMapping("api/vacaciones/bandeja")
public class VacacionesBandejaController {

	private static Logger LOG = LoggerFactory.getLogger(VacacionesBandejaController.class);

	@Autowired
	private VacacionesBandejaService vacacionesBandejaService;

	@PostMapping("/obtenerDatosEmpleado")
	@ApiOperation(value = "Obtener datos del empleado")
	public DatosEmpleadoResponse crearUnidadOrganica(@RequestBody DatosEmpleadoRequest request) {
		return vacacionesBandejaService.getDatosEmpleado(request);
	}

	@PostMapping("/obtenerDatosBandeja")
	@ApiOperation(value = "Obtener datos del empleado")
	public DatosEmpleadoBandejaResponse registrarVacaciones(@RequestBody DatosEmpleadoRequest request) {
		return vacacionesBandejaService.getDatosEmpleadoBandeja(request);
	}

	@PostMapping("/listarVacaciones")
	@ApiOperation(value = "Obtener datos del empleado")
	public List<SolicitudesVacacionalesView> listarVacaciones(@RequestBody RegistroVacionesRequest request) {
		return vacacionesBandejaService.findAllByCodEmpl(request.getIdentificacion());
	}

	@GetMapping("/obtenerDatosBandejaUrl")
	@ApiOperation(value = "Obtener datos del empleado")
	public DatosEmpleadoBandejaResponse registrarVacaciones(
			@RequestParam(name = "identificacion", required = false, defaultValue = "") String identificacion) {
		return vacacionesBandejaService.getDatosEmpleadoBandejaUrl(identificacion);
	}

	@PostMapping("/listarPlazosVacacionales")
	@ApiOperation(value = "listar plazos vacacionales")
	public PlazoVacionalResponse listarPlazosVacacionales(@RequestBody PlazoVacionalRequest request) {
		return vacacionesBandejaService.listarPlazosVacacionales(request);
	}

	@PostMapping("/obtenerDatosRegistroVacacional")
	@ApiOperation(value = "obtener Datos Registro Vacacional")
	public DatosRegistroVacionalResponse obtenerDatosRegistroVacacional(
			@RequestBody DatosRegistroVacionalRequest request) {
		return vacacionesBandejaService.obtenerDatosRegistroVacacional(request);
	}

	@PostMapping("/registrarVacacional")
	@ApiOperation(value = "registro Vacacional")
	public RegistroVacionalResponse registrarVacacional(@RequestBody RegistroVacionalRequest request) {
		return vacacionesBandejaService.registrarVacacional(request);
	}

	@PostMapping("/verRegistroVacacional")
	@ApiOperation(value = "registro Vacacional")
	public VerRegistroVacionalResponse verRegistroVacacional(@RequestBody VerRegistroVacionalRequest request) {
		return vacacionesBandejaService.verRegistroVacacional(request);
	}

	@PostMapping("/editarRegistroVacacional")
	@ApiOperation(value = "Editar registro Vacacional")
	public RegistroVacionalResponse EditarRegistroVacacional(@RequestBody RegistroVacionalRequest request) {
		return vacacionesBandejaService.editarRegistroVacacional(request);
	}

	@PostMapping("/anularRegistroVacacional")
	@ApiOperation(value = "Anular registro Vacacional")
	public RegistroVacionalResponse anularRegistroVacacional(@RequestBody VerRegistroVacionalRequest request) {
		return vacacionesBandejaService.anularRegistroVacacional(request);
	}

	@PostMapping("/enviarJefeRegistroVacacional")
	@ApiOperation(value = "Anular registro Vacacional")
	public RegistroVacionalResponse enviarJefeRegistroVacacional(@RequestBody VerRegistroVacionalRequest request) {
		return vacacionesBandejaService.enviarJefeRegistroVacacional(request);
	}

	@PostMapping("/recuperarJefeRegistroVacacional")
	@ApiOperation(value = "Anular registro Vacacional")
	public RegistroVacionalResponse recuperarJefeRegistroVacacional(@RequestBody VerRegistroVacionalRequest request) {
		return vacacionesBandejaService.recuperarJefeRegistroVacacional(request);
	}

}
