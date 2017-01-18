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

import javax.swing.JTextArea;
import javax.swing.ImageIcon;

public class Evaluation_1 extends JFrame implements ActionListener {
	JFrame f=new JFrame();
	private JTextField m1;
	private JTextField m2;
	private JTextField m3;
	private JTextField m4;
	JLabel s1 = new JLabel("");
    JLabel s2 = new JLabel("");
    JLabel s3 = new JLabel("");
    JLabel s4 = new JLabel("");
    JLabel usn1 = new JLabel("");
    JLabel usn4 = new JLabel("");
    JLabel usn3 = new JLabel("");
    JLabel usn2 = new JLabel("");
    JTextArea f4 = new JTextArea();
    JTextArea f3 = new JTextArea();
    JButton button = new JButton("Confirm");
    JTextArea f2 = new JTextArea();
    JTextArea f1 = new JTextArea();
  
    String pnme,gnme,gid,tnme;
    String u1,u2,u3,u4;
    private final JLabel lblNewLabel = new JLabel("New label");
	
	  /**
	 * @wbp.parser.entryPoint
	 */
	@SuppressWarnings("static-access")
	public Evaluation_1(String T_name,String id,String gname,String pname)
	{
		pnme=new String(pname);
		gnme=new String(gname);
		gid=new String(id);

		
		
		f.setTitle("Evaluation");
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
        
        JLabel label = new JLabel("Name:");
        label.setFont(new Font("Georgia", Font.BOLD, 18));
        label.setBounds(88, 337, 304, 32);
        f.getContentPane().add(label);
        
        JLabel label_1 = new JLabel("USN:");
        label_1.setFont(new Font("Georgia", Font.BOLD, 18));
        label_1.setBounds(468, 337, 56, 32);
        f.getContentPane().add(label_1);
        
        JLabel label_2 = new JLabel("Marks:");
        label_2.setFont(new Font("Georgia", Font.BOLD, 18));
        label_2.setBounds(675, 337, 89, 32);
        f.getContentPane().add(label_2);
        
        JLabel label_3 = new JLabel("FeedBack:");
        label_3.setFont(new Font("Georgia", Font.BOLD, 18));
        label_3.setBounds(845, 337, 129, 32);
        f.getContentPane().add(label_3);
        f1.setFont(new Font("Georgia", Font.BOLD, 13));
        
        f1.setBounds(835, 369, 463, 51);
        f.getContentPane().add(f1);
        
        m1 = new JTextField();
        m1.setFont(new Font("Georgia", Font.BOLD, 13));
        m1.setColumns(10);
        m1.setBounds(675, 380, 86, 32);
        f.getContentPane().add(m1);
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
        
        m2 = new JTextField();
        m2.setFont(new Font("Georgia", Font.BOLD, 13));
        m2.setColumns(10);
        m2.setBounds(675, 445, 86, 32);
        f.getContentPane().add(m2);
        
        m3 = new JTextField();
        m3.setFont(new Font("Georgia", Font.BOLD, 13));
        m3.setColumns(10);
        m3.setBounds(675, 510, 86, 32);
        f.getContentPane().add(m3);
        
        m4 = new JTextField();
        m4.setFont(new Font("Georgia", Font.BOLD, 13));
        m4.setColumns(10);
        m4.setBounds(675, 574, 86, 32);
        f.getContentPane().add(m4);
        f4.setFont(new Font("Georgia", Font.BOLD, 13));
        
        f4.setBounds(835, 574, 463, 51);
        f.getContentPane().add(f4);
        f3.setFont(new Font("Georgia", Font.BOLD, 13));
        
        f3.setBounds(835, 502, 463, 51);
        f.getContentPane().add(f3);
        f2.setFont(new Font("Georgia", Font.BOLD, 13));
        
        f2.setBounds(835, 436, 463, 51);
        f.getContentPane().add(f2);
        
        JPanel panel_1 = new JPanel();
        panel_1.setLayout(null);
        panel_1.setBackground(new Color(255, 255, 255));
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        
        JLabel label_16 = new JLabel("");
        label_16.setForeground(new Color(255, 51, 0));
        label_16.setFont(new Font("Georgia", Font.BOLD, 13));
        label_16.setBounds(1147, 77, 154, 25);
        panel_1.add(label_16);
        label_16.setText("Hi,"+T_name);
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
        button.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        
        button.setBounds(479, 671, 121, 32);
        f.getContentPane().add(button);
        button.addActionListener(this);
        
        
    
String usn=null,name=null;
				try {
	Class.forName("oracle.jdbc.driver.OracleDriver");
			      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
			      ResultSet rs;
			        Statement stmt=con.createStatement();  
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
		    	m3.setVisible(false);
		    	m4.setVisible(false);
		    	f3.setVisible(false);
		    	f4.setVisible(false);
		    	}
		    	else if(i==3)
		    	{
		    		s3.setText(name);
		    	usn3.setText(usn);
		    	m3.setVisible(true);
		    	f3.setVisible(true);
		    	}
		    	else
		    	{
		    		s4.setText(name);
		    	usn4.setText(usn);
		    	m4.setVisible(true);
			    f4.setVisible(true);
		    	}
  
				}
    			         con.close();
				} catch (ClassNotFoundException | SQLException e) {
				 JOptionPane.showMessageDialog(null,e.getMessage());	
					
			 }
	
        
        
	}
	public static void main(String[] args,String T_name,String id,String gname,String pname) {
		
		Evaluation_1 E1=new Evaluation_1(T_name,id,gname,pname);
		
	
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		String M1,M2,M3,M4,F1,F2,F3,F4;
		F1=f1.getText();
		F2=f2.getText();
		F3=f3.getText();
		F4=f4.getText();
			
		M1=m1.getText();
		M2=m2.getText();
		M3=m3.getText();
		M4=m4.getText();
	 	
	 	u1=usn1.getText();
		u2=usn2.getText();
		u3=usn3.getText();
		u4=usn4.getText();
		
		if(arg0.getSource().equals(button))
    {
			try
			{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
		        Statement stmt=con.createStatement();  
		        JOptionPane.showMessageDialog(null,"1");					
		        
		        String str=("update student set marks='"+M1+"'where s_usn='"+u1+"'");
				 stmt.executeQuery(str); 
				  JOptionPane.showMessageDialog(null,"1.2");					
			      	 
				 str=("update student set feedback='"+F1+"'where s_usn='"+u1+"'");
					 stmt.executeQuery(str); 
					  JOptionPane.showMessageDialog(null,"2");					
				      	
				  str=("update student set marks='"+M2+"'where s_usn='"+u2+"'");
				 stmt.executeQuery(str); 
				  JOptionPane.showMessageDialog(null,"2.1");					
			      
				 str=("update student set feedback='"+F2+"'where s_usn='"+u2+"'");
				 stmt.executeQuery(str); 
				 JOptionPane.showMessageDialog(null,"3");					
			     
				 if(M3.length()>0)
				 {
					 JOptionPane.showMessageDialog(null,"3.1");					
				     
					 str=("update student set marks='"+M3+"'where s_usn='"+u3+"'");
				 stmt.executeQuery(str); 
				 JOptionPane.showMessageDialog(null,"3.2");					
			     
				 str=("update student set feedback='"+F3+"'where s_usn='"+u3+"'");
				 stmt.executeQuery(str); 
				 JOptionPane.showMessageDialog(null,"3.3");					
			     
				 }
				 if(M4.length()>0)
				 {
					 JOptionPane.showMessageDialog(null,"4.1");					
				     
					 str=("update student set marks='"+M4+"'where s_usn='"+u4+"'");
				 stmt.executeQuery(str); 
				 JOptionPane.showMessageDialog(null,"4.2");					
			     
				 str=("update student set feedback='"+F4+"'where s_usn='"+u4+"'");
				 stmt.executeQuery(str); 
				 JOptionPane.showMessageDialog(null,"4.3");					
			     }
	button.setVisible(false);
				 con.commit();
			}    catch (ClassNotFoundException  |SQLException e) {
		 JOptionPane.showMessageDialog(null,e.getMessage());					
    }
	}
	}
	}
