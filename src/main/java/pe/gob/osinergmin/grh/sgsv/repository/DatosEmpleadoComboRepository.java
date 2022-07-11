package pe.gob.osinergmin.grh.sgsv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import pe.gob.osinergmin.grh.sgsv.domain.view.DatosEmpleadoComboView;

public interface DatosEmpleadoComboRepository
		extends JpaRepository<DatosEmpleadoComboView, Integer>, JpaSpecificationExecutor<DatosEmpleadoComboView> {

	@Query(value = "select x.* from VW_COMBO_DATOS_EMPLEADO x where ROWNUM <5", nativeQuery = true)
	List<DatosEmpleadoComboView> findComboEmpleados();

}
