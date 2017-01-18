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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.ImageIcon;

public class Student_option extends JFrame implements ActionListener {
	
	JFrame f=new JFrame();
	  JButton btnUpdateProject= new JButton("Update Project Details");
      JButton btnDisplayGroupDetails = new JButton("View Group Details");
      String g_name,dsc,p_nme,id;
  
      @SuppressWarnings("static-access")
	public Student_option(String gid,String pname,String gname,String desc)
	{	  
		g_name=new String(gname);
		p_nme=new String(pname);
		dsc=new String(desc);
		id=new String(gid);
		
		f.setTitle("Student Options");
		f.setBounds(0,0,1366,768);//(x,y,width,height)
		f.setVisible(true);
        f.getContentPane().setBackground(Color.WHITE);//background color is given which is nonstatic funtion
        f.getContentPane().setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        panel.setBounds(0, 0, 734, -15);
        f.getContentPane().add(panel);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setForeground(Color.PINK);
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);
        
        JLabel lblHello = new JLabel("");
        lblHello.setForeground(new Color(255, 255, 255));
        lblHello.setFont(new Font("Georgia", Font.BOLD, 13));
        lblHello.setBounds(1146, 74, 163, 28);
        panel_1.add(lblHello);
        lblHello.setText("Hi,"+g_name);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 102);
        panel_1.add(lblNewLabel);
        
        
        JPanel panel_4 = new JPanel();
        panel_4.setBackground(new Color(204, 204, 204));
        panel_4.setBounds(935, 190, 373, 323);
        f.getContentPane().add(panel_4);
        panel_4.setLayout(null);
        
        btnUpdateProject.setFont(new Font("Georgia", Font.BOLD, 16));
        btnUpdateProject.setBounds(60, 48, 270, 52);
        panel_4.add(btnUpdateProject);
        btnUpdateProject.addActionListener(this);
        
        
        btnDisplayGroupDetails.setFont(new Font("Georgia", Font.BOLD, 16));
        btnDisplayGroupDetails.setBounds(60, 230, 270, 52);
        panel_4.add(btnDisplayGroupDetails);
        
        JLabel lblNewLabel_1 = new JLabel("New label");
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\amazing-wallpapers-7.jpg"));
        lblNewLabel_1.setBounds(0, 104, 1350, 625);
        f.getContentPane().add(lblNewLabel_1);
        btnDisplayGroupDetails.addActionListener(this);
    	
        
        f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	

	}
	public static void main(String[] args,String gid,String pname,String gname,String desc) {
		Student_option O1=new Student_option(gid,pname,gname,desc);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
String pnme=null,gpnme=null,desc=null;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
		      ResultSet rs;
		        Statement stmt=con.createStatement();  
		        String str=("select * from groups where g_id='"+id+"'");        		
		        rs=stmt.executeQuery(str);
		    
		        if(!rs.next())
					 JOptionPane.showMessageDialog(null,"Group Id Not Found!");
					else
					{
							pnme=rs.getString("P_name");
					        gpnme=rs.getString("g_name");
					        desc=rs.getString("description");
					}					        
						con.close();
		 } catch (ClassNotFoundException | SQLException e) {
		}	

		
		if(arg0.getSource().equals(btnUpdateProject))
         new Update_1(id,p_nme,g_name,dsc);	
		else if(arg0.getSource().equals(btnDisplayGroupDetails))
			new Display_group_details_1(gpnme,id,pnme,gpnme,desc);
		
	}
}
