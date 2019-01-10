package calculator_app;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JRadioButton;

public class Buttons {
	private JButton button;
	private JButton btnC;
	private JButton button_1;
	private JButton button_2;
	private JButton button_3;
	private JButton button_4;
	private JButton button_5;
	private JButton button_6;
	private JButton button_7;
	private JButton button_8;
	private JButton button_9;
	private JButton button_10;
	private JButton button_11;
	private JButton button_12;
	private JButton button_13;
	private JButton button_14;
	private JButton button_15;
	private JButton button_16;
	private JRadioButton rdbtnNewRadioButton;
	private JRadioButton rdbtnNewRadioButton_1;

	public Buttons(JButton button, JButton btnC, JButton button_1, JButton button_2, JButton button_3, JButton button_4,
			JButton button_5, JButton button_6, JButton button_7, JButton button_8, JButton button_9, JButton button_10,
			JButton button_11, JButton button_12, JButton button_13, JButton button_14, JButton button_15,
			JButton button_16, JRadioButton rdbtnNewRadioButton, JRadioButton rdbtnNewRadioButton_1) {
		this.button = button;
		this.btnC = btnC;
		this.button_1 = button_1;
		this.button_2 = button_2;
		this.button_3 = button_3;
		this.button_4 = button_4;
		this.button_5 = button_5;
		this.button_6 = button_6;
		this.button_7 = button_7;
		this.button_8 = button_8;
		this.button_9 = button_9;
		this.button_10 = button_10;
		this.button_11 = button_11;
		this.button_12 = button_12;
		this.button_13 = button_13;
		this.button_14 = button_14;
		this.button_15 = button_15;
		this.button_16 = button_16;
		this.rdbtnNewRadioButton = rdbtnNewRadioButton;
		this.rdbtnNewRadioButton_1 = rdbtnNewRadioButton_1;
	}

	public JButton getButton() {
		return button;
	}

	public void setButton(JButton button) {
		this.button = button;
	}

	public JButton getBtnC() {
		return btnC;
	}

	public void setBtnC(JButton btnC) {
		this.btnC = btnC;
	}

	public JButton getButton_1() {
		return button_1;
	}

	public void setButton_1(JButton button_1) {
		this.button_1 = button_1;
	}

	public JButton getButton_2() {
		return button_2;
	}

	public void setButton_2(JButton button_2) {
		this.button_2 = button_2;
	}

	public JButton getButton_3() {
		return button_3;
	}

	public void setButton_3(JButton button_3) {
		this.button_3 = button_3;
	}

	public JButton getButton_4() {
		return button_4;
	}

	public void setButton_4(JButton button_4) {
		this.button_4 = button_4;
	}

	public JButton getButton_5() {
		return button_5;
	}

	public void setButton_5(JButton button_5) {
		this.button_5 = button_5;
	}

	public JButton getButton_6() {
		return button_6;
	}

	public void setButton_6(JButton button_6) {
		this.button_6 = button_6;
	}

	public JButton getButton_7() {
		return button_7;
	}

	public void setButton_7(JButton button_7) {
		this.button_7 = button_7;
	}

	public JButton getButton_8() {
		return button_8;
	}

	public void setButton_8(JButton button_8) {
		this.button_8 = button_8;
	}

	public JButton getButton_9() {
		return button_9;
	}

	public void setButton_9(JButton button_9) {
		this.button_9 = button_9;
	}

	public JButton getButton_10() {
		return button_10;
	}

	public void setButton_10(JButton button_10) {
		this.button_10 = button_10;
	}

	public JButton getButton_11() {
		return button_11;
	}

	public void setButton_11(JButton button_11) {
		this.button_11 = button_11;
	}

	public JButton getButton_12() {
		return button_12;
	}

	public void setButton_12(JButton button_12) {
		this.button_12 = button_12;
	}

	public JButton getButton_13() {
		return button_13;
	}

	public void setButton_13(JButton button_13) {
		this.button_13 = button_13;
	}

	public JButton getButton_14() {
		return button_14;
	}

	public void setButton_14(JButton button_14) {
		this.button_14 = button_14;
	}

	public JButton getButton_15() {
		return button_15;
	}

	public void setButton_15(JButton button_15) {
		this.button_15 = button_15;
	}

	public JButton getButton_16() {
		return button_16;
	}

	public void setButton_16(JButton button_16) {
		this.button_16 = button_16;
	}

	public JRadioButton getRdbtnNewRadioButton() {
		return rdbtnNewRadioButton;
	}

	public void setRdbtnNewRadioButton(JRadioButton rdbtnNewRadioButton) {
		this.rdbtnNewRadioButton = rdbtnNewRadioButton;
	}

	public JRadioButton getRdbtnNewRadioButton_1() {
		return rdbtnNewRadioButton_1;
	}

