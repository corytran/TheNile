package view_control;

import control_ap_exam.APexam;
import java.awt.*;
import javax.swing.*;

public class AmazonGUI extends MainMenu{
	public AmazonGUI() {
		getContentPane().setBackground(Color.DARK_GRAY);
		getContentPane().setLayout(null);
		
		TextField textField = new TextField();
		textField.setText("Search the Nile");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(25, 25, 112));
		textField.setBounds(40, 10, 354, 23);
		getContentPane().add(textField);
	}
}