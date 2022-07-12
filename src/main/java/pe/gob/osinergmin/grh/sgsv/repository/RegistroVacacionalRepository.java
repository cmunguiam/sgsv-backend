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
	
	@Modifying
	@Query(value = "UPDATE SGSV_REGISTRO_VACACIONAL SET FECHA_INICIO = ?4, FECHA_FIN = ?5, DIAS  = ?6 ,DIA_MEDIO  = ?7,COD_EMPL_REEMPLAZO  = ?2,COD_EMPL_APROBACION = ?3 ,FECHA_MODIFICACION = SYSDATE WHERE COD_REGISTRO =?1", nativeQuery = true)
	Integer saveEditarRegistroVacacional(Integer codRegistro, Integer codEmplReemplazo,Integer codEmplAprobacion, String fechaInicio, String fechaFin, Double dias, String diaMedio);
	
	@Modifying
	@Query(value = "UPDATE SGSV_REGISTRO_VACACIONAL SET ESTADO = 'I', FECHA_MODIFICACION = SYSDATE WHERE COD_REGISTRO =?1", nativeQuery = true)
	Integer saveAnularRegistroVacacional(Integer codRegistro);
	
	@Modifying
	@Query(value = "UPDATE SGSV_REGISTRO_VACACIONAL SET COD_ESTADO = 2, FECHA_MODIFICACION = SYSDATE WHERE COD_REGISTRO =?1", nativeQuery = true)
	Integer saveEnviarJefeRegistroVacacional(Integer codRegistro);
	
	@Modifying
	@Query(value = "UPDATE SGSV_REGISTRO_VACACIONAL SET COD_ESTADO = 1, FECHA_MODIFICACION = SYSDATE WHERE COD_REGISTRO =?1", nativeQuery = true)
	Integer saveRecuperarJefeRegistroVacacional(Integer codRegistro);


}
