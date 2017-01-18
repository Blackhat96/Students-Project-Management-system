package project_management;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

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
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JTextArea;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;


public class Display_group_details_1 extends JFrame  {
	JFrame f=new JFrame();
	JLabel s1 = new JLabel("");
    JLabel s2 = new JLabel("");
    JLabel s3 = new JLabel("");
    JLabel s4 = new JLabel("");
    JLabel usn1 = new JLabel("");
    JLabel usn4 = new JLabel("");
    JLabel usn3 = new JLabel("");
    JLabel usn2 = new JLabel("");
  
    String pname,gnme,id,tnme;
    String u1,u2,u3,u4;
    private final JLabel lblDescription = new JLabel("Description:");
    private final JLabel label_2 = new JLabel("");
    private final JLabel hi = new JLabel("");
    private final JLabel lblNewLabel = new JLabel("New label");
	
	  /**
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings("static-access")
	public Display_group_details_1(String fname,String gid,String pnme,String gpnme,String desc)
	{
		pname=new String(pnme);
		gnme=new String(gpnme);
		id=new String(gid);

		
		
		f.setTitle("Dispaly Group Details");
		f.setBounds(0,-26,1366,768);//(x,y,width,height)
		f.setVisible(true);
    	
        
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        f.getContentPane().setLayout(null);
        
        JLabel label_4 = new JLabel("Group Id:");
        label_4.setFont(new Font("Georgia", Font.BOLD, 18));
        label_4.setBounds(88, 167, 109, 32);
        f.getContentPane().add(label_4);
        
        JLabel label_5 = new JLabel("");
        label_5.setFont(new Font("Georgia", Font.BOLD, 13));
        label_5.setBounds(250, 169, 297, 32);
        f.getContentPane().add(label_5);
        label_5.setText(gid);
        
        JLabel label_6 = new JLabel("Project Name:");
        label_6.setFont(new Font("Georgia", Font.BOLD, 18));
        label_6.setBounds(88, 223, 214, 32);
        f.getContentPane().add(label_6);
        
        JLabel label_7 = new JLabel("Group Name:");
        label_7.setFont(new Font("Georgia", Font.BOLD, 18));
        label_7.setBounds(88, 283, 140, 32);
        f.getContentPane().add(label_7);
        
        JLabel label = new JLabel("Enter Team Members  Name:\n");
        label.setFont(new Font("Georgia", Font.BOLD, 18));
        label.setBounds(88, 337, 304, 32);
        f.getContentPane().add(label);
        
        JLabel label_1 = new JLabel("USN:");
        label_1.setFont(new Font("Georgia", Font.BOLD, 18));
        label_1.setBounds(509, 337, 56, 32);
        f.getContentPane().add(label_1);
        
        usn1.setFont(new Font("Georgia", Font.BOLD, 13));
        
        usn1.setBounds(468, 380, 159, 32);
        f.getContentPane().add(usn1);
        s1.setFont(new Font("Georgia", Font.BOLD, 13));
        
        s1.setBounds(92, 380, 325, 32);
        f.getContentPane().add(s1);
        
        s2.setFont(new Font("Georgia", Font.BOLD, 13));
         s2.setBounds(92, 445, 325, 32);
        f.getContentPane().add(s2);
        
        s3.setFont(new Font("Georgia", Font.BOLD, 13));
        s3.setBounds(92, 510, 325, 32);
        f.getContentPane().add(s3);
        
        s4.setFont(new Font("Georgia", Font.BOLD, 13));
         s4.setBounds(88, 574, 325, 32);
        f.getContentPane().add(s4);
        
        usn4.setFont(new Font("Georgia", Font.BOLD, 13));
        usn4.setBounds(468, 574, 159, 32);
        f.getContentPane().add(usn4);
        
        usn3.setFont(new Font("Georgia", Font.BOLD, 13));
          usn3.setBounds(468, 510, 159, 32);
        f.getContentPane().add(usn3);
        
        usn2.setFont(new Font("Georgia", Font.BOLD, 13));
        usn2.setBounds(468, 445, 159, 32);
        f.getContentPane().add(usn2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        hi.setForeground(new Color(255, 51, 0));
        hi.setFont(new Font("Georgia", Font.BOLD, 13));
        hi.setBounds(1146, 71, 178, 31);
        hi.setText("Hi,"+fname);
        panel_1.add(hi);
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 102);
        
        panel_1.add(lblNewLabel);
        
        JLabel pjt_nme = new JLabel("");
        pjt_nme.setFont(new Font("Georgia", Font.BOLD, 13));
        pjt_nme.setBounds(250, 223, 377, 32);
        f.getContentPane().add(pjt_nme);
        pjt_nme.setText(pnme);
         
        JLabel grp_nme = new JLabel("");
        grp_nme.setFont(new Font("Georgia", Font.BOLD, 13));
        grp_nme.setBounds(250, 283, 377, 32);
        f.getContentPane().add(grp_nme);
        grp_nme.setText(gnme);
        lblDescription.setFont(new Font("Georgia", Font.BOLD, 18));
        lblDescription.setBounds(835, 337, 166, 32);
        
        f.getContentPane().add(lblDescription);
        label_2.setVerticalAlignment(SwingConstants.TOP);
        label_2.setHorizontalAlignment(SwingConstants.LEFT);
        label_2.setFont(new Font("Georgia", Font.BOLD, 13));
        label_2.setBounds(831, 380, 368, 124);
        label_2.setText(desc);
        
        f.getContentPane().add(label_2);
      
String usn=null,name=null;
try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
        Statement stmt=con.createStatement();
       ResultSet rs;
     
       String str=("select s.s_usn,s.s_name from student s,grp_member g where s.s_usn=g.s_usn and g_id='"+id+"'");       		
        rs=stmt.executeQuery(str);
    	
        int i=0;
        while(rs.next())
			{
			   i++;    
			   usn=rs.getString(1);
			   name=rs.getString(2);
			   
			   if(i==1)
			   {	s1.setText(name);
			   	usn1.setText(usn);	
			   }
	else if(i==2)
	{
		s2.setText(name);
	usn2.setText(usn);
	}
	else if(i==3)
	{
		s3.setText(name);
	usn3.setText(usn);
	}
	else
	{
		s4.setText(name);
	usn4.setText(usn);
		    	}

			    }
        con.close();
		
		 }catch (ClassNotFoundException | SQLException e) {
				   JOptionPane.showMessageDialog(null,e.getMessage());	 
			 }
}
	public static void main(String[] args,String fname,String gid,String pnme,String gpnme,String desc) {
		Display_group_details_1 E1=new Display_group_details_1(fname,gid,pnme,gpnme,desc);
	}

/*
public void actionPerformed(ActionEvent arg0) {
	if(arg0.getSource().equals(btnBack))
	{
		   JOptionPane.showMessageDialog(null,"holi");	 
			
	}
}*/
}