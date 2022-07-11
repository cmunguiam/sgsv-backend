package pe.gob.osinergmin.grh.sgsv.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import pe.gob.osinergmin.grh.sgsv.domain.view.DatosEmpleadoComboView;
import pe.gob.osinergmin.grh.sgsv.domain.view.DatosEmpleadoView;
import pe.gob.osinergmin.grh.sgsv.domain.view.PlazosVacacionalesView;
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
import pe.gob.osinergmin.grh.sgsv.repository.DatosEmpleadoComboRepository;
import pe.gob.osinergmin.grh.sgsv.repository.DatosEmpleadoRepository;
import pe.gob.osinergmin.grh.sgsv.repository.PlazosVacacionalesRepository;
import pe.gob.osinergmin.grh.sgsv.repository.RegistroVacacionalRepository;
import pe.gob.osinergmin.grh.sgsv.repository.SolicitudesVacacionalesRepository;
import pe.gob.osinergmin.grh.sgsv.service.ServiceBase;
import pe.gob.osinergmin.grh.sgsv.service.VacacionesBandejaService;

@Service
public class VacacionesBandejaServiceImpl extends ServiceBase implements VacacionesBandejaService {

	@Autowired
	private DatosEmpleadoRepository datosEmpleadoRepository;

	@Autowired
	private SolicitudesVacacionalesRepository solicitudesVacacionalesRepository;

	@Autowired
	private PlazosVacacionalesRepository plazosVacacionalesRepository;

	@Autowired
	private RegistroVacacionalRepository registroVacacionalRepository;

	@Autowired
	private DatosEmpleadoComboRepository datosEmpleadoComboRepository;

	@Override
	public DatosEmpleadoResponse getDatosEmpleado(DatosEmpleadoRequest request) {

		DatosEmpleadoResponse response = new DatosEmpleadoResponse();

		Optional<DatosEmpleadoView> optional = datosEmpleadoRepository.findById(request.getIdentificacion());
		if (optional.isPresent()) {
			System.out.println(optional);
			response = modelMapper.map(optional, DatosEmpleadoResponse.class);
		}

		return response;
	}

	@Override
	public List<SolicitudesVacacionalesView> findAllByCodEmpl(Integer codEmpl) {

		return solicitudesVacacionalesRepository.findAllByCodEmpl(codEmpl);
	}

	@Override
	public DatosEmpleadoBandejaResponse getDatosEmpleadoBandeja(DatosEmpleadoRequest request) {

		DatosEmpleadoBandejaResponse response = new DatosEmpleadoBandejaResponse();

		DatosEmpleadoView datosEmpleadoView = datosEmpleadoRepository
				.findAllByIdIdentificacion(request.getIdentificacion());

		List<SolicitudesVacacionalesView> solicitudes = solicitudesVacacionalesRepository
				.findAllByCodEmpl(request.getIdentificacion());

		response.setNombres(datosEmpleadoView.getNombres());

		if (!solicitudes.isEmpty()) {
			response.setSaldo(solicitudes.get(0).getSaldo());
			response.setFechaVencimiento(solicitudes.get(0).getFechaVencimiento());
			response.setEsJefe(datosEmpleadoView.getEsJefe());
			response.setEmail(datosEmpleadoView.getEmail());
			response.setSolicitudesVacacionales(solicitudes);

			if (datosEmpleadoView.getEsJefe() == 1) {
				Integer cantidaPorAprobar = solicitudesVacacionalesRepository
						.finCountAprobacion(request.getIdentificacion());
				response.setCantidaPorAprobar(cantidaPorAprobar);
			}
		}

		return response;
	}

	@Override
	public DatosEmpleadoBandejaResponse getDatosEmpleadoBandejaUrl(String identificacion) {
		DatosEmpleadoBandejaResponse response = new DatosEmpleadoBandejaResponse();

		DatosEmpleadoView datosEmpleadoView = datosEmpleadoRepository
				.findAllByIdIdentificacion(Integer.parseInt(identificacion));

		List<SolicitudesVacacionalesView> solicitudes = solicitudesVacacionalesRepository
				.findAllByCodEmpl(Integer.parseInt(identificacion));

		response.setNombres(datosEmpleadoView.getNombres());

		if (!solicitudes.isEmpty()) {
			response.setSaldo(solicitudes.get(0).getSaldo());
			response.setFechaVencimiento(solicitudes.get(0).getFechaVencimiento());
			response.setEsJefe(datosEmpleadoView.getEsJefe());
			response.setEmail(datosEmpleadoView.getEmail());
			response.setSolicitudesVacacionales(solicitudes);

			if (datosEmpleadoView.getEsJefe() == 1) {
				Integer cantidaPorAprobar = solicitudesVacacionalesRepository
						.finCountAprobacion(Integer.parseInt(identificacion));
				response.setCantidaPorAprobar(cantidaPorAprobar);
			} else {
				response.setCantidaPorAprobar(0);
			}
		}

		return response;
	}

	@Override
	public PlazoVacionalResponse listarPlazosVacacionales(PlazoVacionalRequest request) {
		PlazoVacionalResponse response = new PlazoVacionalResponse();

		List<PlazosVacacionalesView> listaPlazozVacacionales = plazosVacacionalesRepository
				.listarSaldos(request.getCodSaldo());
		response.setListaPlazozVacacionales(listaPlazozVacacionales);

		return response;
	}

	@Override
	public DatosRegistroVacionalResponse obtenerDatosRegistroVacacional(DatosRegistroVacionalRequest request) {

		DatosRegistroVacionalResponse registroVacionalResponse = new DatosRegistroVacionalResponse();

		Integer idSecuencia = registroVacacionalRepository.getSecuenciaRegistro();

		String codigoSolicitud = registroVacacionalRepository.getCodigoSolicitud(idSecuencia);

		List<DatosEmpleadoComboView> listaEmpleadosReemplazo = datosEmpleadoComboRepository.findComboEmpleados();

		List<DatosEmpleadoComboView> listaEmpleadoAprobacion = listaEmpleadosReemplazo;

		registroVacionalResponse.setCodRegistro(idSecuencia);
		registroVacionalResponse.setIdentificacion(request.getIdentificacion());
		registroVacionalResponse.setNombres(request.getNombres());
		registroVacionalResponse.setCodigoSolicitud(codigoSolicitud);
		registroVacionalResponse.setListaEmpleadosReemplazo(listaEmpleadosReemplazo);
		registroVacionalResponse.setListaEmpleadoAprobacion(listaEmpleadoAprobacion);

		return registroVacionalResponse;
	}

	@Override
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public RegistroVacionalResponse registrarVacacional(RegistroVacionalRequest request) {

		RegistroVacionalResponse response = new RegistroVacionalResponse();
		try {
			Integer insert = registroVacacionalRepository.saveRegistroVacacional(request.getCodRegistro(),request.getCodigoSolicitud(),request.getCodEmplReemplazo(),request.getCodEmplAprobacion(),request.getFechaInicio(),request.getFechaFin(),request.getDias(),request.getDiaMedio());
            System.out.println(insert);
		} catch (Exception e) {
			System.out.println("error");
			e.getMessage();
		}
		
		response.setCodigoSolicitud(request.getCodigoSolicitud());
		response.setIdentificacion(request.getIdentificacion());
		return response;
	}

}
