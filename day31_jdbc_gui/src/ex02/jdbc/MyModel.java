package ex02.jdbc;

import java.sql.ResultSet;

import javax.swing.table.AbstractTableModel;

public class MyModel extends AbstractTableModel {
	
	Object[][] data;
	String[] columnName;
	int rows, cols; // 레코드 행과 열의 개수를 저장하는 변수

	@Override
	public int getRowCount() { // 레코드 개수
		
		return 0;
	}
	
	public void getRowCount(ResultSet rsScroll) { // 레코드 개수 알아내기 - user method
		
		try {
			
		} catch (Exception e) {
			// TODO: handle exception
		}
//		return 0;
	}

	@Override
	public int getColumnCount() { // 필드(열)의 개수
		
		return columnName.length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) { // 행과 열
		
		return null;
	}
	
	// DB에 저장된 데이터 채움
	public void serData(ResultSet rs) {
		
	}

}
