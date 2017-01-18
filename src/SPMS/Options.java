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
import javax.swing.ImageIcon;

public class Options extends JFrame implements ActionListener {
	
	JFrame f=new JFrame();
	  JButton evaluate = new JButton("EVALUATE.");
	  JButton btnDisplayAllProjects = new JButton("DISPLAY  ALL  PROJECTS.");
      JButton btnDisplayGroupDetails = new JButton("DISPLAY  GROUP  DETAILS.");
      JButton delete = new JButton("DELETE  A  PROJECT.");
      JButton Notify = new JButton("NOTIFY  ALL  GROUPS.");
      JButton Add_pjt = new JButton("ADD  A  PROJECT.");
      JButton Contact = new JButton("CONTACT  A  STUDENT.");
      String t_id,f_name;
      private final JLabel lblNewLabel_1 = new JLabel("");
    
  @SuppressWarnings("static-access")
	public Options(String tid,String fname)
	{
		t_id=new String(tid);
	      f_name=new String(fname);	  
		f.setTitle("Faculty Options");
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
        
        JLabel name = new JLabel("");
        name.setForeground(new Color(255, 51, 0));
        name.setBackground(new Color(255, 255, 255));
        name.setFont(new Font("Georgia", Font.BOLD, 13));
        name.setBounds(1154, 78, 150, 22);
        panel_1.add(name);
        name.setText("Hi,"+fname);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 100);
        panel_1.add(lblNewLabel);
        Add_pjt.setBounds(83, 246, 270, 52);
        f.getContentPane().add(Add_pjt);
        Add_pjt.setFont(new Font("Bell MT", Font.BOLD, 14));
        delete.setBounds(83, 429, 270, 52);
        f.getContentPane().add(delete);
        

        delete.setFont(new Font("Bell MT", Font.BOLD, 14));
        evaluate.setBounds(510, 246, 270, 52);
        f.getContentPane().add(evaluate);
        evaluate.setFont(new Font("Bell MT", Font.BOLD, 14));
        Contact.setBounds(510, 337, 270, 52);
        f.getContentPane().add(Contact);
        
        Contact.setFont(new Font("Dialog", Font.BOLD, 14));
        Notify.setBounds(510, 429, 270, 52);
        f.getContentPane().add(Notify);
        Notify.setFont(new Font("Bell MT", Font.BOLD, 14));
        btnDisplayAllProjects.setBounds(967, 246, 270, 52);
        f.getContentPane().add(btnDisplayAllProjects);
        
        btnDisplayAllProjects.setFont(new Font("Bell MT", Font.BOLD, 14));
        btnDisplayGroupDetails.setBounds(967, 429, 270, 52);
        f.getContentPane().add(btnDisplayGroupDetails);
        
        
        btnDisplayGroupDetails.setFont(new Font("Bell MT", Font.BOLD, 14));
        lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\blue-wallpaper-15(edit).jpg"));
        lblNewLabel_1.setBounds(0, 101, 1350, 628);
        
        f.getContentPane().add(lblNewLabel_1);
        btnDisplayGroupDetails.addActionListener(this);
        btnDisplayAllProjects.addActionListener(this);
        Notify.addActionListener(this);
        Contact.addActionListener(this);
        evaluate.addActionListener(this);
        delete.addActionListener(this);
        Add_pjt.addActionListener(this);
    	
        
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	

	}
	public static void main(String[] args,String tid,String fname) {
		Options O1=new Options(tid,fname);
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		if(arg0.getSource().equals(Add_pjt))
			new Add_project(t_id,f_name);
		else if(arg0.getSource().equals(Notify))
			new	Notify(f_name);	
		else if(arg0.getSource().equals(delete))
		 new Delete(t_id,f_name);
		else if(arg0.getSource().equals(btnDisplayAllProjects))
         new Display_all_project(f_name);	
		else if(arg0.getSource().equals(btnDisplayGroupDetails))
			new	Dispaly_group_details(f_name);
			else if(arg0.getSource().equals(evaluate))
		new Evaluation(f_name);				
			else if(arg0.getSource().equals(Contact))
		new Contact(t_id,f_name);
	}
	
}
