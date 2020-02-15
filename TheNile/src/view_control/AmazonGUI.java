package view_control;
import control_ap_exam.APexam;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;

public class AmazonGUI extends MainMenu{
	public AmazonGUI() {
		getContentPane().setBackground(new Color(255, 255, 255));
		getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setText("Search the Nile");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(25, 25, 112));
		textField.setBounds(40, 10, 354, 23);
		getContentPane().add(textField);
		
		Scrollbar scrollbar = new Scrollbar();
		scrollbar.setBounds(417, 0, 17, 239);
		getContentPane().add(scrollbar);
		
		Panel panel = new Panel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(10, 0, 401, 49);
		getContentPane().add(panel);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("All3qw");
		mntmNewMenuItem.setFont(new Font("Segoe UI", Font.PLAIN, 5));
		mntmNewMenuItem.setBounds(127, 108, 74, 26);
		getContentPane().add(mntmNewMenuItem);
		mntmNewMenuItem.setHorizontalAlignment(SwingConstants.CENTER);
		mntmNewMenuItem.setForeground(new Color(255, 255, 255));
		mntmNewMenuItem.setOpaque(true);
		mntmNewMenuItem.setBackground(new Color(0, 0, 128));
		mntmNewMenuItem.setOpaque(true);
		mntmNewMenuItem.setOpaque(true);
	}
}