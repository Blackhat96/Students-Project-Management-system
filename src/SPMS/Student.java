package project_management;

import java.awt.Color;

import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Font;
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import net.miginfocom.swing.MigLayout;

import javax.swing.JPopupMenu;

import java.awt.Component;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.SwingConstants;

public class Student extends JFrame implements ActionListener {
	JFrame f=new JFrame();
	private JTextField textField;
	JButton btnSignIn = new JButton("Sign in");
	private JPasswordField passwordField;
	JLabel lblClickToView = new JLabel("Click to view Messages");
    JButton btnNewButton = new JButton("");
    private JTextField textField_1;
    JLabel lblEnterYourUsn = new JLabel("Enter your USN:");
    JButton button = new JButton("");
    int a=0;
    JButton btnNotifications;
    private JTextField textField_2;
    private JTextField textField_3;
    JButton btnSignUp = new JButton("Sign Up");
    JLabel label_3 = new JLabel("");
     

	      
	@SuppressWarnings("static-access")
	public Student()
	{
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setTitle("Student");
		f.setBounds(0,0,1366,768);//(x,y,width,height)
		f.setVisible(true);
        f.getContentPane().setBackground(UIManager.getColor("ProgressBar.shadow"));//background color is given which is nonstatic funtion
        f.getContentPane().setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.WHITE);
        panel_1.setForeground(Color.WHITE);
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        textField = new JTextField();
        textField.setFont(new Font("Georgia", Font.BOLD, 12));
        textField.setBounds(941, 71, 94, 20);
        panel_1.add(textField);
        textField.setColumns(10);
        btnSignIn.setFont(new Font("Georgia", Font.BOLD, 12));
        btnSignIn.setBounds(1244, 70, 80, 23);
        panel_1.add(btnSignIn);
        btnSignIn.setBackground(Color.BLUE);
        btnSignIn.setToolTipText("");
        btnSignIn.setForeground(Color.BLACK);
        
        JLabel lblUsn = new JLabel("Group Id:");
        lblUsn.setForeground(Color.WHITE);
        lblUsn.setBounds(861, 66, 70, 29);
        panel_1.add(lblUsn);
        lblUsn.setFont(new Font("Georgia", Font.BOLD, 13));
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setForeground(Color.WHITE);
        lblPassword.setFont(new Font("Georgia", Font.BOLD, 13));
        lblPassword.setBounds(1045, 73, 80, 14);
        panel_1.add(lblPassword);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setBounds(381, 102, 969, 627);
        panel_1.add(lblNewLabel);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Georgia", Font.BOLD, 12));
        passwordField.setBounds(1124, 71, 94, 20);
        panel_1.add(passwordField);
        
        JLabel label = new JLabel("");
        label.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        label.setBounds(0, 0, 1350, 102);
        panel_1.add(label);
        btnSignIn.addActionListener(this);
        
        JPanel panel = new JPanel();
        panel.setForeground(Color.WHITE);
        panel.setBounds(0, 102, 1350, 627);
        f.getContentPane().add(panel);
        panel.setLayout(null);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBounds(0, 0, 1350, 627);
        panel.add(panel_2);
        panel_2.setLayout(null);
        
