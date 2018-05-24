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
		String shorttext = text;
		if(text.length() < 10) {
			for(int i= text.length(); i<=10; i++)
				shorttext += " ";
		}
		shorttext = shorttext.substring(0, 10);
		return shorttext;
		
	}
	

}
