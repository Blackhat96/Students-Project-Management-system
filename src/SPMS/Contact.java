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

public class Contact extends JFrame implements ActionListener {
	JFrame f=new JFrame();
	private JTextField textField;
	JButton button_1 = new JButton("");
	JLabel lblEnterStudentUsn = new JLabel("Enter Student USN:");
	JPanel panel_2 = new JPanel();
    JTextArea textArea = new JTextArea();
    JButton btnSend = new JButton("Send");
    JLabel label_2 = new JLabel("");
    private final JLabel lblNewLabel = new JLabel("New label");
    String t_id,f_name;
     
	@SuppressWarnings("static-access")
	public Contact(String t_id,String f_name)
	{
		t_id=new String(t_id);
	      f_name=new String(f_name);	  
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	
		f.setTitle("Contact A Student");
		f.setBounds(0,0,1366,768);//(x,y,width,height)
		f.setVisible(true);
        f.getContentPane().setBackground(UIManager.getColor("ProgressBar.shadow"));//background color is given which is nonstatic funtion
        f.getContentPane().setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setForeground(Color.MAGENTA);
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);
    	
        
        JLabel label = new JLabel("");
        label.setForeground(new Color(255, 51, 0));
        label.setFont(new Font("Georgia", Font.BOLD, 13));
        label.setBounds(1145, 75, 165, 25);
        panel_1.add(label);
        label.setText("Hi,"+f_name);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 100);
        
        panel_1.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setForeground(Color.WHITE);
        panel.setBounds(0, 102, 1350, 627);
        f.getContentPane().add(panel);
        panel.setLayout(null);
        
        panel_2.setBackground(new Color(0, 51, 102));
        panel_2.setBounds(949, 58, 391, 410);
        panel.add(panel_2);
        panel_2.setLayout(null);
        panel_2.setVisible(false);
        
        JLabel label_1 = new JLabel("To:");
        label_1.setForeground(Color.LIGHT_GRAY);
        label_1.setBounds(10, 38, 35, 23);
        label_1.setFont(new Font("Georgia", Font.BOLD, 13));
        panel_2.add(label_1);
        label_2.setForeground(Color.WHITE);
        label_2.setFont(new Font("Georgia", Font.BOLD, 13));
        
        label_2.setBounds(55, 38, 257, 23);
        panel_2.add(label_2);
        
        JLabel lblMessage = new JLabel("Message:");
        lblMessage.setForeground(Color.LIGHT_GRAY);
        lblMessage.setBounds(10, 83, 83, 23);
        lblMessage.setFont(new Font("Georgia", Font.BOLD, 13));
        panel_2.add(lblMessage);
        textArea.setFont(new Font("Georgia", Font.BOLD, 14));
        
        textArea.setBounds(20, 117, 356, 168);
        panel_2.add(textArea);
        
        btnSend.setBounds(155, 341, 89, 23);
        panel_2.add(btnSend);
        btnSend.addActionListener(this);
    	
        
        JLabel label_4 = new JLabel("");
        label_4.setBounds(38, 289, 372, 30);
        panel_2.add(label_4);
        
        lblEnterStudentUsn.setFont(new Font("Tahoma", Font.BOLD, 12));
        lblEnterStudentUsn.setBounds(357, 157, 140, 24);
        panel.add(lblEnterStudentUsn);
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 13));
        textField.setBounds(488, 160, 86, 20);
        panel.add(textField);
        textField.setColumns(10);
        
        button_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Login.png"));
        button_1.setBounds(602, 154, 41, 33);
        panel.add(button_1);
        button_1.addActionListener(this);
        
	
	}
	public static void main(String[] args,String t_id,String f_name) {
		
		Contact C=new Contact(t_id,f_name);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String usn=textField.getText();
		String name=null; 
		
		if(arg0.getSource().equals(button_1)){
		 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				      ResultSet rs;
				        Statement stmt=con.createStatement();  
					    String str=("select * from student where S_usn='"+usn+"'");        										
				        rs=stmt.executeQuery(str);
				        if(!rs.next())
				       	 JOptionPane.showMessageDialog(null,"USN Not found");
				       else	
				        {
				    	   {
								
									name=rs.getString("s_name");
		
							}					        
				        	label_2.setText(name);
					        
				        	lblEnterStudentUsn.setVisible(false);
						 button_1.setVisible(false);
						 textField.setVisible(false);
						 panel_2.setVisible(true);
						 //lblNewLabel_1.setVisible(true);
						 	    
				        }
				        con.close();
				    	} catch (ClassNotFoundException | SQLException e) {
					 JOptionPane.showMessageDialog(null,e.getMessage());
						
				}
		}
		
	    	if(arg0.getSource().equals(btnSend))
	    	{
	    		try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				        Statement stmt=con.createStatement();  
						String mess=textArea.getText();
		    	    	
	           String str=("update student set message='"+mess+"'where s_usn='"+usn+"'");
						stmt.executeQuery(str);           
						con.close();

						 JOptionPane.showMessageDialog(null,"Your Message has been sent");
						 btnSend.setVisible(false);
						new Options(t_id,f_name);	
	    		
	    		} 
	    catch (ClassNotFoundException  |SQLException e) {
	    	 JOptionPane.showMessageDialog(null,e.getMessage());
					
	    }
			    	    	}

		}
		

}
