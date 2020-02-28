package view_control;
import control_ap_exam.APexam;
import java.awt.*;
import java.awt.color.*;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.*;
public class TodaysDeals extends MainMenu{
	public TodaysDeals() {
		getContentPane().setBackground(new Color(45,45,45));
		getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		panel.setBounds(0, 0, 631, 87);
		panel.setBackground(new Color(35,47,62));
		getContentPane().add(panel);
		panel.setLayout(null);
		
		JButton btnNewButton = new JButton("New button");
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("hello");
			}
		});
		btnNewButton.setBackground(new Color(35,57,92));
		btnNewButton.setOpaque(true);
		btnNewButton.setBorderPainted(false);
		btnNewButton.setBounds(10, 11, 39, 23);
		panel.add(btnNewButton);
		
		JButton btnClothing = new JButton("Clothing\r\n");
		btnClothing.setOpaque(true);
		btnClothing.setForeground(Color.WHITE);
		btnClothing.setBorderPainted(false);
		btnClothing.setBackground(new Color(35,57,92));
		btnClothing.setBounds(89, 54, 73, 23);
		panel.add(btnClothing);
		
		JButton btnGames = new JButton("Games");
		btnGames.setOpaque(true);
		btnGames.setForeground(Color.WHITE);
		btnGames.setBorderPainted(false);
		btnGames.setBackground(new Color(35,57,92));
		btnGames.setBounds(238, 54, 65, 23);
		panel.add(btnGames);
		
		JButton btnComputers = new JButton("Computers");
		btnComputers.setOpaque(true);
		btnComputers.setForeground(Color.WHITE);
		btnComputers.setBorderPainted(false);
		btnComputers.setBackground(new Color(35,57,92));
		btnComputers.setBounds(313, 54, 85, 23);
		panel.add(btnComputers);
		
		JButton btnTodaysDeals = new JButton("Today's Deals");
		btnTodaysDeals.setOpaque(true);
		btnTodaysDeals.setForeground(Color.WHITE);
		btnTodaysDeals.setBorderPainted(false);
		btnTodaysDeals.setBackground(new Color(35,57,92));
		btnTodaysDeals.setBounds(412, 54, 99, 23);
		panel.add(btnTodaysDeals);
		
		JButton btnBooks = new JButton("Books");
		btnBooks.setOpaque(true);
		btnBooks.setForeground(Color.WHITE);
		btnBooks.setBorderPainted(false);
		btnBooks.setBackground(new Color(35,57,92));
		btnBooks.setBounds(172, 54, 61, 23);
		panel.add(btnBooks);
		
		JButton btnGo = new JButton("Go");
		btnGo.setOpaque(true);
		btnGo.setForeground(Color.WHITE);
		btnGo.setBorderPainted(false);
		btnGo.setBackground(new Color(147,79,1));
		btnGo.setBounds(517, 11, 45, 32);
		panel.add(btnGo);
		
		TextField textField = new TextField();
		textField.setBounds(89, 11, 422, 32);
		panel.add(textField);
		textField.setText("");
		textField.setFont(new Font("SansSerif", Font.PLAIN, 12));
		textField.setForeground(new Color(255, 255, 255));
		textField.setBackground(new Color(24, 26, 27));
		
	}
}
//looks good on my computer at home