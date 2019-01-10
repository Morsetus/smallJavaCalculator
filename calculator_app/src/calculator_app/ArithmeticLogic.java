package calculator_app;


public class ArithmeticLogic {
	private double number1;
	private double number2;
	private double number3;
	private double result;
	private String answer;

	public ArithmeticLogic() {
	}

	public double getNumber1() {
		return number1;
	}

	public void setNumber1(double number1) {
		this.number1 = number1;
	}

	public double getNumber2() {
		return number2;
	}

	public void setNumber2(double number2) {
		this.number2 = number2;
	}

	public double getNumber3() {
		return number3;
	}

	public void setNumber3(double number3) {
		this.number3 = number3;
	}

	public double getResult() {
		return result;
	}

	public void setResult(double result) {
		this.result = result;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	/**
	 * Created arithmetic logic.
	 * @param calculatorUI TODO
	 * @param x TODO
	 */
	public void arithmetic(CalculatorUI calculatorUI, int x) {
		
		int answer_length;
		
		try {
			setNumber2(Double.parseDouble(calculatorUI.textField.getTextField().getText()));	// Gets and parses textField's content
			if (x == 1) {
				setResult(getNumber1() + getNumber2()); 			// Addition
				setAnswer(String.format("%.2f",getResult())); 	// Formating result with two decimals
				
				calculatorUI.textField.getTextField().setText(getAnswer());				// Initializing textFields content for further use
				
				answer_length = getAnswer().length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(calculatorUI.textField.getTextField().getText());	// Gets textField's content to String 
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					calculatorUI.textField.getTextField().setText(bank);						// Sets modified answer to the textField
	
				}
			} else if (x == 2) {
				setResult(getNumber1() - getNumber2()); 			// Subtraction
				setAnswer(String.format("%.2f",getResult())); 	// Formating result with two decimals
				calculatorUI.textField.getTextField().setText(getAnswer());				// Initializing textFields content for further use
				
				answer_length = getAnswer().length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(calculatorUI.textField.getTextField().getText());	// Gets textField's content to String
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					calculatorUI.textField.getTextField().setText(bank);						// Sets modified answer to the textField
	
				}
			} else if (x == 3) {
				setResult(getNumber1() * getNumber2());				// Multiplication
				setAnswer(String.format("%.2f",getResult())); 	// Formating result with two decimals
				calculatorUI.textField.getTextField().setText(getAnswer());				// Initializing textFields content for further use
				
				answer_length = getAnswer().length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(calculatorUI.textField.getTextField().getText());	// Gets textField's content to String
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					calculatorUI.textField.getTextField().setText(bank);						// Sets modified answer to the textField
				}
			} else if (x == 4) {
				setResult(getNumber1() / getNumber2());				// Division
				setAnswer(String.format("%.2f",getResult()));	// Formating result with two decimals
				calculatorUI.textField.getTextField().setText(getAnswer());				// Initializing textFields content for further use
				
				answer_length = getAnswer().length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(calculatorUI.textField.getTextField().getText());	// Gets textField's content to String
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					calculatorUI.textField.getTextField().setText(bank);						// Sets modified answer to the textField
	
				}
			} 
		} catch (NumberFormatException error) {
			System.out.println("Second number is missing");
			setNumber2(0); 									//If error occurs this will reset number2's value/content
		}
	}

	/**
	 * Checks if number1 is missing.
	 * @param calculatorUI TODO
	 */
	
	public void arithmeticChecker(CalculatorUI calculatorUI) {
		
		try {
			setNumber1(Double.parseDouble(calculatorUI.textField.getTextField().getText()));	// Gets and parses textField's content
			calculatorUI.textField.getTextField().setText("");
		} catch (NumberFormatException error) {
			System.out.println("Number is missing");
			calculatorUI.errorLabel.setText("Error occured. Press C!!");
			setNumber1(0); 										//If error occurs this will reset number1's value/content
		}
	}
}