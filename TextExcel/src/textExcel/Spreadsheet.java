package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid{
	
	private int numOfrows;
	private int numOfcols;
	private Cell [][] Spreadsheet;
	
	public Spreadsheet () {
		
		this.numOfrows = 20;
		this.numOfcols = 12;
		Spreadsheet = new EmptyCell[numOfrows][numOfcols];
	}
	
	
	
	@Override
	public String processCommand(String command)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int getRows()
	{
		// TODO Auto-generated method stub
		return
	}

	@Override
	public int getCols()
	{
		// TODO Auto-generated method stub
		return
	}

	@Override
	public Cell getCell(Location loc)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getGridText()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
