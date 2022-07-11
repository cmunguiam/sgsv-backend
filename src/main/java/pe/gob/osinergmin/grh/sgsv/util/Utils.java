package pe.gob.osinergmin.grh.sgsv.util;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class Utils {

	/**
	 * Formatea el DNI a 8 dígitos, si tiene menos de 8 digitos se agrega ceros a la izquierda.
	 * @param dni: DNI a formatear
	 * @return DNI formateado
	 */
	public static String dniFormat(double dni) {
		
		String dniFormated = String.format("%08d", (int) dni);
		
		return dniFormated;
	}
	
	/**
	 * Método que valida si una cadena es null o vacío
	 * @param texto
	 * @return true: si texto es null o vacío. False: si texto tiene caracteres.
	 */
	public static boolean isNullOrEmpty(String texto) {
		if(texto == null || texto.trim().length() == 0) {
			return Boolean.TRUE;
		}
		
		return Boolean.FALSE;
	}
	
	/**
	 * Método que formatea el mes en dos dígitos
	 * @param mesNumero: número de mes a formatear
	 * @return mes formateado
	 */
	public static String mesFormat(int mesNumero) {
		
		String mesFormated = String.format("%02d", mesNumero);
		
		return mesFormated;
	}
	
	/**
	 * Método que valida si numero tiene parte decimal
	 * @param numero: número a validar
	 * @return true: si no tiene parte decimal. False si tiene parte decimal.
	 */
	public static boolean isInteger(double numero) {
		long entero = (long) numero;
		double decimal = numero - entero;
		
		if(decimal == Double.valueOf(0)) {
			return Boolean.TRUE;
		}else {
			return Boolean.FALSE;
		}
		
	}
	
	public static String getFeInicioMesAnio(int mes, int anio) {
		String fecha = "01/"+ mesFormat(mes) + "/" + anio;
		
		return fecha;
	}
	
	public static String getFeFinalMesAnio(int mes, int anio) {
		String fecha = "";
		GregorianCalendar gc = (GregorianCalendar) GregorianCalendar.getInstance();
		switch(mes) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:	
				fecha = "31/" + mesFormat(mes) + "/" + anio;
				break;
			case 2:
				if(gc.isLeapYear(anio)) {
					fecha = "29/" + mesFormat(mes) + "/" + anio;
				}else {
					fecha = "28/" + mesFormat(mes) + "/" + anio;
				}				
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				fecha = "30/" + mesFormat(mes) + "/" + anio;
				break;
		}
		
		return fecha;
	}
	
	public static String getDnisSeparadosComas(List<String> listaDnis) {
		String dnis = "";
		for(String dni:listaDnis) {
			dnis = dnis + dni + ",";
		}
		//quitamos la última coma
		dnis = dnis.substring(0, dnis.length()-1);
		
		return dnis;
	}
	
	public static String getNombreMes(int mes) {
		String nombreMes = "";
		switch (mes) {
		case 1:
			nombreMes = "Enero";
			break;
		case 2:
			nombreMes = "Febrero";
			break;
		case 3:
			nombreMes = "Marzo";
			break;	
		case 4:
			nombreMes = "Abril";
			break;
		case 5:
			nombreMes = "Mayo";
			break;
		case 6:
			nombreMes = "Junio";
			break;
		case 7:
			nombreMes = "Julio";
			break;
		case 8:
			nombreMes = "Agosto";
			break;
		case 9:
			nombreMes = "Setiembre";
			break;
		case 10:
			nombreMes = "Octubre";
			break;
		case 11:
			nombreMes = "Noviembre";
			break;
		case 12:
			nombreMes = "Diciembre";
			break;			
		default:
			break;
		}
		
		return nombreMes;
	}
	
	public static String padLeft(String inputString, int length, String caracter) {
	    if (inputString.length() >= length) {
	        return inputString;
	    }
	    StringBuilder sb = new StringBuilder();
	    while (sb.length() < length - inputString.length()) {
	        sb.append(caracter);
	    }
	    sb.append(inputString);

	    return sb.toString();
	}
	
	public static String padRight(String inputString, int length, String caracter) {
	    if (inputString.length() >= length) {
	        return inputString;
	    }
	    	    	    
	    StringBuilder sb = new StringBuilder();
	    sb.append(inputString);
	    
	    while (sb.length() < length) {
	        sb.append(caracter);
	    }
	    

	    return sb.toString();
	}

	public static String formatearFecha(Date fecha, String formato) {
		String fechaFormateada = "";
		SimpleDateFormat sdf = new SimpleDateFormat(formato);
		fechaFormateada = sdf.format(fecha);
		
		return fechaFormateada;
	}

	public static String repetirCadena(String cadena, int numeroVeces) {
		String cadenaNueva = "";
		for(int i = 0 ; i < numeroVeces; i++) {
			cadenaNueva = cadenaNueva + cadena;
		}
		
		return cadenaNueva;
	}
	
	public static boolean sonIgualesHastaDosDecimales(Double num1, Double num2) {
		BigDecimal numero1 = BigDecimal.valueOf(num1).setScale(2, RoundingMode.HALF_UP);
		BigDecimal numero2 = BigDecimal.valueOf(num2).setScale(2, RoundingMode.HALF_UP);
		
		if( numero1.compareTo(numero2) == 0 ) {
			return true;
		}
		
		return false;
		
	}
	
}
