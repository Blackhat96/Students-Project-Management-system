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
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Types;

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import net.miginfocom.swing.MigLayout;

public class Notify extends JFrame implements ActionListener {
	JFrame f=new JFrame();
	JPanel panel_2 = new JPanel();
    JLabel label_5 = new JLabel(""); 
    JTextArea textArea = new JTextArea();
    JButton button = new JButton("Submit");
    private final JLabel lblNewLabel = new JLabel("New label");
    
	@SuppressWarnings("static-access")
	public Notify(String f_name)
	{
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setTitle("Notify All Groups");
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
        label.setIcon(null);
        label.setFont(new Font("Georgia", Font.BOLD, 13));
        label.setBounds(1154, 76, 156, 24);
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
        
        panel_2.setBackground(new Color(204, 204, 204));
        panel_2.setBounds(391, 126, 608, 360);
        panel.add(panel_2);
        panel_2.setLayout(null);
        panel_2.setVisible(true);
        
        JLabel lblNotify = new JLabel("Broadcast Message :");
        lblNotify.setBounds(20, 23, 185, 23);
        lblNotify.setFont(new Font("Georgia", Font.BOLD, 15));
        panel_2.add(lblNotify);
        textArea.setFont(new Font("Georgia", Font.BOLD, 13));
        
        textArea.setBounds(20, 57, 564, 247);
        panel_2.add(textArea);
        button.setFont(new Font("Tahoma", Font.BOLD, 12));
        
        button.setBounds(233, 326, 89, 23);
        panel_2.add(button);
        button.addActionListener(this);
    	
        
        label_5.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\aa.png"));
        label_5.setBounds(0, 0, 1350, 623);
        label_5.setVisible(true);
        panel.add(label_5);
        
	
	}
	public static void main(String[] args,String f_name) {
		
		Notify C=new Notify(f_name);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		 label_5.setVisible(true);
		 String mess=textArea.getText();
			
	    	if(arg0.getSource().equals(button))
	    	{
	    		try {
					Class.forName("oracle.jdbc.driver.OracleDriver");
					  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
				      Statement stmt=con.createStatement();  
					  String str=("update groups set notify='"+mess+"'");
				      stmt.executeQuery(str);
						 
				      JOptionPane.showMessageDialog(null,"Executed1");
				      button.setVisible(false);
						 con.close();
	    		} 
	    catch (ClassNotFoundException  |SQLException e) {
			 JOptionPane.showMessageDialog(null,e.getMessage());
						
	    }
			    	    	}

		}
}
