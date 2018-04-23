package textExcel;

public class TextCell implements Cell{
	String text;
	public TextCell(String text) {
		this.text = text;
	}
	public String fullCellText() {
		return text;
	}
	public String abbreviatedCellText() {
		String shorttext = text.substring(0, 10);
		return shorttext;
		
	}
	

}
