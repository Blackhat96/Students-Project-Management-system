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
import java.awt.SystemColor;
import javax.swing.SwingConstants;


public class Update_1 extends JFrame implements ActionListener {

	private JPanel contentPane;
	JLabel label = new JLabel("");
	 JButton btnNewButton = new JButton("Change");
	 JButton btnChange = new JButton("Change");
	 JLabel lblNewGroupName = new JLabel("New Group Name :");
	 JLabel lblNewProjectName = new JLabel("New Project Name :");
	 JTextArea txtrAteam = new JTextArea();
	 JTextArea textArea = new JTextArea();
	 JTextArea textArea_1 = new JTextArea();
	 JLabel lblNewDescription = new JLabel("New Description:");
	  JButton button = new JButton("Change");
	  JButton btnConfirm = new JButton("Confirm");
      JButton btnCancel = new JButton("Cancel");
      JLabel label_1 = new JLabel("Data");
      JLabel lblData = new JLabel("");
      JLabel lblAteam = new JLabel("A-Team");
      String gid,pname,gname,desc;
      String nw_pname,nw_gname,nw_desc;
      private final JLabel label_2 = new JLabel("");


	/**
	 * Launch the application.
	 */
	public static void main(String[] args,String id,String p_nme,String g_name,String dsc) {
		Update_1 L=new Update_1(id,p_nme,g_name,dsc);
	}

