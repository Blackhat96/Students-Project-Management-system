package project_management;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.SQLWarning;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;


public class Delete_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	JLabel label = new JLabel("");
	JButton btnSignIn = new JButton("Sign in");
	  String id,gname,pname,desc;
	   JButton btnSubmit = new JButton("Confirm");
	   JLabel lbl_mem1 = new JLabel("");
       JLabel lbl_mem2 = new JLabel("");
       JLabel lbl_mem3 = new JLabel("");
       JLabel lbl_mem4 = new JLabel("");
       JLabel Usn1 = new JLabel("");
       JLabel Usn2 = new JLabel("");
       JLabel Usn3 = new JLabel("");
       JLabel Usn4 = new JLabel("");
       String tid,f_name;
	     
	/**
	 * Launch the application.
	 */
	public static void main(String[] args,String tid,String fnme,String gid,String gname,String pname,String desc) {
		Delete_1 L=new Delete_1(tid,fnme,gid,gname,pname,desc);
		 
	}

	/**
	 * Create the frame.
	 */
	public Delete_1(String t_id,String fnme,String gid,String gname,String pname,String desc) {
		  id=new String(gid);
		  gname=new String(gname);
		  pname=new String(pname);
		  desc=new String(desc);
f_name=new String(fnme);
tid=new String(t_id);

		  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		      
			f.setTitle("Delete A Project");
			f.setBounds(0,0,1366,768);//(x,y,width,height)
			f.setVisible(true);
	        f.getContentPane().setBackground(new Color(255, 255, 255));//background color is given which is nonstatic funtion
	        f.getContentPane().setLayout(null);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBounds(0, 0, 1350, 102);
	        f.getContentPane().add(panel_1);
	        panel_1.setLayout(null);
	        label.setForeground(new Color(255, 51, 0));
	        label.setFont(new Font("Georgia", Font.BOLD, 13));
	    	
	        
	        label.setBounds(1132, 70, 158, 30);
	        panel_1.add(label);
	        label.setText("Hi,"+fnme);
	        
	        JLabel lblNewLabel_1 = new JLabel("New label");
	        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
	        lblNewLabel_1.setBounds(0, 0, 1350, 100);
	        panel_1.add(lblNewLabel_1);
	        
	        JLabel lblGroupName = new JLabel("Group Name :");
	        lblGroupName.setFont(new Font("Kalinga", Font.BOLD, 17));
	        lblGroupName.setBounds(129, 152, 124, 28);
	        f.getContentPane().add(lblGroupName);
	        
	        JLabel lbl_grpname = new JLabel("");
	        lbl_grpname.setFont(new Font("Georgia", Font.BOLD, 12));
	        lbl_grpname.setBounds(263, 144, 445, 36);
	        f.getContentPane().add(lbl_grpname);
	        lbl_grpname.setText(gname);
	        
	        JLabel lblProjectName = new JLabel("Project Name:");
	        lblProjectName.setFont(new Font("Kalinga", Font.BOLD, 17));
	        lblProjectName.setBounds(129, 217, 124, 28);
	        f.getContentPane().add(lblProjectName);
	        
	        
	        JLabel lbl_pjtname = new JLabel("");
	        lbl_pjtname.setFont(new Font("Georgia", Font.BOLD, 12));
	        lbl_pjtname.setBounds(263, 209, 445, 36);
	        f.getContentPane().add(lbl_pjtname);
	        lbl_pjtname.setText(pname);
	        
	        JLabel lblChangeProjectDescription = new JLabel("Group members:");
	        lblChangeProjectDescription.setFont(new Font("Kalinga", Font.BOLD, 17));
	        lblChangeProjectDescription.setBounds(129, 280, 159, 28);
	        f.getContentPane().add(lblChangeProjectDescription);
	        btnSubmit.setFont(new Font("Tahoma", Font.BOLD, 12));
	        
	        btnSubmit.setBackground(new Color(0, 0, 205));
	        btnSubmit.setForeground(Color.WHITE);
	        btnSubmit.setBounds(811, 572, 101, 28);
	        f.getContentPane().add(btnSubmit);
	        btnSubmit.addActionListener(this);
	    	
	        
	        lbl_mem1.setFont(new Font("Georgia", Font.BOLD, 12));
	        lbl_mem1.setBounds(129, 327, 223, 28);
	        f.getContentPane().add(lbl_mem1);
	        
	        lbl_mem2.setFont(new Font("Georgia", Font.BOLD, 12));
	        lbl_mem2.setBounds(129, 380, 223, 28);
	        f.getContentPane().add(lbl_mem2);
	        
	        lbl_mem3.setFont(new Font("Georgia", Font.BOLD, 12));
	        lbl_mem3.setBounds(129, 430, 223, 28);
	        f.getContentPane().add(lbl_mem3);
	        
	        lbl_mem4.setFont(new Font("Georgia", Font.BOLD, 12));
	        lbl_mem4.setBounds(129, 484, 223, 28);
	        f.getContentPane().add(lbl_mem4);
	        
	        JLabel lblUsn = new JLabel("USN:");
	        lblUsn.setFont(new Font("Kalinga", Font.BOLD, 17));
	        lblUsn.setBounds(411, 280, 55, 28);
	        f.getContentPane().add(lblUsn);
	        
	        Usn1.setFont(new Font("Georgia", Font.BOLD, 12));
	        Usn1.setBounds(422, 327, 146, 28);
	        f.getContentPane().add(Usn1);
	        
	        Usn2.setFont(new Font("Georgia", Font.BOLD, 12));
	        Usn2.setBounds(422, 380, 146, 28);
	        f.getContentPane().add(Usn2);
	        
	        Usn3.setFont(new Font("Georgia", Font.BOLD, 12));
	        Usn3.setBounds(422, 430, 146, 28);
	        f.getContentPane().add(Usn3);
	        
	        Usn4.setFont(new Font("Georgia", Font.BOLD, 12));
	        Usn4.setBounds(422, 484, 146, 28);
	        f.getContentPane().add(Usn4);
	        
	        JLabel lblProjectDescription = new JLabel("Project  Description :");
	        lblProjectDescription.setFont(new Font("Kalinga", Font.BOLD, 17));
	        lblProjectDescription.setBounds(811, 280, 179, 28);
	        f.getContentPane().add(lblProjectDescription);
	        
	        JLabel lblNewLabel = new JLabel("");
	        lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
	        lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
	        lblNewLabel.setFont(new Font("Georgia", Font.BOLD, 12));
	        lblNewLabel.setBackground(Color.WHITE);
	        lblNewLabel.setBounds(820, 319, 530, 139);
	        f.getContentPane().add(lblNewLabel);
	        lblNewLabel.setText(desc);
		

			 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				        Statement stmt=con.createStatement();
				       ResultSet rs;
				       String usn,name;
				       
				        String str=("select s.s_usn,s.s_name from student s,grp_member g where s.s_usn=g.s_usn and g_id='"+id+"'");       		
				        rs=stmt.executeQuery(str);
				    	
				        int i=0;
				        while(rs.next())
							{
							   i++;    
							   usn=rs.getString(1);
							   name=rs.getString(2);
							   
							   if(i==1)
							   {	lbl_mem1.setText(name);
							   Usn1.setText(usn);	
							   }
			    	else if(i==2)
			    	{
			    		lbl_mem2.setText(name);
			    	Usn2.setText(usn);
			    	}
			    	else if(i==3)
			    	{
			    		lbl_mem3.setText(name);
			    	Usn3.setText(usn);
			    	}
			    	else
			    	{
			    		lbl_mem4.setText(name);
			    	Usn4.setText(usn);
			    		    	}
	  
							    }
				        con.close();
						
						 }catch (ClassNotFoundException | SQLException e) {
								   JOptionPane.showMessageDialog(null,e.getMessage());	 
							 }
				 	
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		
		if(arg0.getSource().equals(btnSubmit))
		{ Connection con = null ;
			 try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
				       con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				        Statement stmt=con.createStatement();
				        ResultSet rs;
		String str;
		str=("delete from grp_member where g_id='"+id+"'");        		
	      stmt.executeQuery(str);           
		    
	      str=("delete from groups where g_id='"+id+"'");        		
	      stmt.executeQuery(str);           
JOptionPane.showMessageDialog(null,"Deleted Successfully");	 
	      btnSubmit.setVisible(false);
           con.close();
       //	new Options(tid,f_name);	
		 
		 }
			 catch (ClassNotFoundException | SQLException e) {
				    	JOptionPane.showMessageDialog(null,e.getMessage());	        
					 }
 		}
		}
}
