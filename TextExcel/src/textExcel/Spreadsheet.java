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
