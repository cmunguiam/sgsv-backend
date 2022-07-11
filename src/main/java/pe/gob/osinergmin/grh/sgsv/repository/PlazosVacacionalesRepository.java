package pe.gob.osinergmin.grh.sgsv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import pe.gob.osinergmin.grh.sgsv.domain.view.PlazosVacacionalesView;



public interface PlazosVacacionalesRepository extends JpaRepository<PlazosVacacionalesView,Integer>, JpaSpecificationExecutor<PlazosVacacionalesView>{
	
	@Query( value = "select * from VW_PLAZOS_VACACIONALES where COD_SALDO=?",  nativeQuery = true)
	List<PlazosVacacionalesView> listarSaldos(Integer codSaldo);
	
	
}
