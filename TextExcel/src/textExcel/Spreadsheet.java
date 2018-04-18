package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	
	private int numOfrows;
	private int numOfcols;
	private Cell [][] Spreadsheet;
	
	
	
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return "";
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return 20;
	}

	@Override
	public int getCols()
	{
		return 12;
		// TODO Auto-generated method stub
	}

	@Override
	public Cell getCell(Location loc){
		// TODO Auto-0''generated method stub
		return (a,b);
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
		}
		
		 //put abbreviatedcell text
		// TODO Auto-generated method stub
		return null;
	}
	public abstract class Spreadsheet implements getCell{
		
	}

}
