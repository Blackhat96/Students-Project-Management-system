package project_management;
import java.awt.Color;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;

public class Faculty extends JFrame implements ActionListener{
	JFrame f=new JFrame();
	private JTextField txt_id;
	private JPasswordField txt_pass_1;
	private JTextField txt_name;
	private JTextField txt_email;
	private JPasswordField txt_pass;
	private JPasswordField txt_repass;
	private JTextField txt_contact;
	JButton bt_signup = new JButton("Sign Up");
	JButton btnSignIn = new JButton("Sign in");
	JLabel label_9 = new JLabel("");
    int count=0,a=1;
	String Fid=null;
	  JLabel label_10 = new JLabel("");
      
      
      
	@SuppressWarnings("static-access")
	public Faculty()
	{
		f.setTitle("Faculty Login");
		f.setBounds(0,0,1366,768);
		f.setVisible(true);
        f.getContentPane().setBackground(new Color(204, 204, 255));
        f.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0, 0, 734, -15);
        f.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        txt_id = new JTextField();
        txt_id.setBounds(965, 59, 102, 20);
        panel_1.add(txt_id);
        txt_id.setColumns(10);
        
        JLabel lblUsn = new JLabel("Faculty Id:");
        lblUsn.setForeground(new Color(255, 69, 0));
        lblUsn.setFont(new Font("Georgia", Font.BOLD, 13));
        lblUsn.setBounds(882, 60, 83, 17);
        panel_1.add(lblUsn);
        
        JLabel lblPassword = new JLabel("Password:");
        lblPassword.setForeground(new Color(255, 69, 0));
        lblPassword.setFont(new Font("Georgia", Font.BOLD, 13));
        lblPassword.setBounds(1077, 61, 84, 14);
        panel_1.add(lblPassword);
        
        txt_pass_1 = new JPasswordField();
        txt_pass_1.setColumns(10);
        txt_pass_1.setBounds(1154, 59, 102, 20);
        panel_1.add(txt_pass_1);
        
        btnSignIn.setBackground(new Color(65, 105, 225));
        btnSignIn.setToolTipText("");
        btnSignIn.setForeground(new Color(255, 255, 255));
        btnSignIn.setBounds(1266, 58, 74, 23);
        panel_1.add(btnSignIn);
        btnSignIn.addActionListener(this);
        
        JLabel label_3 = new JLabel("");
        label_3.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        label_3.setBounds(0, 0, 1350, 100);
        panel_1.add(label_3);
        
        JLabel label = new JLabel("New label");
        label.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        label.setBounds(-75, -2, 1350, 102);
        panel_1.add(label);
        
        JLabel label_1 = new JLabel("");
        label_1.setBounds(368, 220, 46, 31);
        f.getContentPane().add(label_1);
        
        JPanel panel_2 = new JPanel();
        panel_2.setBackground(new Color(255, 255, 255));
        panel_2.setBounds(923, 152, 380, 465);
        f.getContentPane().add(panel_2);
        panel_2.setLayout(null);
        
        txt_name = new JTextField();
        txt_name.setDisabledTextColor(UIManager.getColor("Button.darkShadow"));
        txt_name.setForeground(new Color(0, 0, 0));
        txt_name.setToolTipText("");
        txt_name.setBounds(176, 156, 132, 19);
        panel_2.add(txt_name);
        txt_name.setColumns(10);
        
