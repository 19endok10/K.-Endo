package textExcel;

public class PercentCell extends RealCell{
	public PercentCell (String intCell) {
		super(intCell);
	}
	public String abbreviatedCellText() {
		String abbreviated = super.getCellText().substring(0, super.getCellText().indexOf('.')) + "%";
		for(int i= abbreviated.length(); i<=9; i++)
			abbreviated += " ";
		return abbreviated;
	}
	public String fullCellText() {
		String input = super.getCellText().substring (0, super.getCellText().length()-1);
		double doubleValue = Double.parseDouble(input);
		return "" + doubleValue * 100;
	}

}
