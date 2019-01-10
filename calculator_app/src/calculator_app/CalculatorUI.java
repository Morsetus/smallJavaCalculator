package calculator_app;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Point;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class CalculatorUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();

	
	double number1;
	double number2;
	double number3;
	double result;
	double ansBank;
	String answer;
	int operations;
	int calc1;
	
	/*Buttons*/
	
	JButton button = new JButton("<--");
	JButton btnC = new JButton("C");
	JButton button_1 = new JButton("7");
	JButton button_2 = new JButton("+");
	JButton button_3 = new JButton("8");
	JButton button_4 = new JButton("9");
	JButton button_5 = new JButton("-");
	JButton button_6 = new JButton("4");
	JButton button_7 = new JButton("5");
	JButton button_8 = new JButton("6");
	JButton button_9 = new JButton("*");
	JButton button_10 = new JButton("1");
	JButton button_11 = new JButton("2");
	JButton button_12 = new JButton("3");
	JButton button_13 = new JButton("/");
	JButton button_14 = new JButton("0");
	JButton button_15 = new JButton(".");
	JButton button_16 = new JButton("=");
	
	JRadioButton rdbtnNewRadioButton = new JRadioButton("ON");
	JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("OFF");
	
	/*Labels*/
	
	JLabel Label = new JLabel(" ");
	JLabel errorLabel = new JLabel(" ");
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorUI frame = new CalculatorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	/**
	 * ON/OFF-Buttons functionality.
	 * Disables buttons and textField.
	 */
	public void switcher(boolean b) {
		
		textField.setEnabled(b);
		btnC.setEnabled(b);
		button.setEnabled(b);
		button_1.setEnabled(b);
		button_2.setEnabled(b);
		button_3.setEnabled(b);
		button_4.setEnabled(b);
		button_5.setEnabled(b);
		button_6.setEnabled(b);
		button_7.setEnabled(b);
		button_8.setEnabled(b);
		button_9.setEnabled(b);
		button_10.setEnabled(b);
		button_11.setEnabled(b);
		button_12.setEnabled(b);
		button_13.setEnabled(b);
		button_14.setEnabled(b);
		button_15.setEnabled(b);
		button_16.setEnabled(b);
		
	}
	
	/**
	 * Created arithmetic logic.
	 */
	public void arithmetic(int x) {
		
		int answer_length;
		
		try {
			number2 = Double.parseDouble(textField.getText());	// Gets and parses textField's content
			if (x == 1) {
				result = number1 + number2; 			// Addition
				answer = String.format("%.2f",result); 	// Formating result with two decimals
				
				textField.setText(answer);				// Initializing textFields content for further use
				
				answer_length = answer.length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(textField.getText());	// Gets textField's content to String 
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					textField.setText(bank);						// Sets modified answer to the textField

				}
			} else if (x == 2) {
				result = number1 - number2; 			// Subtraction
				answer = String.format("%.2f",result); 	// Formating result with two decimals
				textField.setText(answer);				// Initializing textFields content for further use
				
				answer_length = answer.length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(textField.getText());	// Gets textField's content to String
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					textField.setText(bank);						// Sets modified answer to the textField

				}
			} else if (x == 3) {
				result = number1 * number2;				// Multiplication
				answer = String.format("%.2f",result); 	// Formating result with two decimals
				textField.setText(answer);				// Initializing textFields content for further use
				
				answer_length = answer.length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(textField.getText());	// Gets textField's content to String
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					textField.setText(bank);						// Sets modified answer to the textField
				}
			} else if (x == 4) {
				result = number1 / number2;				// Division
				answer = String.format("%.2f",result);	// Formating result with two decimals
				textField.setText(answer);				// Initializing textFields content for further use
				
				answer_length = answer.length();		// Checks answers length
				
				if (answer_length > 0) {
					String back = new String(textField.getText());	// Gets textField's content to String
					String bank = back.replace(',', '.');			// Modifies answers decimal divider "," to "."
					textField.setText(bank);						// Sets modified answer to the textField

				}
			} 
		} catch (NumberFormatException error) {
			System.out.println("Second number is missing");
			number2 = 0; 									//If error occurs this will reset number2's value/content
		}
	}
	
	
	/**
	 * Checks if number1 is missing.
	 */
	
	public void arithmeticChecker() {
		
		try {
			number1 = Double.parseDouble(textField.getText());	// Gets and parses textField's content
			textField.setText("");
		} catch (NumberFormatException error) {
			System.out.println("Number is missing");
			errorLabel.setText("Error occured. Press C!!");
			number1 = 0; 										//If error occurs this will reset number1's value/content
		}
	}

	/**
	 * Create the frame.
	 */
	public CalculatorUI() {
		setLocation(new Point(500, 250));
		setType(Type.UTILITY);
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 298, 332);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField();
		textField.setEditable(false);
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setFont(new Font("Tahoma", Font.BOLD, 22));
		textField.setColumns(10);
		
		Label.setHorizontalAlignment(SwingConstants.RIGHT);
		Label.setForeground(new Color(220, 20, 60));
		
		errorLabel.setHorizontalAlignment(SwingConstants.LEFT);
		errorLabel.setForeground(new Color(255, 0, 0));
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int length =  textField.getText().length();
				int number = textField.getText().length() - 1;	// Targets textField's latest character
				
				if (length > 0) {
					StringBuilder back = new StringBuilder(textField.getText()); // StringBuilder is created
					back.deleteCharAt(number);									 // Deleting character from indicated (number) position
					String store = back.toString();								 // Converting content back to the String
					textField.setText(store);									 // Replaces existing textField's content
				}
			}
		});
		button.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(""); 					// Clears textField
				Label.setText(" "); 					// Clears Label
				errorLabel.setText(" "); 				// Clears errorLabel
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {		
				Label.setText(textField.getText() + "+");
				/**
				number1 = Double.parseDouble(textField.getText()); 
				arithmeticChecker();
				textField.setText("");*/
				arithmeticChecker(); 	// Calls method
				operations = 1;						
			}
		});
		button_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "7");
			}
		});
		button_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "8");
			}
		});
		button_3.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "9");
			}
		});
		button_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label.setText(textField.getText() + "-");
				arithmeticChecker();
				operations = 2;
			}
		});
		button_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "4");
			}
		});
		button_6.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "5");
			}
		});
		button_7.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "6");
			}
		});
		button_8.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label.setText(textField.getText() + "*");
				arithmeticChecker();
				operations = 3;
			}
		});
		button_9.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "1");
			}
		});
		button_10.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "2");
			}
		});
		button_11.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "3");
			}
		});
		button_12.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Label.setText(textField.getText() + "/");
				arithmeticChecker();
				operations = 4;
			}
		});
		button_13.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + "0");
			}
		});
		button_14.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textField.setText(textField.getText() + ".");
			}
		});
		button_15.setFont(new Font("Tahoma", Font.BOLD, 15));
		
		button_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {				
				arithmetic(operations);		// Calls method

			}
		});
		button_16.setFont(new Font("Tahoma", Font.BOLD, 15));	
		
		buttonGroup.add(rdbtnNewRadioButton);
		rdbtnNewRadioButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switcher(true);				// Calls method with boolean value
			}
		});
		rdbtnNewRadioButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		buttonGroup.add(rdbtnNewRadioButton_1);
		rdbtnNewRadioButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				switcher(false);			// Calls method with boolean value
			}
		});
		rdbtnNewRadioButton_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		
		 /* Buttons Components placement at the layout*/
		 	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField, GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(errorLabel)
							.addPreferredGap(ComponentPlacement.RELATED, 246, Short.MAX_VALUE)
							.addComponent(Label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(rdbtnNewRadioButton_1)
								.addComponent(rdbtnNewRadioButton))
							.addGap(18)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 58, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(Label)
						.addComponent(errorLabel))
					.addGap(7)
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 34, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(rdbtnNewRadioButton)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(rdbtnNewRadioButton_1))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(btnC, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(button_2, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
							.addComponent(button, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_1, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_3, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_4, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_5, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_6, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_7, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_8, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_9, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_10, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_11, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_12, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_13, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(button_14, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_15, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
						.addComponent(button_16, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(23, Short.MAX_VALUE))
		);
			
		contentPane.setLayout(gl_contentPane);
	}
	
	
}
