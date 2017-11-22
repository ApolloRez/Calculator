package Calculator_;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField textDisplay;
	
	private double number1;
	private double number2;
	private double result;
	private String operation;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame("Calculator");
		frame.getContentPane().setForeground(Color.GRAY);
		frame.getContentPane().setBackground(Color.DARK_GRAY);
		frame.setBounds(100, 100, 290, 415);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textDisplay = new JTextField();
		textDisplay.setFont(new Font("Tahoma", Font.BOLD, 18));
		textDisplay.setHorizontalAlignment(SwingConstants.TRAILING);
		textDisplay.setBounds(10, 5, 255, 35);
		frame.getContentPane().add(textDisplay);
		textDisplay.setColumns(10);
		
	//Row One (Clear,Backspace,Percent,Plus)
		JButton btnBackSpace;
		btnBackSpace = new JButton("\uF0E7");
		btnBackSpace.setFont(new Font("Wingdings", Font.PLAIN, 17));
		btnBackSpace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent args0) {
				String backspace = null;
				if(textDisplay.getText().length() > 0) {
					StringBuilder str1 = new StringBuilder(textDisplay.getText());
					str1.deleteCharAt(textDisplay.getText().length() - 1);
					backspace = str1.toString();
					textDisplay.setText(backspace);
				}
			}
		});
		btnBackSpace.setBounds(10, 45, 60, 60);
		frame.getContentPane().add(btnBackSpace);
		
		JButton btnClear;
		btnClear = new JButton("C");
		btnClear.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textDisplay.setText(null);
			}
		});
		btnClear.setBounds(75, 45, 60, 60);
		frame.getContentPane().add(btnClear);
		
		JButton btnPercent;
		btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "%";
			}
		});
		btnPercent.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPercent.setBounds(140, 45, 60, 60);
		frame.getContentPane().add(btnPercent);
		
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "+";
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnPlus.setBounds(205, 45, 60, 60);
		frame.getContentPane().add(btnPlus);
	//Row Two (7,8,9,-)
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn7.getText();
				textDisplay.setText(number);
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn7.setBounds(10, 110, 60, 60);
		frame.getContentPane().add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn8.getText();
				textDisplay.setText(number);
			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn8.setBounds(75, 110, 60, 60);
		frame.getContentPane().add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn9.getText();
				textDisplay.setText(number);
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn9.setBounds(140, 110, 60, 60);
		frame.getContentPane().add(btn9);
		
		JButton btnMinus = new JButton("-");
		btnMinus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "-";
			}
		});
		btnMinus.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMinus.setBounds(205, 110, 60, 60);
		frame.getContentPane().add(btnMinus);
		
	//Row Three (4,5,6 *)
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn4.getText();
				textDisplay.setText(number);
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn4.setBounds(10, 175, 60, 60);
		frame.getContentPane().add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn5.getText();
				textDisplay.setText(number);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn5.setBounds(75, 175, 60, 60);
		frame.getContentPane().add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn6.getText();
				textDisplay.setText(number);
			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn6.setBounds(140, 175, 60, 60);
		frame.getContentPane().add(btn6);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "*";
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnMult.setBounds(205, 175, 60, 60);
		frame.getContentPane().add(btnMult);
		
	//Row Four (1,2,3,Divide)
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn1.getText();
				textDisplay.setText(number);
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn1.setBounds(10, 240, 60, 60);
		frame.getContentPane().add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn2.getText();
				textDisplay.setText(number);
			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn2.setBounds(75, 240, 60, 60);
		frame.getContentPane().add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn3.getText();
				textDisplay.setText(number);
			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn3.setBounds(140, 240, 60, 60);
		frame.getContentPane().add(btn3);
		
		JButton btnDivide = new JButton("/");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				number1 = Double.parseDouble(textDisplay.getText());
				textDisplay.setText("");
				operation = "/";
			}
		});
		btnDivide.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDivide.setBounds(205, 240, 60, 60);
		frame.getContentPane().add(btnDivide);
		
	//Row Five (0,.,+-,=)
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btn0.getText();
				textDisplay.setText(number);
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 20));
		btn0.setBounds(10, 305, 60, 60);
		frame.getContentPane().add(btn0);
		
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String number = textDisplay.getText() + btnDot.getText();
				textDisplay.setText(number);
			}
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnDot.setBounds(75, 305, 60, 60);
		frame.getContentPane().add(btnDot);
		
		JButton btnNeg = new JButton("±");
		btnNeg.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double temp = Double.parseDouble(String.valueOf(textDisplay.getText()));
				temp = temp * -1;
				if(temp == 0)
					textDisplay.setText("Error");
				else 
					textDisplay.setText(String.valueOf(temp));
					
			}
		});
		btnNeg.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnNeg.setBounds(140, 305, 60, 60);
		frame.getContentPane().add(btnNeg);
		
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				String answer;
				number2 = Double.parseDouble(textDisplay.getText());
				if(operation == "+")
				{
					result = number1 + number2;
					answer = String.format("%.3f",result);
					textDisplay.setText(answer);
				}
				else if(operation == "-")
				{
					result = number1 - number2;
					answer = String.format("%.3f",result);
					textDisplay.setText(answer);
				}
				else if( operation == "*")
				{
					result = number1 * number2;
					answer = String.format("%.3f",result);
					textDisplay.setText(answer);
				}
				else if( operation == "/" )
				{
					result = number1 / number2;
					answer = String.format("%.3f",result);
					textDisplay.setText(answer);
				}
				else if( operation == "%")
				{
					result = number1 / number2 * 100;
					answer = String.format("%.3f",result);
					textDisplay.setText(answer);
				}
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnEqual.setBounds(205, 305, 60, 60);
		frame.getContentPane().add(btnEqual);
	}
}
