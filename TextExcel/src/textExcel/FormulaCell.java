package textExcel;

public class FormulaCell extends RealCell {
	private String [] parts;
	// constructor
	public FormulaCell(String inputNum) {
		super(inputNum);
		this.parts = inputNum.toUpperCase().split(" ");
	}

	public double getDoubleValue() {
		double result = 0;
		double operand = 0;
		result = getValue(parts[1]); 
		//create loop so that the operators would end up after every number 
		for (int i = 3; i < parts.length - 1; i+=2) {
			operand = getValue(parts[i]);
			String operator = parts[i - 1];
			if (operator.equals("*")){
				result *= operand;
			} else if (operator.equals("/")) {
				result /= operand;
			} else if (operator.equals("+")) {
				result += operand;
			} else if (operator.equals("-")) {
				result -= operand;
			}
		}
		return result;
	}
    // make an abbreviatedcellText method to make sure that numbers longer than 10 characters will be truncated
	public String abbreviatedCellText() {
		String cellInput = getDoubleValue() + "";
		if (cellInput.length() > 10) {
			cellInput = cellInput.substring(0, 10);
		} else {
			for(int i = cellInput.length(); i < 10; i++) {
				cellInput += " ";
			}
		}return cellInput;
	}
	public double getValue(String input) {
		double operand = 0;
		operand = Double.parseDouble(input);
		return operand; 
	}
}
