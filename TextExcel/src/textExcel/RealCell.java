package textExcel;

public class RealCell implements Cell {
	private String inputNum;
	public RealCell(String inputNum) {
		this.inputNum=inputNum;
	}
	public String abbreviatedCellText() {
		String doubleValue=this.getDoubleValue()+"";
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
		return this.getDoubleValue() +"";
	}
	public void setCellText(String inputNum) {
		this.inputNum = inputNum;
	}
	public String fullCellText() {
		return inputNum;
	}
	public double getDoubleValue() {
		return Double.parseDouble(inputNum);
	}
}