        btnNewButton.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\new-message-icon.png"));
        btnNewButton.setBounds(37, 181, 233, 148);
        panel_2.add(btnNewButton);
        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 16));
        btnNewButton.addActionListener(this);
         
        lblClickToView.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblClickToView.setBounds(37, 166, 152, 14);
        panel_2.add(lblClickToView);
        
        textField_1 = new JTextField();
        textField_1.setFont(new Font("Georgia", Font.BOLD, 12));
        textField_1.setVisible(false);
        textField_1.setBounds(431, 164, 98, 20);
        panel_2.add(textField_1);
        textField_1.setColumns(10);
        
        lblEnterYourUsn.setVisible(false);
        lblEnterYourUsn.setFont(new Font("Georgia", Font.BOLD, 12));
        lblEnterYourUsn.setBounds(302, 167, 119, 14);
        panel_2.add(lblEnterYourUsn);
        
       
        button.setVisible(false);
        button.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Login.png"));
        button.setBounds(550, 155, 33, 33);
        panel_2.add(button);
        
        btnNotifications = new JButton("Notifications");
        btnNotifications.setForeground(new Color(255, 0, 0));
        btnNotifications.setFont(new Font("Georgia", Font.BOLD, 14));
        btnNotifications.setBounds(1188, 11, 152, 23);
        panel_2.add(btnNotifications);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBackground(Color.WHITE);
        panel_3.setBounds(1071, 120, 269, 286);
        panel_2.add(panel_3);
        panel_3.setLayout(null);
        
        JLabel lblNewLabel_1 = new JLabel("");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\EditProfile(1).png"));
        lblNewLabel_1.setBounds(10, 11, 75, 75);
        panel_3.add(lblNewLabel_1);
        
        JLabel lblNewLabel_2 = new JLabel("Name:");
        lblNewLabel_2.setFont(new Font("Georgia", Font.BOLD, 16));
        lblNewLabel_2.setBounds(20, 99, 60, 26);
        panel_3.add(lblNewLabel_2);
        
        JLabel lblUsn_1 = new JLabel("USN:");
        lblUsn_1.setFont(new Font("Georgia", Font.BOLD, 16));
        lblUsn_1.setBounds(20, 147, 65, 26);
        panel_3.add(lblUsn_1);
        
        textField_2 = new JTextField();
        textField_2.setBounds(90, 104, 149, 23);
        panel_3.add(textField_2);
        textField_2.setColumns(10);
        
        textField_3 = new JTextField();
        textField_3.setColumns(10);
        textField_3.setBounds(90, 147, 149, 23);
        panel_3.add(textField_3);
        
        JLabel label_2 = new JLabel("*");
        label_2.setForeground(Color.RED);
        label_2.setFont(new Font("Tahoma", Font.BOLD, 16));
        label_2.setBounds(62, 148, 23, 22);
        panel_3.add(label_2);
        
        JLabel label_1 = new JLabel("*");
        label_1.setForeground(Color.RED);
        label_1.setFont(new Font("Tahoma", Font.BOLD, 16));
        label_1.setBounds(74, 97, 23, 22);
        panel_3.add(label_1);
        
        btnSignUp.setBackground(Color.GREEN);
        btnSignUp.setFont(new Font("Tahoma", Font.BOLD, 13));
        btnSignUp.setForeground(Color.WHITE);
        btnSignUp.setBounds(90, 229, 89, 23);
        panel_3.add(btnSignUp);
        label_3.setForeground(Color.GREEN);
        
        label_3.setFont(new Font("Georgia", Font.BOLD, 12));
        label_3.setBounds(30, 184, 229, 22);
        panel_3.add(label_3);
        
        button.addActionListener(this);
        btnNotifications.addActionListener(this);
        btnSignUp.addActionListener(this);
	
	}
	public static void main(String[] args) {
		
		Student s1=new Student();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String gid=textField.getText();
	       String pass=passwordField.getText(),psd=null;
		
		String gname=null,pname=null,desc=null;
		if(arg0.getSource().equals(btnSignIn)){
			 try {
				 	Class.forName("oracle.jdbc.driver.OracleDriver");
				      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				      ResultSet rs;
				       Statement stmt=con.createStatement();  
				        String str=("select * from groups where g_id='"+gid+"'");        										
				    	 rs=stmt.executeQuery(str);
				    	 if(!rs.next())
							 JOptionPane.showMessageDialog(null,"Group Id Not Found!");
							else
							{
								    gname=rs.getString("g_name");
							        pname=rs.getString("p_name");
							        desc=rs.getString("description");
							        psd=rs.getString("g_password");
							}					        
						if(pass.equals(psd))
							 new Student_option(gid,pname,gname,desc);
								con.close();
				 } catch (ClassNotFoundException | SQLException e) {
					 JOptionPane.showMessageDialog(null,e.getMessage());
						
				}  	
			  }
		
		if(arg0.getSource().equals(btnNotifications))
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
			      ResultSet rs;
			        Statement stmt=con.createStatement();
			       
			   	 JOptionPane.showMessageDialog(null,"Na bande");
					
			        String str=("select notify from groups");        		
			        rs=stmt.executeQuery(str);
			    
			        if(!rs.next())
						 JOptionPane.showMessageDialog(null,"No Notifications");
						else
						{			desc=rs.getString("notify");
						JOptionPane.showMessageDialog(null,desc);
						}
			        con.close();
			 } catch (ClassNotFoundException | SQLException e) {
				 JOptionPane.showMessageDialog(null,e.getMessage());
				 
			 }	
		
		}
		
		if(arg0.getSource().equals(btnSignUp))
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
			        Statement stmt=con.createStatement();
			       
			   	 JOptionPane.showMessageDialog(null,"Add student");
			   	 String name=textField_2.getText();
			   	String usn=textField_3.getText();
			    
			   	JOptionPane.showMessageDialog(null,name);

			   	JOptionPane.showMessageDialog(null,usn);
			   	int a=0;
			     String str=("Insert into student values('"+usn+"','"+name+"','"+a+"',null,null)");        		
			      stmt.executeQuery(str);
			         label_3.setText("Student Enrolled successfully");
			       con.close();
			 } catch (ClassNotFoundException | SQLException e) {
				 JOptionPane.showMessageDialog(null,e.getMessage());
				 JOptionPane.showMessageDialog(null,"Student already Enrolled");		 
			 }	
		
		}
		
		
		
		if(arg0.getSource().equals(btnNewButton))
		{
			a=1;
			btnNewButton.setVisible(false);
			lblClickToView.setVisible(false);
			textField_1.setVisible(true);
	        lblEnterYourUsn.setVisible(true);
	        button.setVisible(true);
	     }
		
		if(arg0.getSource().equals(button) && a==1)
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
			      ResultSet rs;
			        Statement stmt=con.createStatement();

			        String usn=textField_1.getText();
			        String str=("select message from student where s_usn='"+usn+"'");        		
			        rs=stmt.executeQuery(str);
			    
			        if(!rs.next())
						 JOptionPane.showMessageDialog(null,"No message For you");
						else
						{			desc=rs.getString("message");
						JOptionPane.showMessageDialog(null,desc);
						}
			        con.close();
			 } catch (ClassNotFoundException | SQLException e) {
				 JOptionPane.showMessageDialog(null,e.getMessage());
			 }	
		}
					
	}
}