	/**
	 * Create the frame.
	 */
	public Update_1(String id,String p_nme,String g_name,String dsc)
	{
		gid=new String(id);
		pname=new String(p_nme);
		gname=new String(g_name);
		desc=new String(dsc);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		JFrame f=new JFrame();
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		      
			f.setTitle("Update_1");
			f.setBounds(0,0,1366,768);//(x,y,width,height)
			f.setVisible(true);
	        f.getContentPane().setBackground(SystemColor.inactiveCaptionBorder);//background color is given which is nonstatic funtion
	        f.getContentPane().setLayout(null);
	        
	        JPanel panel_1 = new JPanel();
	        panel_1.setBackground(Color.WHITE);
	        panel_1.setBounds(0, 0, 1350, 102);
	        f.getContentPane().add(panel_1);
	        panel_1.setLayout(null);
	        label.setForeground(Color.WHITE);
	        label.setFont(new Font("Georgia", Font.BOLD, 13));
	    	
	        
	        label.setBounds(1154, 78, 111, 22);
	        panel_1.add(label);
	        label.setText("Hi,"+gname);
	        label_2.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\Image\\Blue-Wallpaper-Hd-37C.jpg"));
	        label_2.setBounds(0, 0, 1350, 102);
	        
	        panel_1.add(label_2);
	        
	        JLabel lblGroupName = new JLabel("Group Name :");
	        lblGroupName.setFont(new Font("Georgia", Font.BOLD, 16));
	        lblGroupName.setBounds(129, 152, 149, 28);
	        f.getContentPane().add(lblGroupName);
	        

	        lblAteam.setFont(new Font("Georgia", Font.BOLD, 17));
	        lblAteam.setBounds(276, 148, 280, 36);
	        f.getContentPane().add(lblAteam);
	        lblAteam.setText(gname);
	        
	        JLabel lblProjectName = new JLabel("Project Name:");
	        lblProjectName.setFont(new Font("Georgia", Font.BOLD, 16));
	        lblProjectName.setBounds(125, 266, 153, 28);
	        f.getContentPane().add(lblProjectName);
	        textArea.setFont(new Font("GaboDrive", Font.BOLD, 13));
	        
	        textArea.setBounds(263, 327, 269, 28);
	        f.getContentPane().add(textArea);
	        textArea.setVisible(false);
	        btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
	        
	        btnNewButton.setBounds(646, 155, 89, 23);
	        f.getContentPane().add(btnNewButton);
	        btnNewButton.addActionListener(this);
	        btnChange.setFont(new Font("Tahoma", Font.BOLD, 12));
	        
	        btnChange.setBounds(646, 269, 89, 23);
	        f.getContentPane().add(btnChange);
	        btnChange.addActionListener(this);
	        
	        lblNewGroupName.setFont(new Font("Georgia", Font.BOLD, 16));
	        lblNewGroupName.setBounds(85, 207, 193, 36);
	        f.getContentPane().add(lblNewGroupName);
	        lblNewGroupName.setVisible(false);
	        
	        lblNewProjectName.setFont(new Font("Georgia", Font.BOLD, 16));
	        lblNewProjectName.setBounds(78, 327, 200, 36);
	        f.getContentPane().add(lblNewProjectName);
	        lblNewProjectName.setVisible(false);
	        

	        lblData.setFont(new Font("Georgia", Font.BOLD, 17));
	        lblData.setBounds(263, 260, 280, 36);
	        f.getContentPane().add(lblData);
	        lblData.setText(pname);
	        txtrAteam.setFont(new Font("GaboDrive", Font.BOLD, 13));
	        
	        
	        
	        txtrAteam.setBounds(263, 215, 269, 28);
	        f.getContentPane().add(txtrAteam);
	        
	        JLabel lblDescription = new JLabel("Description:");
	        lblDescription.setFont(new Font("Georgia", Font.BOLD, 16));
	        lblDescription.setBounds(146, 394, 132, 28);
	        f.getContentPane().add(lblDescription);
	        button.setFont(new Font("Tahoma", Font.BOLD, 12));
	        
	        button.setBounds(646, 397, 89, 23);
	        f.getContentPane().add(button);
	        button.addActionListener(this);
	        label_1.setVerticalAlignment(SwingConstants.TOP);
	        label_1.setHorizontalAlignment(SwingConstants.LEFT);
	                 
	        label_1.setFont(new Font("Georgia", Font.BOLD, 17));
	        label_1.setBounds(263, 398, 328, 183);
	        f.getContentPane().add(label_1);
	        label_1.setText(desc);
		        
	        
	        lblNewDescription.setFont(new Font("Georgia", Font.BOLD, 16));
	        lblNewDescription.setBounds(763, 393, 168, 28);
	        f.getContentPane().add(lblNewDescription);
	        lblNewDescription.setVisible(false);
	        textArea_1.setFont(new Font("Georgia", Font.BOLD, 14));
	        
	        textArea_1.setBounds(928, 394, 380, 174);
	        f.getContentPane().add(textArea_1);
	        textArea_1.setVisible(false);
	        btnConfirm.setFont(new Font("Tahoma", Font.BOLD, 12));
	        
	        btnConfirm.setBounds(428, 658, 89, 23);
	        f.getContentPane().add(btnConfirm);
	        btnConfirm.addActionListener(this);
	        btnCancel.setFont(new Font("Tahoma", Font.BOLD, 12));
		       

	        btnCancel.setBounds(620, 658, 89, 23);
	        f.getContentPane().add(btnCancel);
	        btnCancel.addActionListener(this);
		      
	        txtrAteam.setVisible(false);
	      	
	
	
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String str;
	       Statement stmt=null;
	       Connection con=null;
	       try{
				Class.forName("oracle.jdbc.driver.OracleDriver");
				   con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
			       stmt=con.createStatement();  
			 } catch(ClassNotFoundException  |SQLException e)
	        {
			  
	        }
	       
		
		if(arg0.getSource().equals(btnChange))
		{
			lblNewProjectName.setVisible(true);	
			textArea.setVisible(true);
			btnChange.setVisible(false);
		      
		}
		if(arg0.getSource().equals(btnNewButton))
		{
			lblNewGroupName.setVisible(true);
			 txtrAteam.setVisible(true);
				btnNewButton.setVisible(false);
		}
		if(arg0.getSource().equals(button))
		{
			textArea_1.setVisible(true);
	        lblNewDescription.setVisible(true);
			button.setVisible(false);

		}		
		if(arg0.getSource().equals(btnConfirm))
				{
			nw_gname=txtrAteam.getText();
		       
			nw_pname=textArea.getText();
			  nw_desc=textArea_1.getText();
				
				if(nw_gname.length()!=0)			
				{
					 str=("update groups set g_name ='"+nw_gname+"'where g_id='"+gid+"'");
						JOptionPane.showMessageDialog(null,"agga");
																
											try {
												stmt.executeQuery(str);
												} catch (SQLException e1) {
												
													JOptionPane.showMessageDialog(null,e1.getMessage());
																		
											
											}           
											

				}

				if(nw_pname.length()!=0)			
				{
									str=("update groups set P_name ='"+nw_pname+"'where g_id='"+gid+"'");
								JOptionPane.showMessageDialog(null,"agga");
																		
													try {
														stmt.executeQuery(str);
														 JOptionPane.showMessageDialog(null,"Executed2");
												
													} catch (SQLException e) {
														// TODO Auto-generated catch block
														JOptionPane.showMessageDialog(null,e.getMessage());
									}
				
												}

				if(nw_desc.length()!=0)			
				{
											  str=("update groups set description='"+nw_desc+"'where g_id='"+gid+"'");
											  				JOptionPane.showMessageDialog(null,"agga");
											  									try {
											  										stmt.executeQuery(str);
											  										 JOptionPane.showMessageDialog(null,"Executed3");
con.close();								  									} catch (SQLException e2) {
											  										// TODO Auto-generated catch block
											  										JOptionPane.showMessageDialog(null,e2.getMessage());
											  									}           
													}           
									}					
		}
		
	}