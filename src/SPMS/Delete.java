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

public class Delete extends JFrame implements ActionListener {
	JFrame f=new JFrame();
	private JTextField textField;
	JButton btnSignIn = new JButton("");
	    String fnme,tid;  
		
	    @SuppressWarnings("static-access")
	
	public Delete(String t_id,String f_name)
	{
		fnme=new String(f_name);
		tid=new String(t_id);
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			
		f.setTitle("Delete a Project");
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
        label.setBounds(1154, 78, 156, 22);
        panel_1.add(label);
        label.setText("Hi,"+f_name);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 100);
        panel_1.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setForeground(Color.WHITE);
        panel.setBounds(0, 102, 1350, 627);
        f.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblUsn = new JLabel("Enter Group Id:");
        lblUsn.setBounds(310, 132, 120, 29);
        panel.add(lblUsn);
        lblUsn.setFont(new Font("Georgia", Font.BOLD, 13));
        
        textField = new JTextField();
        textField.setFont(new Font("Tahoma", Font.BOLD, 13));
        textField.setBounds(440, 137, 92, 20);
        panel.add(textField);
        textField.setColumns(10);
        btnSignIn.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Login.png"));
       
        btnSignIn.setBounds(548, 132, 37, 29);
        panel.add(btnSignIn);
        btnSignIn.setBackground(Color.WHITE);
        btnSignIn.setToolTipText("");
        btnSignIn.setForeground(Color.BLACK);
        btnSignIn.addActionListener(this);
        
	
	}
	public static void main(String[] args,String t_id,String f_name) {
		
		Delete s1=new Delete(t_id,f_name);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String gid=textField.getText();
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
								new Delete_1(tid,fnme,gid,gname,pname,desc);							
								con.close();
							}
							} catch (ClassNotFoundException | SQLException e) {
					 JOptionPane.showMessageDialog(null,"Group Id Not Found!");
						
				}  	
			  }
		
	}
}
