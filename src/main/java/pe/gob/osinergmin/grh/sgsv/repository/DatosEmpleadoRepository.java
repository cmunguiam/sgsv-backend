package pe.gob.osinergmin.grh.sgsv.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import pe.gob.osinergmin.grh.sgsv.domain.view.DatosEmpleadoComboView;
import pe.gob.osinergmin.grh.sgsv.domain.view.DatosEmpleadoView;

public interface DatosEmpleadoRepository
		extends JpaRepository<DatosEmpleadoView, Integer>, JpaSpecificationExecutor<DatosEmpleadoView> {

	@Query(value = "select x.* from VW_DATOS_EMPLEADO x where x.IDENTIFICACION=?", nativeQuery = true)
	DatosEmpleadoView findAllByIdIdentificacion(Integer identificacion);

	@Query(value = "select x.* from VW_DATOS_EMPLEADO where ROWNUM <5", nativeQuery = true)
	List<DatosEmpleadoView> findComboEmpleado();

	@Query("select e.identificacion, e.nombres from DatosEmpleadoComboView e")
	List<DatosEmpleadoComboView> findComboEmpleados();
	
//	@Query(value = "select x.* from VW_DATOS_EMPLEADO where ROWNUM <5", nativeQuery = true)
//	List<DatosEmpleadoView> findComboEmpleado();

}
