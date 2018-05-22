package textExcel;

public class FormulaCell extends RealCell{
	public FormulaCell(String intCell) {
		super (intCell);
	}
	public double getDoubleValue() {
		if('*') {
			return [A1]*[A2];
		}else if('/') {
			return 
		}
		
		
	return 0;
	}
	public String abbreviatedCellText() {
		
		
		
	return ""; 
	}
}
		
