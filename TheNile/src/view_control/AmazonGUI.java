package view_control;
import control_ap_exam.APexam;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class AmazonGUI extends MainMenu{
	public AmazonGUI() {
		setBounds(100, 100, 800, 660);
		getContentPane().setBackground(new Color(45,45,45));
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 784, 87);
		panel.setBackground(new Color(35,47,62));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnTodaysDeals = new JButton("Today's Deals");
		btnTodaysDeals.setOpaque(true);
		btnTodaysDeals.setForeground(Color.WHITE);
		btnTodaysDeals.setBorderPainted(false);
		btnTodaysDeals.setBackground(new Color(35,47,62));
		btnTodaysDeals.setBounds(89, 49, 150, 27);
		panel.add(btnTodaysDeals);
		
		JButton btnGo = new JButton("Go");
		btnGo.setOpaque(true);
		btnGo.setForeground(Color.WHITE);
		btnGo.setBorderPainted(false);
		btnGo.setBackground(new Color(147,79,1));
		btnGo.setBounds(655, 10, 45, 32);
		panel.add(btnGo);
		
		TextField textField = new TextField();
		textField.setBounds(90, 10, 565, 32);
		panel.add(textField);
		textField.setText("");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(24, 26, 27));
		
		JButton button = new JButton("Today's Deals");
		button.setOpaque(true);
		button.setForeground(Color.WHITE);
		button.setBorderPainted(false);
		button.setBackground(new Color(35,47,62));
		button.setBounds(249, 51, 150, 27);
		panel.add(button);
		
		JButton button_1 = new JButton("Today's Deals");
		button_1.setOpaque(true);
		button_1.setForeground(Color.WHITE);
		button_1.setBorderPainted(false);
		button_1.setBackground(new Color(35,47,62));
		button_1.setBounds(409, 51, 150, 27);
		panel.add(button_1);
		
		JButton button_2 = new JButton("Today's Deals");
		button_2.setOpaque(true);
		button_2.setForeground(Color.WHITE);
		button_2.setBorderPainted(false);
		button_2.setBackground(new Color(35,47,62));
		button_2.setBounds(569, 51, 150, 27);
		panel.add(button_2);
		
		JButton button_3 = new JButton("Cart");
		button_3.setForeground(Color.WHITE);
		button_3.setOpaque(true);
		button_3.setOpaque(false);
		button_3.setContentAreaFilled(false);
		button_3.setBorderPainted(false);
		button_3.setBounds(710, 10, 64, 32);
		panel.add(button_3);
		
	}
}
//looks good on my computer at home