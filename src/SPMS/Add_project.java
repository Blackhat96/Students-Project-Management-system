package project_management;
import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.JCheckBox;
import javax.swing.JSplitPane;

import java.awt.Component;

import javax.swing.Box;

import java.awt.Canvas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ImageIcon;

public class Add_project extends JFrame implements ActionListener {
	JFrame f=new JFrame();
      private JTextField P_name;
      private JTextField Usn1;
      private JTextField Usn2;
      private JTextField Usn3;
      private JTextField Usn4;
      private JTextField G_name;
      JButton btnSubmit = new JButton("Submit");
      private JLabel label1;
      private JLabel label2;
      private JLabel lblEnterPassword;
      private JLabel lblRenterpassword;
      private JPasswordField passwordField;
      private JPasswordField passwordField_1;
      private JLabel label3;
      String Gid,id,name;
      int count,a=0;
      
	@SuppressWarnings("static-access")
	public Add_project(String t_id,String f_name)
	{
		name=new String(f_name);
		id=new String(t_id);
		
		f.setTitle("Add Project");
		f.setBounds(0,0,1366,768);//(x,y,width,height)
		f.setVisible(true);
        f.getContentPane().setBackground(Color.WHITE);//background color is given which is nonstatic funtion
        f.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0, 0, 734, -15);
        f.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel Login_label = new JLabel("");
        Login_label.setForeground(new Color(255, 51, 0));
        Login_label.setFont(new Font("Georgia", Font.BOLD, 13));
        Login_label.setBounds(1151, 77, 156, 25);
        panel_1.add(Login_label);
        Login_label.setText("Hi,"+name);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 102);
        panel_1.add(lblNewLabel);
        
        JLabel lblEnterGroupName = new JLabel("Enter Group Name:");
        lblEnterGroupName.setFont(new Font("Georgia", Font.BOLD, 18));
        lblEnterGroupName.setBounds(61, 264, 214, 32);
        f.getContentPane().add(lblEnterGroupName);
        
        JLabel lblEnterProjectName = new JLabel("Enter Project Name:");
        lblEnterProjectName.setFont(new Font("Georgia", Font.BOLD, 18));
        lblEnterProjectName.setBounds(61, 177, 214, 32);
        f.getContentPane().add(lblEnterProjectName);
        
        P_name = new JTextField();
        P_name.setFont(new Font("Georgia", Font.BOLD, 13));
        P_name.setBounds(300, 178, 325, 32);
        f.getContentPane().add(P_name);
        P_name.setColumns(10);
        
        JLabel lblUsn = new JLabel("USN:");
        lblUsn.setFont(new Font("Georgia", Font.BOLD, 18));
        lblUsn.setBounds(71, 348, 78, 32);
        f.getContentPane().add(lblUsn);
        
        Usn1 = new JTextField();
        Usn1.setFont(new Font("Georgia", Font.BOLD, 13));
        Usn1.setColumns(10);
        Usn1.setBounds(300, 348, 261, 32);
        f.getContentPane().add(Usn1);
        
        Usn2 = new JTextField();
        Usn2.setFont(new Font("Georgia", Font.BOLD, 13));
        Usn2.setColumns(10);
        Usn2.setBounds(300, 415, 261, 32);
        f.getContentPane().add(Usn2);
        
        Usn3 = new JTextField();
        Usn3.setFont(new Font("Georgia", Font.BOLD, 13));
        Usn3.setColumns(10);
        Usn3.setBounds(300, 480, 261, 32);
        f.getContentPane().add(Usn3);
        
        Usn4 = new JTextField();
        Usn4.setFont(new Font("Georgia", Font.BOLD, 13));
        Usn4.setColumns(10);
        Usn4.setBounds(300, 544, 261, 32);
        f.getContentPane().add(Usn4);
        
        G_name = new JTextField();
        G_name.setFont(new Font("Georgia", Font.BOLD, 13));
        G_name.setColumns(10);
        G_name.setBounds(300, 265, 325, 32);
        f.getContentPane().add(G_name);
        btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        btnSubmit.setBounds(888, 543, 106, 32);
        f.getContentPane().add(btnSubmit);
        btnSubmit.addActionListener(this);
        
        label1 = new JLabel("");
        label1.setForeground(Color.RED);
        label1.setBounds(300, 212, 325, 14);
        f.getContentPane().add(label1);
  
        
        label2 = new JLabel("");
        label2.setForeground(Color.RED);
        label2.setBounds(300, 299, 325, 14);
        f.getContentPane().add(label2);
        
        lblEnterPassword = new JLabel("Password:");
        lblEnterPassword.setFont(new Font("Georgia", Font.BOLD, 18));
        lblEnterPassword.setBounds(847, 348, 117, 32);
        f.getContentPane().add(lblEnterPassword);
        
        lblRenterpassword = new JLabel("Renter-Password:");
        lblRenterpassword.setFont(new Font("Georgia", Font.BOLD, 18));
        lblRenterpassword.setBounds(780, 400, 184, 32);
        f.getContentPane().add(lblRenterpassword);
        
        passwordField = new JPasswordField();
        passwordField.setFont(new Font("Georgia", Font.BOLD, 13));
        passwordField.setBounds(974, 355, 106, 20);
        f.getContentPane().add(passwordField);
        
        passwordField_1 = new JPasswordField();
        passwordField_1.setFont(new Font("Georgia", Font.BOLD, 13));
        passwordField_1.setBounds(974, 403, 106, 20);
        f.getContentPane().add(passwordField_1);
        
        label3 = new JLabel("");
        label3.setForeground(Color.RED);
        label3.setBounds(87, 623, 278, 14);
        f.getContentPane().add(label3);
    	
        
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	

	}
	public static void main(String[] args,String t_id,String f_name) {
		Add_project O1=new Add_project(t_id,f_name);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String Pj_name=P_name.getText();
		String Gp_name=G_name.getText();
		String usn1=Usn1.getText();
		String usn2=Usn2.getText();
		String usn3=Usn3.getText();
		String usn4=Usn4.getText();
		String pass= passwordField.getText();
		String repass= passwordField_1.getText();
		Connection con = null;
int error=0;
		if(arg0.getSource().equals(btnSubmit)) 
	{	 
			if(Pj_name.length()==0)
			{
				label1.setText("Enter your Project Name"); 
			error=1;
			}
			else if(Gp_name.length()==0)
		 { 
			 label1.setText(""); 
			 label2.setText("Enter your Group Name"); 
				error=1;
				
		 }
			 else if(usn1.length()==0)
			 {	   	 label3.setText("Enter 1st Student USN");
				error=1;
				
			 }
			
			else if(usn2.length()==0)
			{
				label3.setText("Enter 2nd Student USN");
				error=1;
				
			}
		 else if( pass.equals(repass)==false || pass.length()==0)
		 {
		   	 label3.setText("Enter correct Password");
		 error=1;
		 } 
		 else
			 error=0;
	}
		 if(error==0  && a==0)
		 {
			 a++;
			 JOptionPane.showMessageDialog(null,"Adding a Project");	 
			    	 
			 try {
				 Class.forName("oracle.jdbc.driver.OracleDriver");
				      con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				        Statement stmt=con.createStatement();
				        group_id();
				        
				        JOptionPane.showMessageDialog(null,"1");	 	
				        String str=("Insert into groups values('"+Gid+"','"+id+"','"+Gp_name+"','"+Pj_name+"','"+pass+"',null,null)");        
				        stmt.executeQuery(str);  		        			        
				        JOptionPane.showMessageDialog(null,"1.1");	 				                
				         str=("Insert into grp_member values('"+Gid+"','"+usn1+"')");        
				        stmt.executeQuery(str);  		        			        
				        //con.commit();
				    
    JOptionPane.showMessageDialog(null,"1.2");	 
        str=("Insert into grp_member values('"+Gid+"','"+usn2+"')");        
    stmt.executeQuery(str);  		        			        
  
JOptionPane.showMessageDialog(null,"2");	 
if(usn3.length()!=0)
{        
	   str=("Insert into grp_member values('"+Gid+"','"+usn3+"')");        
	    stmt.executeQuery(str);  		      			        
	JOptionPane.showMessageDialog(null,"3");	 

}
if(usn4.length()!=0)
{   str=("Insert into grp_member values('"+Gid+"','"+usn4+"')");        
stmt.executeQuery(str);  		      
JOptionPane.showMessageDialog(null,"4");	 

}

label3.setText("Project/Group Added Successfully");

btnSubmit.setVisible(false);
JOptionPane.showMessageDialog(null,"Your Group id is:"+Gid);	 
con.close();
				 
			 }
			 catch (ClassNotFoundException | SQLException e) {
				 try {
					 	con.rollback();
				 		} 
				 catch (SQLException e1) 
				 {

				 }					
					 JOptionPane.showMessageDialog(null,e.getMessage());	 
				 }
	     }

	}


public boolean isDigit(String contact)
{
	if(contact.length()==10)
        return contact.matches("[0-9]+");	
	else
		return false;
}

public void group_id()
{
		try {
			  Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
		      ResultSet rs;
		      CallableStatement cs=null;
		      int count=0;
		      cs=con.prepareCall("{?=call groupid}");		   
		      cs.registerOutParameter(1,Types.INTEGER);
		   	  cs.execute();  				      
		   	  count=cs.getInt(1);
		   	  Gid="c"+count;
		   	JOptionPane.showMessageDialog(null,"Your group id is:"+Gid);	 		
			
		   	  con.close();
		} 
		catch (ClassNotFoundException | SQLException a) {
	//JOptionPane.showMessageDialog(null,"Group name already exists");	 		
			JOptionPane.showMessageDialog(null,a.getMessage());
		}
	}
}





