package calculator_app;

import java.awt.EventQueue;
import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;

import javax.swing.JFrame;

public class Main extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4821474059401801373L;

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

	public Main() throws HeadlessException {
		super();
	}

	public Main(GraphicsConfiguration gc) {
		super(gc);
	}

	public Main(String title) throws HeadlessException {
		super(title);
	}

	public Main(String title, GraphicsConfiguration gc) {
		super(title, gc);
	}

}