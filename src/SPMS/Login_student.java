package project_management;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;


public class Login_student extends JFrame implements ActionListener {

	private JPanel contentPane;
	JLabel label = new JLabel("");
    String id,gnme,pnme,pdesc;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args,String gid,String gname,String pname,String desc) {
		Login_student L=new Login_student(gid,gname,pname,desc);
	}

	/**
	 * Create the frame.
	 */
	public Login_student(String gid,String gname,String pname,String desc) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	id=new String(gid);
	gnme=new String(gname);
	pnme=new String(pname);
	pdesc=new String(desc);
		
		
		JFrame f=new JFrame();
		      
			f.setTitle("Students");
			f.setBounds(0,0,1366,768);//(x,y,width,height)
			f.setVisible(true);
	        f.getContentPane().setBackground(UIManager.getColor("ProgressBar.shadow"));//background color is given which is nonstatic funtion
	        f.getContentPane().setLayout(null);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBounds(0, 0, 1350, 102);
	        f.getContentPane().add(panel_1);
	        panel_1.setLayout(null);
	        label.setForeground(new Color(255, 0, 0));
	        label.setFont(new Font("Georgia", Font.BOLD, 13));
	    	
	        
	        label.setBounds(1155, 69, 131, 22);
	        panel_1.add(label);
	        label.setText("Hi,"+gnme);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\Blue-Wallpaper-Hd-37C.jpg"));
	        lblNewLabel.setBounds(0, 0, 1350, 100);
	        panel_1.add(lblNewLabel);
	        
	        JLabel lblGroupName = new JLabel("Group Name :");
	        lblGroupName.setFont(new Font("Georgia", Font.BOLD, 17));
	        lblGroupName.setBounds(129, 152, 151, 28);
	        f.getContentPane().add(lblGroupName);
	        
	        JLabel label_1 = new JLabel("");
	        label_1.setBounds(315, 150, 445, 36);
	        f.getContentPane().add(label_1);
	        label_1.setText(gnme);
	        
	        JLabel lblProjectName = new JLabel("Project Name:");
	        lblProjectName.setFont(new Font("Georgia", Font.BOLD, 17));
	        lblProjectName.setBounds(129, 217, 151, 28);
	        f.getContentPane().add(lblProjectName);
	        
	        JLabel label_2 = new JLabel("");
	        label_2.setBounds(315, 197, 445, 36);
	        f.getContentPane().add(label_2);
	        label_2.setText(pnme);
		       
	        
	        JLabel lblChangeProjectDescription = new JLabel("Edit/Change Project Description:");
	        lblChangeProjectDescription.setFont(new Font("Georgia", Font.BOLD, 17));
	        lblChangeProjectDescription.setBounds(129, 280, 414, 28);
	        f.getContentPane().add(lblChangeProjectDescription);
	        
	        JTextArea textArea = new JTextArea();
	        textArea.setBounds(129, 319, 610, 134);
	        f.getContentPane().add(textArea);
	        textArea.setText(pdesc);
		       
	        JLabel lblnotMoreThan = new JLabel("(not more than 150 words)");
	        lblnotMoreThan.setBounds(139, 304, 175, 14);
	        f.getContentPane().add(lblnotMoreThan);
	        
	        JButton btnSubmit = new JButton("Submit");
	        btnSubmit.setBackground(new Color(0, 0, 205));
	        btnSubmit.setForeground(Color.WHITE);
	        btnSubmit.setBounds(263, 666, 89, 23);
	        f.getContentPane().add(btnSubmit);
	        
	        JButton btnCancel = new JButton("Cancel");
	        btnCancel.setForeground(Color.WHITE);
	        btnCancel.setBackground(new Color(0, 0, 205));
	        btnCancel.setBounds(391, 666, 89, 23);
	        f.getContentPane().add(btnCancel);
	        
	      	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
/*		String pass=passwordField.getText();
	//	  JOptionPane.showMessageDialog(null,"again Student Successfull");
		if(arg0.getSource().equals(button))
 		{
			a=1;
			lbl.setText("Enter  Faculty  password");	  
		
 		}
 	*/		
	}
}
