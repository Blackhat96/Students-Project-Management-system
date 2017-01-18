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

import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;

import net.miginfocom.swing.MigLayout;

public class Update extends JFrame implements ActionListener {
	JFrame f=new JFrame();
	private JTextField textField;
	JButton btnSignIn = new JButton("Sign in");
	      
	@SuppressWarnings("static-access")
	public Update()
	{
		f.setTitle("Update");
		f.setBounds(0,0,1366,768);//(x,y,width,height)
		f.setVisible(true);
        f.getContentPane().setBackground(UIManager.getColor("ProgressBar.shadow"));//background color is given which is nonstatic funtion
        f.getContentPane().setLayout(null);
        
        JPanel panel_1 = new JPanel();
        panel_1.setBackground(Color.PINK);
        panel_1.setForeground(Color.MAGENTA);
        panel_1.setBounds(0, 0, 1350, 102);
        f.getContentPane().add(panel_1);
        panel_1.setLayout(null);
    	
        
        JLabel label = new JLabel("");
        label.setBounds(1154, 86, 156, 14);
        panel_1.add(label);
        
        JLabel lblHiabhishek = new JLabel("Hi,Abhishek");
        lblHiabhishek.setFont(new Font("Georgia", Font.BOLD, 13));
        lblHiabhishek.setBounds(1154, 73, 120, 29);
        panel_1.add(lblHiabhishek);
        
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
        textField.setBounds(440, 137, 102, 20);
        panel.add(textField);
        textField.setColumns(10);
       
        btnSignIn.setBounds(576, 136, 74, 23);
        panel.add(btnSignIn);
        btnSignIn.setBackground(Color.BLUE);
        btnSignIn.setToolTipText("");
        btnSignIn.setForeground(Color.BLACK);
        btnSignIn.addActionListener(this);
        
	
	}
	public static void main(String[] args) {
		
		Update s1=new Update();
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String Gid=textField.getText();
		// JOptionPane.showMessageDialog(null,"again Student Successfull:"+pass);
	//	 if(arg0.getSource().equals(btnSignIn) )
	//		 new Update_1(Gid);
		  //else
			//  JOptionPane.showMessageDialog(null,"Incorrect Password,Re-enter!!");
	
	}
}
