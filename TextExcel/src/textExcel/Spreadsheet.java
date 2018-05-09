/*Kaitlyn Endo
 */

package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	
	private int numOfrows;
	private int numOfcols;
	private Cell [][] gridCell;
	public Spreadsheet() {
		gridCell=new Cell [2][12];
		for(int i=0;i<gridCell.length;i++) {
			for(int j=0;j<gridCell [i].length;j++){
			}
		}
	}
	
	@Override
	public String processCommand(String command) {
		if(command.toLowerCase().equals("clear")) {
			return getGridText();
		}
		else if(command.contains("=")) {
			assignCell(command);
			return getGridText();
		}
		else if(command.length()==2||command.length()==3) {
			Location position=new SpreadsheetLocation(command);
			return inspectCell(position);
		}
		else if(command.toLowerCase().contains("clear")&& command.length()>3) {
			Location position=new SpreadsheetLocation(command.substring(6));
			clearCell(position);
			return getGridText();
		}
		else {
			return "";
		}
	}
	//cell inspection
	public String inspectCell(Location loc) {
		return getCell(loc).fullCellText();
	}
	//assign string values
	public String assignCell(String input) {
		String[] assignment=input.split("=",2);
		Location loc=new SpreadsheetLocation(assignment[0].substring(0, assignment[0].indexOf(" ")));
		//text cell; quotes
		if (assignment[1].contains("\"")) {
			gridCell[loc.getRow()][loc.getCol()]=new TextCell(assignment[1].substring(1));
		} //percent cell; %
		else if(assignment[1].contains("%")) {
			gridCell[loc.getRow()][loc.getCol()]=new PercentCell(assignment[1].substring(1));
		}//formula cell; parentheses
		else if(assignment[1].contains("(")&&assignment [1].contains(")")) {
			gridCell[loc.getRow()][loc.getCol()]= new FormulaCell(assignment[1].substring(1));
		}//value cell; other cases
		else {
			gridCell[loc.getRow()][loc.getCol()]=new ValueCell(assignment [1].substring(1));
		}
		return getGridText();
	}
	//clear sheet
	public void clearCell(Location loc) {
		SpreadsheetLocation clearCell = new SpreadsheetLocation(clearCell);
		gridCell[clearCell.getRow()][clearCell.getCol()] = new EmptyCell();
		return;
	}

	@Override
	public int getRows(){
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols(){
		return 12;
		// TODO Auto-generated method stub
	}
	
	public Cell getCell(Location loc) {
		return gridCell[loc.getRow()][loc.getCol()];
	}


	@Override
	public String getGridText() 
	{
		String result ="";
		result +="   |";
		for(int i=65; i<=76; i++) {
			result+= (char)i;
			for(int k=0; k<9; k++) {
				result +="";
			}
			result +="|";
		
		}
		result +="\n";
		for(int a=1; a<= 20; a++) {
			if(a<10) {
				result += a+" ";
			}
			else {
				result += a+" ";
			}
			result +="|";
			for(int j=0;j<12; j++) {
				result +=gridCell[a-1][j].abbreviatedCellText();
				result +="|";
			}
			result +="\n";
		}
		return result;
		
		// TODO Auto-generated method stub
	}
	public Cell[][] getGridCell(){
		return gridCell;
		
		
		
	}

}
