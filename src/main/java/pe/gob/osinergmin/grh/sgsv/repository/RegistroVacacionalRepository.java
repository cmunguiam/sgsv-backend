package pe.gob.osinergmin.grh.sgsv.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import pe.gob.osinergmin.grh.sgsv.domain.view.RegistroVacional;

public interface RegistroVacacionalRepository
		extends JpaRepository<RegistroVacional, Integer>, JpaSpecificationExecutor<RegistroVacional> {

	@Query(value = "SELECT SGSV_SEQ_REGISTRO_VACACIONAL.nextval  FROM dual", nativeQuery = true)
	Integer getSecuenciaRegistro();

	@Query(value = "SELECT 'SV-GSTI-'||LPAD(?, 5, '0')|| '-'||TO_CHAR(sysdate, 'YYYY' ) as codigo  from dual", nativeQuery = true)
	String getCodigoSolicitud(Integer idSecuencia);

	@Modifying
	@Query(value = "Insert into SGSV_REGISTRO_VACACIONAL (COD_REGISTRO,FECHA_INICIO,FECHA_FIN,DIAS,DIA_MEDIO,COD_EMPL_REEMPLAZO,COD_EMPL_APROBACION,FECHA_REGISTRO,FECHA_MODIFICACION,ESTADO,COD_TIPO_GOCE,COD_SALDO,COD_SOLICITUD,COD_ESTADO) values (?1,?5,?6,?7,?8,?3,?4,sysdate,sysdate,'A','1','1',?2,'1')", nativeQuery = true)
	Integer saveRegistroVacacional(Integer codRegistro, String codigoSolicitud, Integer codEmplReemplazo,
			Integer codEmplAprobacion, String fechaInicio, String fechaFin, Double dias, String diaMedio);

}
