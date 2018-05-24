package textExcel;

public class PercentCell extends RealCell{
	public PercentCell (String intCell) {
		super(intCell);
	}
	public String abbreviatedCellText() {
		String abbreviated = super.fullCellText().substring(0, super.fullCellText().indexOf('.')) + "%";
		for(int i= abbreviated.length(); i<=9; i++)
			abbreviated += " ";
		return abbreviated;
	}
	public String fullCellText() {
		String input = super.fullCellText().substring (0, super.fullCellText().length()-1);
		double doubleValue = Double.parseDouble(input);
		return "" + doubleValue / 100;
	}
	public double getDoubleValue() {
		String input = super.fullCellText().substring (0, super.fullCellText().length()-1);
		double doubleValue = Double.parseDouble(input);
		return doubleValue;
	}

}
