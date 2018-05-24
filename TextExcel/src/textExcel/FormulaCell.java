package textExcel;

public class FormulaCell extends RealCell {
	// constructor
	public FormulaCell(String inputNum) {
		super(inputNum);
	}

	public double getDoubleValue() {
		String formula = getInputNum();
		String[] parts = formula.split(" ");
		double result = 0;
		//
		for (int i = 1; i < parts.length - 1; i+=2) {
			double num = Double.parseDouble(parts[i]);
			String operator = parts[i + 1];
			if (operator.equals("*")) {
				result = result * num;
			} else if (operator.equals("/")) {
				result = result / num;
			} else if (operator.equals("+")) {
				result = result + num;
			} else if (operator.equals("-")) {
				result = result - num;
			}
		}
		return result;
	}

	public String abbreviatedCellText() {
		String cellInput = getDoubleValue() + "";
		if (cellInput.length() > 10) {
			return cellInput.substring(0, 10);
		} else {
			return cellInput;
		}
	}
}