	public void setRdbtnNewRadioButton_1(JRadioButton rdbtnNewRadioButton_1) {
		this.rdbtnNewRadioButton_1 = rdbtnNewRadioButton_1;
	}

	/**
	 * @param calculatorUI TODO
	 * 
	 */
	public void buttonsActions(final CalculatorUI calculatorUI) {
		getButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length =  calculatorUI.textField.getTextField().getText().length();
				int number = calculatorUI.textField.getTextField().getText().length() - 1;	// Targets textField's latest character
				
				if (length > 0) {
					StringBuilder back = new StringBuilder(calculatorUI.textField.getTextField().getText()); // StringBuilder is created
					back.deleteCharAt(number);									 // Deleting character from indicated (number) position
					String store = back.toString();								 // Converting content back to the String
					calculatorUI.textField.getTextField().setText(store);									 // Replaces existing textField's content
				}
			}
		});
		getButton().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getBtnC().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(""); 					// Clears textField
				calculatorUI.Label.setText(" "); 					// Clears Label
				calculatorUI.errorLabel.setText(" "); 				// Clears errorLabel
			}
		});
		getBtnC().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_2().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				calculatorUI.Label.setText(calculatorUI.textField.getTextField().getText() + "+");
				/**
				number1 = Double.parseDouble(textField.getText()); 
				arithmeticChecker();
				textField.setText("");*/
				calculatorUI.arithmeticClass.arithmeticChecker(calculatorUI); 	// Calls method
				calculatorUI.operations = 1;						
			}
		});
		getButton_2().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "7");
			}
		});
		getButton_1().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_3().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "8");
			}
		});
		getButton_3().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_4().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "9");
			}
		});
		getButton_4().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_5().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.Label.setText(calculatorUI.textField.getTextField().getText() + "-");
				calculatorUI.arithmeticClass.arithmeticChecker(calculatorUI);
				calculatorUI.operations = 2;
			}
		});
		getButton_5().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_6().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "4");
			}
		});
		getButton_6().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_7().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "5");
			}
		});
		getButton_7().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_8().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "6");
			}
		});
		getButton_8().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_9().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.Label.setText(calculatorUI.textField.getTextField().getText() + "*");
				calculatorUI.arithmeticClass.arithmeticChecker(calculatorUI);
				calculatorUI.operations = 3;
			}
		});
		getButton_9().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_10().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "1");
			}
		});
		getButton_10().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_11().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "2");
			}
		});
		getButton_11().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_12().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "3");
			}
		});
		getButton_12().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_13().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.Label.setText(calculatorUI.textField.getTextField().getText() + "/");
				calculatorUI.arithmeticClass.arithmeticChecker(calculatorUI);
				calculatorUI.operations = 4;
			}
		});
		getButton_13().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_14().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + "0");
			}
		});
		getButton_14().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_15().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.textField.getTextField().setText(calculatorUI.textField.getTextField().getText() + ".");
			}
		});
		getButton_15().setFont(new Font("Tahoma", Font.BOLD, 15));
		
		getButton_16().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				calculatorUI.arithmeticClass.arithmetic(calculatorUI, calculatorUI.operations);		// Calls method
	
			}
		});
		getButton_16().setFont(new Font("Tahoma", Font.BOLD, 15));	
		
		calculatorUI.buttonGroup.add(getRdbtnNewRadioButton());
		getRdbtnNewRadioButton().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.buttons.switcher(calculatorUI, true);				// Calls method with boolean value
			}
		});
		getRdbtnNewRadioButton().setFont(new Font("Tahoma", Font.BOLD, 11));
		
		calculatorUI.buttonGroup.add(getRdbtnNewRadioButton_1());
		getRdbtnNewRadioButton_1().addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculatorUI.buttons.switcher(calculatorUI, false);			// Calls method with boolean value
			}
		});
		getRdbtnNewRadioButton_1().setFont(new Font("Tahoma", Font.BOLD, 11));
	}

	/**
	 * ON/OFF-Buttons functionality.
	 * Disables buttons and textField.
	 * @param calculatorUI TODO
	 * @param b TODO
	 */
	public void switcher(CalculatorUI calculatorUI, boolean b) {
		
		calculatorUI.textField.getTextField().setEnabled(b);
		getBtnC().setEnabled(b);
		getButton().setEnabled(b);
		getButton_1().setEnabled(b);
		getButton_2().setEnabled(b);
		getButton_3().setEnabled(b);
		getButton_4().setEnabled(b);
		getButton_5().setEnabled(b);
		getButton_6().setEnabled(b);
		getButton_7().setEnabled(b);
		getButton_8().setEnabled(b);
		getButton_9().setEnabled(b);
		getButton_10().setEnabled(b);
		getButton_11().setEnabled(b);
		getButton_12().setEnabled(b);
		getButton_13().setEnabled(b);
		getButton_14().setEnabled(b);
		getButton_15().setEnabled(b);
		getButton_16().setEnabled(b);
		
	}
}