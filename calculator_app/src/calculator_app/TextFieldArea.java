package calculator_app;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class TextFieldArea {
	private JTextField textField;

	public TextFieldArea() {
	}

	public JTextField getTextField() {
		return textField;
	}

	public void setTextField(JTextField textField) {
		this.textField = textField;
	}

	/**
	 * 
	 */
	public void textFieldMethod() {
		setTextField(new JTextField());
		getTextField().setEditable(false);
		getTextField().setHorizontalAlignment(SwingConstants.RIGHT);
		getTextField().setFont(new Font("Tahoma", Font.BOLD, 22));
		getTextField().setColumns(10);
	}
}