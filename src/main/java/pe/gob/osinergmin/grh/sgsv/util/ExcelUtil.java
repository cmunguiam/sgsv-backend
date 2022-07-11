package pe.gob.osinergmin.grh.sgsv.util;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ExcelUtil {

	public static boolean isEmptyOrBlankRow(Row row) {
		
		if (row == null) {
	        return true;
	    }
	    if (row.getLastCellNum() <= 0) {
	        return true;
	    }
	    for (int cellNum = row.getFirstCellNum(); cellNum < 4; cellNum++) {//Sólo verificamos las 3 primeras columnas
	        Cell cell = row.getCell(cellNum);
	        if (cell != null && cell.getCellType() != CellType.BLANK && !Utils.isNullOrEmpty(cell.toString())) {
	            return false;
	        }
	    }
	    return true;
	}
	
	public static boolean isEmptyOrBlankCell(Cell cell) {
		
		if(cell == null || cell.getCellType() == CellType.BLANK) {
			return true;
		}
		
		return false;
	}
	
	public static boolean isRowHidden(Row row) {
		return row.getZeroHeight();
	}
	
	public static int getIndexRowTotal(XSSFSheet sheet, int numeroFilaCabecera) {
		
		int filaTotal = 0;
		
		for(Row row: sheet) {
			if( row.getRowNum() > numeroFilaCabecera - 1 && (ExcelUtil.isEmptyOrBlankRow(row) || ExcelUtil.isRowHidden(row)) ) {	
				filaTotal = row.getRowNum() + 1;
				break;
			}
		}

		return filaTotal;
	}
}
