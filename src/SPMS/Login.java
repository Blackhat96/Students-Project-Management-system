package project_management;

import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;

public class Login extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JPasswordField passwordField;
	JLabel lbl = new JLabel("");
	JPanel panel = new JPanel();
	JLabel lblLoginAs = new JLabel("Login  as:");
	JButton button = new JButton("");
        JButton button_1 = new JButton("");
	JButton button_2 = new JButton("");
	JLabel lblWelcomeToDatabase = new JLabel("Welcome To Project Database");
	JLabel label_1 = new JLabel("");
	int a=11;
	

	/**
	 * Create the frame.
	 */
	public Login() {
		setTitle("Project Management");
		setForeground(SystemColor.controlLtHighlight);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(0, 0,1366, 768);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.text);
		contentPane.setForeground(SystemColor.desktop);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel.setForeground(Color.LIGHT_GRAY);
		panel.setBounds(0, 0, 1366, 768);
		contentPane.add(panel);
		panel.setLayout(null);
		
		lblLoginAs.setForeground(new Color(255, 255, 255));
		lblLoginAs.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 17));
		lblLoginAs.setBackground(new Color(240, 240, 240));
		lblLoginAs.setBounds(351, 409, 101, 32);
		panel.add(lblLoginAs);
		
		button.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\Teacher.png"));
		button.setBounds(481, 357, 128,128);
		panel.add(button);
		button.addActionListener(this);
		button.setActionCommand("Teacher");
		
		button_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\Student.png"));
		button_1.setBounds(696, 357, 128, 128);
		panel.add(button_1);
		button_1.addActionListener(this);
		button_1.setActionCommand("Student");
    	
		passwordField = new JPasswordField();
		passwordField.setBounds(585, 555, 138, 24);
		panel.add(passwordField);
		passwordField.setVisible(false);
		
		button_2.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\Login.png"));
		button_2.setBounds(750, 555, 30, 26);
		panel.add(button_2);
		button_2.addActionListener(this);
		button_2.setVisible(false);		
		
		lbl.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 16));
		lbl.setForeground(SystemColor.control);
		lbl.setBounds(510, 506, 283, 18);
		panel.add(lbl);
		
		lblWelcomeToDatabase.setForeground(new Color(255, 69, 0));
		lblWelcomeToDatabase.setFont(new Font("Georgia", Font.BOLD | Font.ITALIC, 50));
		lblWelcomeToDatabase.setBounds(42, 37, 833, 105);
		panel.add(lblWelcomeToDatabase);
		
		label_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\a.png"));
		label_1.setBounds(0, 0, 1366, 768);
		panel.add(label_1);
	}
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
     		Login frame = new Login();
		frame.setVisible(true);
			
	}

	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String pass=passwordField.getText();
		button_2.setVisible(true);
		passwordField.setVisible(true);
	
		if(arg0.getSource().equals(button))
 		{
			a=1;
			lbl.setText("Enter  Faculty  password");	  
			
 		}
 		else if(arg0.getSource().equals(button_1))
 		{
 			a=0;
 			lbl.setText("Enter  Students  password");	  
 		}
		if(pass.equals("123") && arg0.getSource().equals(button_2) && a==1)
		    new Faculty();
		else if(arg0.getSource().equals(button_2) && a==1)
		JOptionPane.showMessageDialog(null,"Invalid Faculty password");   
		
		if(pass.equals("234") && arg0.getSource().equals(button_2)  && a==0) 
			new Student();   
		else if(arg0.getSource().equals(button_2)  && a==0) 
			 JOptionPane.showMessageDialog(null,"Invalid Student password");
	    
	}		
}
		
