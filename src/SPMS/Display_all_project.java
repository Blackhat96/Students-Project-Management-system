package project_management;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.UIManager;
import javax.swing.border.CompoundBorder;
import net.proteanit.sql.DbUtils;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;

public class Display_all_project extends JFrame {
	JFrame f=new JFrame();
	private JTable table;
	      
	public Display_all_project(String f_name) 
	{
		f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		f.setTitle("Display all Projects");
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
        
        JLabel lblHiabhishek = new JLabel("");
        lblHiabhishek.setForeground(new Color(255, 51, 0));
        lblHiabhishek.setFont(new Font("Georgia", Font.BOLD, 13));
        lblHiabhishek.setBounds(1145, 73, 195, 29);
        panel_1.add(lblHiabhishek);
        lblHiabhishek.setText("Hi,"+f_name);
        
        JLabel lblNewLabel = new JLabel("New label");
        lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Abhishek\\workspace\\Project_management\\bin\\Blue-Wallpaper-Hd-37C.jpg"));
        lblNewLabel.setBounds(0, 0, 1350, 102);
        panel_1.add(lblNewLabel);
        
        JPanel panel = new JPanel();
        panel.setForeground(Color.WHITE);
        panel.setBounds(0, 102, 1350, 627);
        f.getContentPane().add(panel);
        panel.setLayout(null);
        
        JLabel lblGroupId = new JLabel("Group Id:");
        lblGroupId.setFont(new Font("Georgia", Font.BOLD, 17));
        lblGroupId.setBounds(69, 24, 114, 28);
        panel.add(lblGroupId);
        
        JLabel lblGroupName = new JLabel("Group Name:");
        lblGroupName.setFont(new Font("Georgia", Font.BOLD, 17));
        lblGroupName.setBounds(406, 24, 128, 28);
        panel.add(lblGroupName);
        
        JLabel lblProjectName = new JLabel("Project Name:");
        lblProjectName.setFont(new Font("Georgia", Font.BOLD, 17));
        lblProjectName.setBounds(726, 24, 144, 28);
        panel.add(lblProjectName);
        
        table = new JTable();
        table.setBackground(new Color(240, 255, 240));
        table.setFont(new Font("Georgia", Font.BOLD, 13));
        table.setRowSelectionAllowed(false);
        table.setBorder(new CompoundBorder());
        table.setBounds(69, 50, 967, 295);
        panel.add(table);
        
        try{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		  Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","a" );
	        Statement stmt=con.createStatement();  
	        ResultSet rs;
	        String str=("select G_id,G_name,p_name from groups");
			   rs=stmt.executeQuery(str);
	table.setModel(DbUtils.resultSetToTableModel(rs));
        }
        catch(ClassNotFoundException  |SQLException e)
        {
			
			   JOptionPane.showMessageDialog(null,"No projects found");

        }
        
	}
	public static void main(String[] args,String f_name)
	{
		
		Display_all_project s1=new Display_all_project(f_name);
	}
	
}
