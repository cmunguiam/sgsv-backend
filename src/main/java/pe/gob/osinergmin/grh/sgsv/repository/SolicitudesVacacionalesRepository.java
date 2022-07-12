package pe.gob.osinergmin.grh.sgsv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import pe.gob.osinergmin.grh.sgsv.domain.view.SolicitudesVacacionalesView;



public interface SolicitudesVacacionalesRepository extends JpaRepository<SolicitudesVacacionalesView,Integer>, JpaSpecificationExecutor<SolicitudesVacacionalesView>{
	
	@Query( value = "select * from VW_SOLITUDES_VACACIONALES where COD_EMPL=?",  nativeQuery = true)
	List<SolicitudesVacacionalesView> findAllByCodEmpl(Integer codEmpl);
	
	@Query( value = "select Count(*) as cantidad_aprobar from VW_SOLITUDES_VACACIONALES where COD_EMPL_APROBACION=?",  nativeQuery = true)
	Integer finCountAprobacion(Integer codEmpl);
	
	@Query( value = "select * from VW_SOLITUDES_VACACIONALES where COD_REGISTRO=?",  nativeQuery = true)
	SolicitudesVacacionalesView findAllByCodResgistro(Integer codRegistro);
	
}
