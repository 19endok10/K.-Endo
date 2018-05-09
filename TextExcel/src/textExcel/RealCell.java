package textExcel;

public class RealCell implements Cell {
	private String intCell;
	public RealCell(String intCell) {
		this.intCell=intCell;
	}
	private String getDoubleValue1() {
		return null;
	}
	public String abbreviatedCellText() {
		String doubleValue=this.getDoubleValue1()+"";
		String result=doubleValue;
		if(doubleValue.length()<10) {
			for(int i=0; i<10-doubleValue.length(); i++) {
				result +=" ";
			}
			return result;
		}else {
			return doubleValue.substring(0, 10);
		}
	}
	public String getCellText() {
		return this.getDoubleValue1() +"";
	}
	public void setCellText(String intCell) {
		this.intCell = intCell;
	}
	public String fullCellText() {
		return intCell;
	}
	public double getDoubleValue() {
		return Double.parseDouble(intCell);
	}
}