        JLabel lblSignUp = new JLabel("Sign Up");
        lblSignUp.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 14));
        lblSignUp.setBounds(99, 33, 69, 29);
        panel_2.add(lblSignUp);
        
        JLabel lblF = new JLabel("Name:");
        lblF.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
        lblF.setBounds(36, 157, 85, 17);
        panel_2.add(lblF);
        
        JLabel lblEmail = new JLabel("Email:");
        lblEmail.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
        
        lblEmail.setBounds(36, 237, 85, 17);
        panel_2.add(lblEmail);
        
        JLabel lblPassword_1 = new JLabel("Password:");
        lblPassword_1.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
        
        lblPassword_1.setBounds(36, 279, 85, 17);
        panel_2.add(lblPassword_1);
        
        JLabel lblReenterPassword = new JLabel("Re-enter Password:");
        lblReenterPassword.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
        
        lblReenterPassword.setBounds(36, 321, 121, 17);
        panel_2.add(lblReenterPassword);
        
        txt_email = new JTextField();
        txt_email.setColumns(10);
        txt_email.setBounds(176, 236, 132, 19);
        panel_2.add(txt_email);
        txt_email.addActionListener(this);
		
        txt_pass = new JPasswordField();
        txt_pass.setBounds(176, 278, 132, 19);
        panel_2.add(txt_pass);
        txt_pass.addActionListener(this);
		
        txt_repass = new JPasswordField();
        txt_repass.setBounds(176, 318, 132, 19);
        panel_2.add(txt_repass);
        txt_repass.addActionListener(this);
		
        bt_signup.setBackground(new Color(50, 205, 50));
        bt_signup.setForeground(SystemColor.window);
        bt_signup.setFont(new Font("Sitka Text", Font.BOLD, 12));
        bt_signup.setBounds(143, 370, 90, 29);
        panel_2.add(bt_signup);
        bt_signup.addActionListener(this);
			
        JLabel lblC = new JLabel("Contact:");
        lblC.setFont(new Font("Microsoft JhengHei", Font.BOLD, 13));
        lblC.setBounds(36, 197, 69, 14);
        panel_2.add(lblC);
        
        txt_contact = new JTextField();
        txt_contact.setColumns(10);
        txt_contact.setBounds(176, 195, 132, 19);
        panel_2.add(txt_contact);
        
        JLabel label_4 = new JLabel("*");
        label_4.setForeground(Color.RED);
        label_4.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_4.setBounds(99, 277, 14, 19);
        panel_2.add(label_4);
        
        JLabel label_5 = new JLabel("*");
        label_5.setForeground(Color.RED);
        label_5.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_5.setBounds(88, 185, 14, 29);
        panel_2.add(label_5);
        
        JLabel label_6 = new JLabel("*");
        label_6.setForeground(Color.RED);
        label_6.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_6.setBounds(74, 155, 14, 19);
        panel_2.add(label_6);
        
        JLabel label_7 = new JLabel("*");
        label_7.setForeground(Color.RED);
        label_7.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_7.setBounds(74, 225, 14, 29);
        panel_2.add(label_7);
        
        JLabel label_8 = new JLabel("*");
        label_8.setForeground(Color.RED);
        label_8.setFont(new Font("Tahoma", Font.BOLD, 14));
        label_8.setBounds(152, 317, 14, 19);
        panel_2.add(label_8);
        label_9.setForeground(Color.RED);
        
        label_9.setBounds(58, 345, 262, 14);
        panel_2.add(label_9);
        
        JLabel lblNewLabel = new JLabel("");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\faculty.png"));
        lblNewLabel.setBounds(10, 33, 97, 107);
        panel_2.add(lblNewLabel);
        
        label_10.setForeground(new Color(0, 204, 153));
        label_10.setBounds(58, 345, 262, 14);
        panel_2.add(label_10);
        
        JPanel panel_3 = new JPanel();
        panel_3.setBounds(10, 125, 800, 582);
        f.getContentPane().add(panel_3);
        panel_3.setLayout(null);
        
        JLabel label_2 = new JLabel("");
        label_2.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\albert_einstein_physicist_great_people_board_800x600_hd-wallpaper-156288.jpg"));
        label_2.setBounds(0, -23, 816, 618);
        panel_3.add(label_2);
        bt_signup.addActionListener(this);
		
         f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);


     
	}
	public static void main(String[] args) {
	Faculty f1=new Faculty();
	}
	
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String name= txt_name.getText();
		String contact=txt_contact.getText();
		String email_id=txt_email.getText();
		String passwd=txt_pass.getText();
		String re_passwd=txt_repass.getText();
		String fname=null,tid=null,psd = null;
		String pass=txt_pass_1.getText();
		 tid=txt_id.getText();
			
		if(arg0.getSource().equals(btnSignIn))
			 {	
			if(tid.length()==0)
		        JOptionPane.showMessageDialog(null,"Enter Faculty Id");	 

			else if(pass.length()==0)
		        JOptionPane.showMessageDialog(null,"Enter Faculty Password");	 
			
			else
			{
				try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				      ResultSet rs;
				      Statement stmt=con.createStatement();  
				    
				      String str=("select * from teacher where t_id='"+tid+"'");        		
				        rs=stmt.executeQuery(str);
				        
				        if(!rs.next())
				        JOptionPane.showMessageDialog(null,"Faculty Id not Found");
				        else
				        {
				        	psd=rs.getString("t_password");
							        fname=rs.getString("t_name");
							}
					  con.close();
				         } catch (SQLException | ClassNotFoundException e) {
				 	    	JOptionPane.showMessageDialog(null,e.getMessage());	 				 	 	   	  
				 	  }
				
			    if(psd.equals(pass)) 			
			    {
			       new Options(tid,fname);
			    }
			    	else
					  JOptionPane.showMessageDialog(null,"Incorrect Password,Re-enter!!");	 
			 }
			 }
		    
				
		if(arg0.getSource().equals(bt_signup)) 
		{  
			if(name.length()==0)
				label_9.setText("*Name can't be empty"); 
			else if(!isAlpha(name))
				label_9.setText("*Name not allowed"); 
			else if(!isDigit(contact))
				label_9.setText("*Invalid Contact number"); 
			     else if(email_id.length()==0)
			    	 label_9.setText("*Email_id can't be empty"); 
			     else if(passwd.length()==0 || passwd.equals(re_passwd)==false)
			    	 label_9.setText("*Password doesnot match"); 
			    else
			     {
			    	 try {
							Class.forName("oracle.jdbc.driver.OracleDriver");
						      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
						        Statement stmt=con.createStatement();  
						    	faculty_id();			
						        String str=("Insert into teacher values('"+Fid+"','"+name+"','"+contact+"','"+email_id+"','"+passwd+"')");        		
						        stmt.executeQuery(str);
						        label_9.setText(null);
						       	 label_10.setText("Faculty successfully registered");
						       	bt_signup.setVisible(false);
						       	JOptionPane.showMessageDialog(null,"Your User id is:"+Fid);	 
						       	 con.close();
						 } catch (ClassNotFoundException | SQLException e) {
							 
		     }
		    }
			}
		}
    public boolean isAlpha(String name)
   {
           return name.matches("[a-zA-Z]+");
   }
    public boolean isDigit(String contact)
    {
    	if(contact.length()==10)
            return contact.matches("[0-9]+");	
    	else
    		return false;
    }
    
    public void faculty_id()
    {
try {
  Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
			        Statement stmt=con.createStatement();  
ResultSet rs;
rs=stmt.executeQuery("select count (*)as count from Teacher");
while(rs.next())
{
count=rs.getInt("count");
}
if(a!=0)
{
count++;
a=0;
}
Fid="c"+count;
con.close();
} catch (ClassNotFoundException | SQLException a) {
	
JOptionPane.showMessageDialog(null,a.getMessage());	 		

}
    }
}

